package projeto.oo.func.pattern.strategy;

public class CalculoExtraDesenvolvedor extends CalculoExtra {

    @Override
    public Double calcularHoraExtra(Double salario, Integer horasTrabalhadas) {

        Double horaTrabalho = (salario / 30) / 24;
        Double horaExtra = (horaTrabalho * horasTrabalhadas) * 1.2;
        return horaExtra;

    }
}
