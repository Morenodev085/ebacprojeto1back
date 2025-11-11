package Modulo15.Carro;

public class CarroLuxo implements Carro {
    protected  String modelo;

    public CarroLuxo(){
        this.modelo= modelo;
    }
    @Override
    public void carroEscolhido() {
        System.out.println("Carro de luxo Escolhido");
    }
}
