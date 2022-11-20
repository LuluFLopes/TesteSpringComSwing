package projeto.oo.func.controller;

import projeto.oo.func.service.CrudEstagiarioService;

public class EstagiarioController {

    private CrudEstagiarioService crudEstagiarioService;

    public EstagiarioController(CrudEstagiarioService crudEstagiarioService) {
        this.crudEstagiarioService = crudEstagiarioService;
    }

}
