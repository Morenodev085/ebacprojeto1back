package generics;

public class Carrogenerico {

    private String modelo;
    private String marca;

    public Carrogenerico(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
