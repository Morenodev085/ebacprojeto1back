package Agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    // Construtor
    public Venda() {
        this.produtos = new ArrayList<>();
    }

    // Getters e Setters
    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // Adicionar produto à venda
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    // Concretizar venda
    public void concretizarVenda() {
        if (comprador == null || vendedor == null || produtos.isEmpty()) {
            System.out.println("Venda não pode ser concretizada: informações incompletas!");
            return;
        }

        System.out.println("Venda concretizada por: " + this.comprador.getNome());
        for (Produto produto : this.produtos) {
            System.out.println("Comprou o item: " + produto.getNome() + " por R$" + produto.getPreco());
        }
        System.out.println("Vendedor responsável: " + this.vendedor.getNome());
    }

    // Cancelar venda
    public void cancelarVenda() {
        System.out.println("Venda cancelada");
        this.produtos.clear(); // Limpa os produtos, opcional
    }
}
