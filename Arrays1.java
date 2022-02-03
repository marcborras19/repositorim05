import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
    
         int i = 0;
         System.out.println("Escriu un número:");
         int entrada = sc.nextInt();

         while(i<6){
            System.out.println ("Entra els 6 numeros");
            int llegit = sc.nextInt();

            if(entrada == llegit) {
            System.out.println("S'ha trobat el número a la posició: " + (i +1));
            break;
            }
            i++;
        } 
      if (i == 6){
        System.out.println("No s'ha trobat el número");
      }
    }
    
}