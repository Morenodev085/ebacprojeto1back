package Modulo15.Fabrica;

import Modulo15.Carro.Carro;
import Modulo15.Carro.CarroLuxo;

public class CarroLuxoFactory implements FabricaCarros {



    @Override
    public Carro criarCarro() {
        return  new CarroLuxo();
    }
}
