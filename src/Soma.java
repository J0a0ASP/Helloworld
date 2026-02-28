import java.util.Scanner;

public class Soma{

     public static void main (String[] args){ 
        System.out.print("Insira dois valores: ");
    
        Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    int num1 = entrada.nextInt();

    System.out.print("Digite o segundo valor: ");
    int num2 = entrada.nextInt();

    int soma = num1 + num2;

    System.out.print("A soma dois dois números é igual a: "+ soma);

     }

     }