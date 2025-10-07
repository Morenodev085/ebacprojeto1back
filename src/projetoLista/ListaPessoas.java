package projetoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListaPessoas {

    static List<Pessoa> masculino = new ArrayList<>();
    static List<Pessoa> feminino = new ArrayList<>();

    static class Pessoa {
        String nome;
        String sexo;

        public Pessoa(String nome, String sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public String getSexo() {
            return sexo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> listaGeral = new ArrayList<>();
        String continuar;

        // Passo 1: Adicionar pessoas
        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo (masculino/feminino): ");
            String sexo = sc.nextLine();

            listaGeral.add(new Pessoa(nome, sexo));

            System.out.print("Deseja adicionar outra pessoa? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Passo 2: Ordenar a lista geral em ordem alfabética
        Collections.sort(listaGeral, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
        });

        // Passo 3: Separar em masculino e feminino
        for (Pessoa p : listaGeral) {
            if (p.getSexo().equalsIgnoreCase("masculino")) {
                masculino.add(p);
            } else if (p.getSexo().equalsIgnoreCase("feminino")) {
                feminino.add(p);
            } else {
                System.out.println("Sexo inválido para " + p.getNome() + "!");
            }
        }

        // Passo 4: Transformar listas em strings separadas por vírgula
        String listaMasculino = String.join(", ", masculino.stream().map(Pessoa::getNome).toArray(String[]::new));
        String listaFeminino = String.join(", ", feminino.stream().map(Pessoa::getNome).toArray(String[]::new));

        System.out.println("\nLista Masculina: " + listaMasculino);
        System.out.println("Lista Feminina: " + listaFeminino);

        sc.close();
    }
}
