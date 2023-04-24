

public class Bokning {

    public Bokning(){
        //välkommnar kunden för bokning
        System.out.println("Välkommen till Stockholms HundSalong");
        
        kundNamn();
        hundNamn();
        tid();
        tjänst();
    }

    private void tjänst() {
        System.out.println("Vilken tjäsnt vill ni ha?");
    }

    private void tid() {
        System.out.println("Vilken tid vill ni boka?");
    }

    private void hundNamn() {
        System.out.println("Vad är namnet på hunden?");
    }

    private void kundNamn() {
        System.out.println("Kontaktuppgifter till matte eller husse");
    }
    
    
}
