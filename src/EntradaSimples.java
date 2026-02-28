import java.util.*;

public class EntradaSimples {
    public static void main (String[] args){ 
        System.out.print("Digite seu nome: ");

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();

        System.out.println("Olá " + nome);
    }

}
