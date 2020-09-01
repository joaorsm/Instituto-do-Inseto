//João Roberto Savini Merante RA 1886525

public class Escorpiao extends Aracnideos
{
    private Boolean ferrao;

    public Escorpiao(){
        ferrao = true;
    }

    public void setFerrao(Boolean ferrao){
        this.ferrao = ferrao;
    }
    public Boolean getFerrao(){
        return ferrao; 
    }
}