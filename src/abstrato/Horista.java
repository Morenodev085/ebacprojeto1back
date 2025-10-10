package abstrato;

public class Horista extends Empregado{
    private double precoHora;

    private double horaTrabalhada;

    @Override
    public Double vencimento() {
        return precoHora*horaTrabalhada;
    }
}
