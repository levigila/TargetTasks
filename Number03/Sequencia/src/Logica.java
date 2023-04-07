import java.lang.reflect.Array;

public class Logica  {
    public static void main(String[] args) throws Exception {
       // Letra A
        int n = 4;
        int ultimoNumero6 = 7;
        int proximoNumero6 = ultimoNumero6 + n/2;
        System.out.println(proximoNumero6); // resultado: 9
        System.out.println();  

        // Letra B
        int n2 = 6;
        int ultimoNumero2 = 64;
        int proximoNumero2 = ultimoNumero2 * 2;
        System.out.println(proximoNumero2); // resultado: 128
        System.out.println();  

        // Letra C
        int n3 = 7;
        int proximoNumero3 = n3*n3;
        System.out.println(proximoNumero3); // resultado: 49
        System.out.println(); 

        // Letra D
        int[] sequencia = {4, 16, 36, 64}; // Definir a sequência como um array
        int diff = sequencia[3] - sequencia[2]; // Calcular a diferença entre os termos 3 e 2
        int novarazao = (diff + 8); // Calculando a nova razão para a soma com o próximo número 
        int proximoNumero4 = sequencia[3] + (novarazao); // Calcular o próximo número na sequência
        System.out.println(proximoNumero4); // Imprimir o próximo número, 100.
        System.out.println();

        // Letra E
        int a = 5;
        int b = 8;
        int proximoNumero5 = a + b;
        System.out.println(proximoNumero5); // resultado: 13
        System.out.println();

        // Letra F
        double[] numerosD = {2, 10, 12, 16, 17, 18, 19, 200};
        var proximoNum = numerosD.length - 1; // o tamanho é 8, que subtraindo 1, fica 7.
              
        System.out.println("O próximo número na sequência é " + numerosD[proximoNum]); 
        // buscando o valor da posição 7 (200)
            
        }
          
    }

