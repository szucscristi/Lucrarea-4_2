import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Numerele perfecte de la 1 la 1000: \n");
        for(int i=1;i<=1000;i++)
        {
            if(divizori(i)==i)
                System.out.println("Numarul "+i+" este numar perfect ");
        }
    }
    public static int divizori(int x)
    {
        int suma=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0 && x!=i)
                suma=suma+i;
        }
        return suma;
    }

}