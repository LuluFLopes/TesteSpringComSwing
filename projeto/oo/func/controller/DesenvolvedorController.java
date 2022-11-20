package projeto.oo.func.controller;

import projeto.oo.func.service.CrudDesenvolvedorService;

public class DesenvolvedorController {

    private CrudDesenvolvedorService crudDesenvolvedorService;

    public DesenvolvedorController(CrudDesenvolvedorService crudDesenvolvedorService) {
        this.crudDesenvolvedorService = crudDesenvolvedorService;
    }

}
