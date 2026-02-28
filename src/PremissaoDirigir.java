import java.util.Scanner;

public class PremissaoDirigir{

     public static void main (String[] args){ 
        System.out.println("Digite sua idade: ");

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if (idade>17){
                System.out.println("Pode dirigir!");
        }else{
                System.out.println("Não pode dirigir! Vai de ônibus");
        }

     }
}