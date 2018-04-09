
import java.util.Scanner;


public class MainInversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String str = entrada.nextLine();
        
        Inversao p = new Inversao(str.length());
        
        for (int i = 0; i < str.length(); i++) {
            p.push(str.charAt(i));
        }
        
        while(!p.isEmpty()){
            System.out.print(p.pop());
        }
        
        
    }

}
