import java.util.Scanner;


public class ContaTerminal {

    //Atributos
    private String nome;
    private String numAgencia;
    private int numConta;
    private double saldo;

    public ContaTerminal(String nome, String numAgencia, int numConta){
        this.nome = nome;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = 237.48;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome! ");
            String nome = sc.nextLine();

        System.out.println("Por favor digite o número de sua Agência! ");
             String numAgencia = sc.nextLine();

        System.out.println("Por favor digite o número de sua Conta! ");
            int numConta = sc.nextInt();

        ContaTerminal conta = new ContaTerminal(nome, numAgencia, numConta);

        System.out.println("Olá " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.numAgencia + ", conta " + conta.numConta + " e seu saldo " + conta.saldo + " já está disponível para saque");

    }
}
