package TurkcellStaj;


// Final vs static key word

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/*





 */
public class FinalvsStatic  {
    static int a=5;
//    objenin değil direk o clasın bir nesnesi obje ile de çagıraiblir ama o klaıns olduğu içn her yerde kullanabilrisin


    public static void main() {

        System.out.println(a);


    }

}

 final class ergutlar {
    private final String Soy;
     final void Show(){
         System.out.println("final mehto yazıbailbr");
     }

    public ergutlar(String soy) {

        Soy = soy;
    }
// immmutable oldu herhangi bir şekilde dğeiştirelimez extend edilemez
     public String getSoy() {
         return Soy;
     }
 }

// public  class mustafa extends ergutlar
