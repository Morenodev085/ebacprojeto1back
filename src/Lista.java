import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

    // Criamos listas estáticas fora dos métodos
    static List<Pessoa> masculinas = new ArrayList<>();
    static List<Pessoa> femininas = new ArrayList<>();

    // Classe interna para representar uma pessoa
    static class Pessoa {
        private String nome;
        private String sexo;

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
        entradas();
        mostrarListas();
    }

    public static void entradas() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu sexo (masculino/feminino): ");
        String sexo = input.nextLine();

        Pessoa p = new Pessoa(nome, sexo);

        if (sexo.equalsIgnoreCase("masculino")) {
            masculinas.add(p);
        } else if (sexo.equalsIgnoreCase("feminino")) {
            femininas.add(p);
        } else {
            System.out.println("Sexo inválido. Pessoa não adicionada.");
        }

        input.close();
    }

    public static void mostrarListas() {
        System.out.println("\n--- Lista de Pessoas Masculinas ---");
        for (Pessoa p : masculinas) {
            System.out.println("Nome: " + p.getNome());
        }

        System.out.println("\n--- Lista de Pessoas Femininas ---");
        for (Pessoa p : femininas) {
            System.out.println("Nome: " + p.getNome());
        }
    }
}
