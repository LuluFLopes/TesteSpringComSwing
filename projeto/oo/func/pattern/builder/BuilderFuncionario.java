package projeto.oo.func.pattern.builder;

import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.model.Estagiario;
import projeto.oo.func.model.Funcionario;
import projeto.oo.func.model.Gerente;

public class BuilderFuncionario {

    private Gerente gerente;
    private Estagiario estagiario;
    private Desenvolvedor desenvolvedor;

    public Funcionario criaFuncionario(String cargo) {

        if (cargo.equalsIgnoreCase("Gerente")) {
            return new Gerente();
        } else if (cargo.equalsIgnoreCase("Estagiario")) {
            return new Estagiario();
        } else if (cargo.equalsIgnoreCase("Desenvolvedor")) {
            return new Desenvolvedor();
        }
        return null;
    }

}
