import java.util.Scanner;

public class App {
    public static void ImparPar (int numero) {
         Scanner sc = new Scanner(System.in);
System.out.println("digite um numero inteiro: ");
        numero = sc.nextInt();
        if (numero %2 == 0){
            System.out.println("esse numero é par");
        }
        else {
            System.out.println("numero impar");
        }
    }
    public static void main(String[] args) throws Exception {
       ImparPar(0);
       
       

    }
}
