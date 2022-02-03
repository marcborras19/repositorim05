import java.util.Scanner;

public class Arrays2{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int [] sequencia = new int [6];
    int k = 0;
    

    
    
    for (int i = 0; i<6; i++) {
        sequencia[i] = sc.nextInt();
    }

    int numero = sc.nextInt();

    while (k<6) {
        if(sequencia[k] == numero) {
            System.out.println("S'ha trobat el número a la posició: " + (k +1));
            break;
        }
        k++; 
    }
    if(k==6){
        System.out.println("No sha trobat el número");
    }
    }
}