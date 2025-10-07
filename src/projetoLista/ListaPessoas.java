package projetoLista;

import java.util.ArrayList;
import java.util.Collections;
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

        // Passo 2: Separar em masculino e feminino
        for (Pessoa p : listaGeral) {
            if (p.getSexo().equalsIgnoreCase("masculino")) {
                masculino.add(p);
            } else if (p.getSexo().equalsIgnoreCase("feminino")) {
                feminino.add(p);
            } else {
                System.out.println("Sexo inválido para " + p.getNome() + "!");
            }
        }

        // Passo 3: Ordenar cada lista em ordem alfabética
        masculino.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
        feminino.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));

        // Passo 4: Transformar listas em strings separadas por vírgula
        String listaMasculino = String.join(", ", masculino.stream().map(Pessoa::getNome).toArray(String[]::new));
        String listaFeminino = String.join(", ", feminino.stream().map(Pessoa::getNome).toArray(String[]::new));

        // Passo 5: Exibir as listas
        System.out.println("\nLista Masculina: " + listaMasculino);
        System.out.println("Lista Feminina: " + listaFeminino);

        sc.close();
    }
}
