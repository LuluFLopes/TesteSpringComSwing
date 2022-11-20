package projeto.oo.func.controller;

import projeto.oo.func.service.CrudGerenteService;

public class GerenteController {

    private CrudGerenteService crudGerenteService;

    public GerenteController(CrudGerenteService crudGerenteService) {
        this.crudGerenteService = crudGerenteService;
    }

}
