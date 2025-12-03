package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarrosGenericos> listaCarros = new ArrayList<>();

        listaCarros.add(new Honda("civic"));
        listaCarros.add(new Fiat("Argo"));

        for (CarrosGenericos carro : listaCarros) {
            System.out.println(carro);
        }
    }


}
