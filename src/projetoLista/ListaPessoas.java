package projetoLista;

import java.util.ArrayList;
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
        String continuar;

        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite o sexo (masculino/feminino): ");
            String sexo = sc.nextLine();

            Pessoa p = new Pessoa(nome, sexo);

            if (sexo.equalsIgnoreCase("masculino")) {
                masculino.add(p);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                feminino.add(p);
            } else {
                System.out.println("Sexo inválido! Pessoa não adicionada.");
            }

            System.out.print("Deseja adicionar outra pessoa? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Exibir listas
        System.out.println("\nLista Masculina:");
        for (Pessoa p : masculino) {
            System.out.println(p.getNome());
        }

        System.out.println("\nLista Feminina:");
        for (Pessoa p : feminino) {
            System.out.println(p.getNome());
        }

        sc.close();
    }
}
