package interfacas;

public class CarroGrande  implements ICarro{

    @Override
    public void ligar() {
        System.out.println("VRUMM");
    }

    @Override
    public void desligar() {
    System.out.println("NOT VRUMM");
    }
}
