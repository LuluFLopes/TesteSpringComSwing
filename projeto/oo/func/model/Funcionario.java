package projeto.oo.func.model;

import projeto.oo.func.pattern.strategy.CalculoExtra;
import projeto.oo.func.pattern.strategy.CalculoExtraDesenvolvedor;
import projeto.oo.func.pattern.strategy.CalculoExtraGerente;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;
    private String cargo;

    private String stategia;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public void capturaStrategia(String stategia) {

        CalculoExtra instancia = null;

        if (stategia.equalsIgnoreCase("Desenvolvedor")) {
             instancia   = (CalculoExtraDesenvolvedor) new CalculoExtraDesenvolvedor();
        } else if (stategia.equalsIgnoreCase("Gerente")) {
             instancia  =  (CalculoExtraGerente) new CalculoExtraGerente();
        } else {
            return;
        }

        setSalario(getSalario() + instancia.calcularHoraExtra(getSalario(), 5));

    }
    
    public void calculaBonus(){
        setSalario(getSalario() * 1.2);
    }


    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getStategia() {
        return stategia;
    }
}
