import java.util.Scanner;

public class LoginUsuario {

  public static void main(String[] args) {
    //TODO: CRIE UM ALGORITMO QUE FAÇA A VALIDAÇÃO DE LOGIN PARA UM USUARIO. x

    String usuarioCorreto = "rogerinho";
    String senhaCorreta = "1234@";

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu usuario");
    String usuarioInserido = scanner.next();

    System.out.println("Digite sua senha");
    String senhaInserida = scanner.next();

    if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)){
      System.out.println("Acesso permitido, dados corretos");
    }else {
      System.out.println("Acesso invalido!");
    }
  }
}
