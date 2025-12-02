package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carrogenerico> listaCarroGenerico = new ArrayList<>();

        listaCarroGenerico.add(new Carrogenerico("Corolla", "Toyota"));

        for (Carrogenerico carro : listaCarroGenerico) {
            System.out.println(carro);
        }
    }
}
