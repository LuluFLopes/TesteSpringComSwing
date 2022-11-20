package projeto.oo.func.pattern.strategy;

import java.sql.SQLOutput;

public abstract class CalculoExtra implements Strategy {

    @Override
    public abstract Double calcularHoraExtra(Double salario, Integer horasTrabalhadas);


}
