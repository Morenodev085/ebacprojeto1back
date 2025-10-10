package Agregacao;

public class Programa {
    public static void main(String[] args) {
        Produto pTV = criarProduto(1L, 10d, "TV");
        Produto pAr = criarProduto(2L, 13d, "Ar Condicionado");

        Vendedor vendedor = criarVendedor("Rodrigo", 10);
        Comprador comprador = criarComprador("Anna", 15d);

        // ✅ Criar a venda com lista de produtos
        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.adicionarProduto(pTV);
        venda.adicionarProduto(pAr);

        // Exibir o valor total da venda
        System.out.println("Valor total da venda: R$" + venda.calcularValorTotal());
    }

    private static Comprador criarComprador(String nome, Double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        Vendedor.setNome(nome);
        Vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(long codigo, Double valor, String nome) {
        Produto p = new Produto();
        p.setCodigo(codigo);
        p.setPreco(valor);
        p.setNome(nome);
        return p;
    }
}
