package Agregacao;

import Agregacao.vendedor;

import java.util.ArrayList;
import java.util.List; // ✅ Import necessário


public class Venda {
    private Comprador comprador;
    private vendedor vendedor;
    private List<Produto> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretezarVenda () {
        System.out.println("Venda concreta! por" + this.comprador.getNome());
        for (Produto produto : this.produtos) {
                    System.out.println("compros pos itens" + produtos.getName());
        }
        System.out.println("Venda concreta! por" + this.vendedor.getNome());
    }

    public void cancelarVenda() {
    System.out.println("Venda cancelada");
    }
}
