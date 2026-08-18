import java.util.Scanner;

public class Soma {

    public static void main(String[]args){

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa Soma");
        System.out.println("Digite o Primeiro Numero");
        int numero1 = entradaDados.nextInt();
        System.out.println("Digite o Segundo Numero");
        int numero2 = entradaDados.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma é :"+soma);
    }
}
