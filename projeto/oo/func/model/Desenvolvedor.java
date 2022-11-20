package projeto.oo.func.model;

import javax.persistence.*;

@Entity
public class Desenvolvedor extends Funcionario implements HoraExtra {

    public Desenvolvedor(String nome, int idade, double salario, String cargo) {
        super(nome, idade, salario, cargo);
    }

    public Desenvolvedor() {
    }

    @Override
    public void calculaBonus() {
        super.calculaBonus();
    }

    @Override
    public void calculaHoraExtra(int horas) {
        setSalario(getSalario() + (((getSalario() / 30) / 24) * horas));
    }
    
    
    
}
