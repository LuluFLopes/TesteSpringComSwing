package projeto.oo.func.model;

/**
 *
 * @author luciano.flopes
 */
public class ImprimeCargo {

    public void imprimeCargo(Funcionario f) {
        System.out.println("O cargo do funcionario " + f.getNome() + " é: " + f.getCargo());
    }

}
