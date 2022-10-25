import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        char x;
        int raspunsuri_corecte=0,raspunsuri_gresite,procent=0;
        Scanner inputDevice= new Scanner(System.in);
        System.out.print("| Quiz - Tari si capitale |\nRaspunsul se va da introducand litera corespunzatoare dupa intrebare.\nExemplu: Bucuresti este capitala Romaniei?\na.Da\nb.Nu\nRaspuns: a\n");
        System.out.print("1.Care este capitala Letoniei?: \na.Riga\nb.Vilnius\nc.Vaduz\nd.Monaco\nRaspuns: ");
        x=inputDevice.next().charAt(0);
        switch(x)
        {
            case 'a':
                raspunsuri_corecte++;
                System.out.print("Felicitari! Ati raspuns corect la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'b':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'c':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'd':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
        }
        System.out.print("\n2.Care este capitala Serbiei?: \na.Bratislava\nb.Berna\nc.Belgrad\nd.Oslo\nRaspuns: ");
        x=inputDevice.next().charAt(0);
        switch(x)
        {
            case 'a':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'b':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'c':
                raspunsuri_corecte++;
                System.out.print("Felicitari! Ati raspuns corect la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'd':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
        }
        System.out.print("\n3.Care este capitala Cehiei?: \na.Monaco\nb.Amsterdam\nc.Lisabona\nd.Praga\nRaspuns: ");
        x=inputDevice.next().charAt(0);
        switch(x)
        {
            case 'a':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'b':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'c':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'd':
                raspunsuri_corecte++;
                System.out.print("Felicitari! Ati raspuns corect la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
        }
        System.out.print("\n4.Care este capitala Poloniei?: \na.Varsovia\nb.Ljubljana\nc.Chisinau\nd.Copenhaga\nRaspuns: ");
        x=inputDevice.next().charAt(0);
        switch(x)
        {
            case 'a':
                raspunsuri_corecte++;
                System.out.print("Felicitari! Ati raspuns corect la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'b':
                System.out.print("Ati raspuns gresit la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'c':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'd':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
        }
        System.out.print("\n5.Care este capitala Spaniei?: \na.Berna\nb.Madrid\nc.Ankara\nd.Vatican\nRaspuns: ");
        x=inputDevice.next().charAt(0);
        switch(x)
        {
            case 'a':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'b':
                raspunsuri_corecte++;
                System.out.print("Felicitari! Ati raspuns corect la intrebare.\nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'c':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
            case 'd':
                System.out.print("Ati raspuns gresit la intrebare. \nRaspunsuri corecte: "+raspunsuri_corecte+"/5");
                break;
        }
        raspunsuri_gresite=5-raspunsuri_corecte;
        switch(raspunsuri_corecte)
        {
            case 1:
                procent=20;
                break;
            case 2:
                procent=40;
                break;
            case 3:
                procent=60;
                break;
            case 4:
                procent=80;
                break;
            case 5:
                procent=100;
                break;
        }
        System.out.print("\nAti terminat Quiz-ul.\nRaspunsuri corecte: "+raspunsuri_corecte+"\nRaspunsuri gresite: "+raspunsuri_gresite+"\nProcentaj raspunsuri corecte: "+procent+"%");
    }
}