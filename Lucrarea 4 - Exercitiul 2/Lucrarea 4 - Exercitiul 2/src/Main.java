import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args)
    {
        int numar,incercari=0,ok=0;
        System.out.println("Ghiciti numarul generat aleatoriu de la 0 la 25: ");
        Scanner inputDevice=new Scanner(System.in);
        Random rand= new Random();
        int numar_random=rand.nextInt(26);
        while(ok==0)
        {
            numar=inputDevice.nextInt();
            if (numar > numar_random) {
                System.out.println("Nu ati ghicit! Numarul ales este mai mare decat cel generat.\nIncercati din nou: ");
                incercari++;
            }
            if (numar < numar_random) {
                System.out.println("Nu ati ghicit! Numarul ales este mai mic decat cel generat.\nIncercati din nou: ");
                incercari++;
            }
            if (numar == numar_random) {
                System.out.println("Felicitari! Ati ghicit numarul generat. Acesta este " + numar_random + ".");
                incercari++;
                ok=1;
            }
        }
        System.out.println("\nNumar de incercari: "+incercari+".");
    }

}