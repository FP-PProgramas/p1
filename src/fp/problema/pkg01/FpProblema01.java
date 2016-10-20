
package fp.problema.pkg01;
import java.util.*;

public class FpProblema01 {

    public static void main(String[] args) {
     int a;
     Scanner entradaDato= new Scanner(System.in);
        System.out.println("Introduce un año");
        a= entradaDato.nextInt();
        if((a%4== 0) && (a%100 !=0) || (a%400==0)){
            System.out.println("El año SI es bisiesto");
        }else{
            System.out.println("El año NO es bisiesto");
        }
    }
    
}
