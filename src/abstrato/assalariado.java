package abstrato;

public class assalariado extends Empregado{
    private Double salario;

    @Override
    public Double vencimento() {
        return salario;
    }
}
