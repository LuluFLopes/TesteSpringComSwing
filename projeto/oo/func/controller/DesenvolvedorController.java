package projeto.oo.func.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.service.CrudDesenvolvedorService;

public class DesenvolvedorController {

    private CrudDesenvolvedorService crudDesenvolvedorService;

    public DesenvolvedorController(CrudDesenvolvedorService crudDesenvolvedorService) {
        this.crudDesenvolvedorService = crudDesenvolvedorService;
    }

    public DesenvolvedorController(){
        
    }
    
    public void salvar(String nome, Integer idade, Double salario, String cargo) {

        Desenvolvedor desenvolvedor = new Desenvolvedor();

        desenvolvedor.setNome(nome);
        desenvolvedor.setIdade(idade);
        desenvolvedor.setSalario(salario);
        desenvolvedor.setCargo(cargo);

        crudDesenvolvedorService.salvar(desenvolvedor);
        
    }

}
