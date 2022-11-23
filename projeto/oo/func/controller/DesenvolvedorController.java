package projeto.oo.func.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.pattern.builder.BuilderFuncionario;
import projeto.oo.func.repository.DesenvolvedorRepository;
import projeto.oo.func.service.CrudDesenvolvedorService;
import projeto.oo.func.testeInjecao.DesenvolvedorDto;
import projeto.oo.func.testeInjecao.DesenvolvedorForm;

import java.net.URI;

@RestController
@RequestMapping("/teste")
public class DesenvolvedorController {

    @Autowired
    private CrudDesenvolvedorService crudDesenvolvedorService;
    @Autowired
    private DesenvolvedorRepository desenvolvedorRepository;

    private BuilderFuncionario builderFuncionario = new BuilderFuncionario();

    @PostMapping
    public ResponseEntity<DesenvolvedorDto> salvar(@RequestBody DesenvolvedorForm form, UriComponentsBuilder uriBuilder) {

        Desenvolvedor desenvolvedor = form.converter(desenvolvedorRepository);
        crudDesenvolvedorService.salvar(desenvolvedor);
        URI uri = uriBuilder.path("/teste/{id}").buildAndExpand(desenvolvedor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DesenvolvedorDto(desenvolvedor));

    /*
    Teste do Postman
    {
    "id": 1,
    "nome": "Teste",
    "idade": 20,
    "salario": 2000.00,
    "cargo": "aprendiz",
    "strategia":"desenvolvedor"
    }
    */

    }

    // Teste com a interação das telas.

    public void salvar (String nome, Integer idade, Double salario, String cargo) {

        Desenvolvedor desenvolvedor = (Desenvolvedor) builderFuncionario.criaFuncionario("Desenvolvedor");
        desenvolvedor.setNome(nome);
        desenvolvedor.setIdade(idade);
        desenvolvedor.setSalario(salario);
        desenvolvedor.setCargo(cargo);
        crudDesenvolvedorService.salvar(desenvolvedor);

    }




}
