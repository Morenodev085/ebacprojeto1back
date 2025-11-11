package Modulo15.Fabrica;

import Modulo15.Carro.Carro;
import Modulo15.Carro.CarroEconomico;

public abstract class CarroEconomicoFactory implements FabricaCarros {

    public Carro createCarro() {
        return new CarroEconomico();
    }
}
