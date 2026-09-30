import java.util.Scanner;
import java.util.InputMismatchException;
public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public void setSenha(String senhaInserida) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite sua nova senha:\n");
        senhaInserida = scanner.nextLine();
        senha = senhaInserida;
        scanner.close();
    }

    public boolean fazerLogin(String usuarioInserido, String senhaInserida) {
        boolean estadoLogin = false;
        while(!estadoLogin){
            try {
                if (senha.equals(senhaInserida) && usuario.equals(usuarioInserido)) {
                    estadoLogin=true;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Erro! Usuário ou senha incorretos");
            }
        }
        return estadoLogin;
    }
}
