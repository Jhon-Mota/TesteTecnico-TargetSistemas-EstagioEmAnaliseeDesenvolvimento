import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício: Fibonnaci\n\nDigite um número: ");
        
        int number = scanner.nextInt(); //OBS: será lançada uma exceção caso coloque um tipo de valor diferente de int.
       
        //Definindo o tamanho do array.
        int[] fibonacci = new int[34];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        //Bloco try catch para verificar se, ao inserir valores, não cause a exceção IndexOutOfBoundsException (isso aconteceria se o código fosse alterado).
        try {
            for (int i = 2; i < number; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        } catch (Exception e) {
            System.err.println("Exceção lançada. O número escolhido é muito grande em relação ao tamanho do array." +
            "\nSolução: digite um número menor ou aumente o tamanho do array\nA aplicação será encerrada.\nExceção:" + e);
            System.exit(0);
        }
        
        //Variável para informar se o número escolhido está na sequência.
        boolean found = false;
        //Método que lista a sequência e muda o valor da variável "found", se necessário.
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);

            if (fibonacci[i] == number) {
                found = true;
                break;
            }
        }

        //if e else que informa se o número escolhido faz parte da sequência ou não.
        if (found == true) {
            System.out.println("O número informado faz parte da sequência");
        } else {
            System.out.println("O número não faz parte da sequência.");
        }

        scanner.close();
        

    }
        
}
