
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Bem-vindo ao nosso banco!");
        System.out.println("Vamos criar sua conta. Você precisará informar alguns dados e adicionar um saldo inicial.");
        System.out.println();

        
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

         
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Adicione um saldo à sua nova conta:");
        double saldo = scanner.nextDouble();

        
        String mensagem = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ")
        .concat(String.valueOf(numero))
        .concat(" e seu saldo ")
        .concat(String.valueOf(saldo))
        .concat(" já está disponível para saque.");

        System.out.println();
        System.out.println(mensagem);
        scanner.close();
    }
}
