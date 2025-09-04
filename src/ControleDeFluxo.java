import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota da Av1: ");
        int nota1 = leitor.nextInt();
        System.out.println("A nota do aluno na Av1: " + nota1);

        System.out.print("Digite a nota da Av2: ");
        int nota2 = leitor.nextInt();
        System.out.println("A nota do aluno na Av2: " + nota2);

        System.out.print("Digite a nota da Av3: ");
        int nota3 = leitor.nextInt();
        System.out.println("A nota do aluno na Av3: " + nota3);

        leitor.close();

        int soma = nota1 + nota2 + nota3;
        int media = soma / 3;
        System.out.println("A média final do aluno é: " + media);

        if (media > 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 5 && media <= 6) {
            System.out.println("O aluno está de recuperação.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }\

    }
}
