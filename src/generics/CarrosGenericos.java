package generics;

public abstract class CarrosGenericos {
    private String marca;
    private String modelo;

    // Construtor
    public CarrosGenericos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos acessores
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Facilita a impressão do objeto
    @Override
    public String toString() {
        return "Marca: " + marca + " - Modelo: " + modelo;
    }
}
