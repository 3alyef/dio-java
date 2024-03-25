import java.util.Scanner;

public class ContaTerminal {
    int number;
    String agency;
    String clientName;
    double behance;


    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.contaFunctions();
    }

    public void contaFunctions(){
        this.number = Integer.parseInt(question("Por favor, digite o número da sua conta", false));

        this.agency = question("Por favor, digite o número de sua agência", false);

        this.clientName = question("Por favor, informe seu nome completo", true);

        this.behance = 10D;

        exibir(this.number, this.agency, this.clientName, this.behance);
    }

    public static String question(String message, boolean isEnd){
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + ":");
        input = scanner.nextLine();

        if(isEnd){
            scanner.close();
        }

        return input;
    }

    public static void exibir(int number, String agency, String clientName, double behance){
        System.out.println("Olá " + clientName +", obrigado por criar uma conta em nosso banco, sua agência é "+ agency +", conta "+ number +" e seu saldo " + behance + " já está disponível para saque...");
    }
}
