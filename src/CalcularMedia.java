import java.util.Scanner;

public class CalcularMedia {

  //TODO: Crie um algoritmo que peça tres notas para um aluno e mostre a media na tela. x


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua primeira nota");
    int notaum = scanner.nextInt();
    System.out.println("Digite sua segunda nota");
    int notadois = scanner.nextInt();
    System.out.println("Digite sua terceira nota");
    int notatres = scanner.nextInt();

    double media = (notaum + notadois + notatres) / 3;

    System.out.println("A media e " + media);
  }
}
