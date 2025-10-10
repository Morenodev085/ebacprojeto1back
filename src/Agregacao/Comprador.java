package Agregacao;

public class Comprador {
    private Double verba;

    public Comprador(String nome, Double verba) {
        this.verba = verba;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;



    private void comprar(){
        System.out.println("O comprador foi carregado com sucesso!");
    };


    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }
}
