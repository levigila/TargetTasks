import java.util.Scanner;
public class reverse {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lê a string do usuário
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        // converte a string para um array de caracteres
        char[] charArray = str.toCharArray();

        // inverte os caracteres do array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // converte o array de volta para a string
        String strInvertida = new String(charArray);

        // imprime a string invertida
        System.out.println("String invertida: " + strInvertida);
    }
}
