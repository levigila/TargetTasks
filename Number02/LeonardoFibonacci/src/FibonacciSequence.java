import java.util.Scanner;
    
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // solicitar ao usuário o limite da sequência de Fibonacci
        System.out.print("Digite o limite da sequência de Fibonacci: ");
        int limit = input.nextInt();

        // gerar a sequência de Fibonacci
        int firstNum = 0, secondNum = 1, nextNum = 0;
        System.out.print("A sequência de Fibonacci até " + limit + " é: ");
        while (firstNum <= limit) {
            System.out.print(firstNum + " ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

        // solicitar ao usuário o número a ser verificado
        System.out.print("\nDigite um número para verificar se ele pertence à sequência: ");
        int number = input.nextInt();

        // verifique se o número pertence à sequência de Fibonacci
        boolean isFibonacci = false;
        firstNum = 0; secondNum = 1;
        while (secondNum <= number) {
            if (secondNum == number) {
                isFibonacci = true;
                break;
            }
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

        // exibir o resultado
        if (isFibonacci) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }
}
    

