import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algo para ser invertido (palavras ou frases).");
        String word = scanner.nextLine();
        String reverseWord = "";

        for (int i = 0; i < word.length(); i++) {
            reverseWord = word.charAt(i) + reverseWord;
        }

        System.out.println(reverseWord);

        scanner.close();
    }
}
