
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            //Criando as variaveis
            try ( //Criando o objeto pra scanner
                    Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                //Criando as variaveis
                System.out.println("Digite seu nome ");
                String nome = scanner.nextLine();
                
                System.out.println("Digite seu sobrenome ");
                String sobrenome = scanner.nextLine();
                
                System.out.println("Digite sua idade");
                int idade = scanner.nextInt();
                
                System.out.println("Digite sua altura");
                double altura = scanner.nextDouble();
                
                System.out.println("Ola, me chamo" + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " ");
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("E minha altura é " + altura + "m");
            }
        }catch(InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser numericos");
        }
        
        }
}
