package abstrato;

public class comissionado extends Empregado {
    private Double ToatalVenda;
    private Double TotalComissao;

    @Override
    public Double vencimento() {
        return ToatalVenda*TotalComissao;
    }
}
