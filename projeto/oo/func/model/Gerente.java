package projeto.oo.func.model;

import javax.persistence.*;

@Entity
public class Gerente extends Funcionario implements HoraExtra {

    public Gerente(String nome, int idade, double salario, String cargo) {
        super(nome, idade, salario, cargo);
    }

    public Gerente() {
    }

    @Override
    public void calculaBonus() {
        setSalario(getSalario() * 1.4);
    }

    @Override
    public void calculaHoraExtra(int horas) {
        setSalario(getSalario() + (((getSalario() / 30) / 24) * horas));
    }

}
