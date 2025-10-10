import interfacas.CarroGrande;
import interfacas.ICarro;

public class Teste {

    public static void main(String[] args) {
        ICarro carro = new CarroGrande();
        carro.ligar();
        carro.desligar();
    }
}
