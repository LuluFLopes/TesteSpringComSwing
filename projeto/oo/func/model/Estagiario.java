package projeto.oo.func.model;

import javax.persistence.*;

@Entity
public class Estagiario extends Funcionario {

    public Estagiario(String nome, int idade, double salario, String cargo) {
        super(nome, idade, salario, cargo);
    }

    public Estagiario() {
    }

    @Override
    public void calculaBonus() {
        setSalario(getSalario() * 1.05);
    }
    
}
