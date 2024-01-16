import java.util.Scanner;

public class CalcularMediaAprovadoOuReprovado {

  public static void main(String[] args) {
    //TODO: Peça a um aluno três notas e com base na media, mostre se o mesmo está APROVADO, RECUPERAÇÃO OU REPROVADO. X
    // media >=6 ELE ESTÁ APROVADO
    // media ==5 ELE ESTÁ DE RECUPERAÇÃO
    // se a media não for nem maior ou igual a 6 ou igual a 5 ELE ESTÁ REPROVADO.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua primeira nota");
    int notaum = scanner.nextInt();
    System.out.println("Digite sua segunda nota");
    int notadois = scanner.nextInt();
    System.out.println("Digite sua terceira nota");
    int notatres = scanner.nextInt();

    int media = (notaum + notadois + notatres) / 3;

    if (media >= 6) {
      System.out.println("APROVADO! SUA MEDIA E " + media);
    } else if (media == 5) {
      System.out.println("RECUPERACAO! SUA MEDIA E " + media);
    }else{
      System.out.println("REPROVADO! SUA MEDIA E " + media);
    }
  }
}
