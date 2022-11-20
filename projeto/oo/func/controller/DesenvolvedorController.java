package projeto.oo.func.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.pattern.builder.BuilderFuncionario;
import projeto.oo.func.repository.DesenvolvedorRepository;
import projeto.oo.func.service.CrudDesenvolvedorService;

public class DesenvolvedorController {

    @Autowired
    private CrudDesenvolvedorService crudDesenvolvedorService;
    private BuilderFuncionario builderFuncionario = new BuilderFuncionario();

    public void salvar(String nome, Integer idade, Double salario, String cargo) {

        Desenvolvedor desenvolvedor = (Desenvolvedor) builderFuncionario.criaFuncionario("Desenvolvedor");

        desenvolvedor.setNome(nome);
        desenvolvedor.setIdade(idade);
        desenvolvedor.setSalario(salario);
        desenvolvedor.setCargo(cargo);

        crudDesenvolvedorService.salvar(desenvolvedor);
        
    }

}
