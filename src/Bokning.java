import java.util.Scanner;

public class Bokning {
    // Attributes inte glömma arv
    int pris;
    int längd;
    int tid;
    String namn;
    String hund;

     Scanner myScan = new Scanner(System.in);

     //Constructors
    public Bokning(){
        //välkommnar kunden för bokning
        System.out.println("Välkommen till Stockholms HundSalong");
        
        kundNamn();
        hundNamn();
        tid();
        tjänst();
    }

    private void tjänst() {
        // här får kunden välja vilken tjäsnt den vill välja till sin hund
        System.out.println("Vilken tjäsnt vill ni ha? 1:Kloklippning 2: Hundtrim 3: Tassvård 4: Hundbad");
        int tjänst = myScan.nextInt();
// denna  if satsen gör att beroende på vilken tjänst man väljer kommer priset upp och längden (tiden) på behandligen
        if (tjänst == 1){
            pris = 150;
            längd = 15;
        } else if (tjänst == 2) {
            //System.out.println("Du har valt Hundtrim, priset kommer bli 800kr och de kommer ta 45 min");
            pris = 800;
            längd = 45;
        } else if (tjänst == 3) {
            pris = 350;
            längd = 30;
        } else if (tjänst == 4) {
            pris = 550;
            längd = 100;
        }

    }

    private void tid() {
       System.out.println("Vill ni boka 1: förmiddag eller 2:eftermiddag? ");
        int tid = myScan.nextInt();

        if (tid == 1){
            System.out.println("De finns tid kl 1: 11:00, 2: 11:30");
        } else if (tid==1) {
            System.out.println("Ni är bokade kl 11:00");
        }

    }

    private void hundNamn() {
        System.out.println("Vad är namnet på hunden?");
         String hund = myScan.next();

    }

    private void kundNamn() {
       System.out.println("Kontaktuppgifter till matte eller husse");
       String
    }

    
    
}
