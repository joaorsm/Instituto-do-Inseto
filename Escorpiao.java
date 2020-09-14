//João Roberto Savini Merante RA 1886525

public class Escorpiao extends Aracnideos
{
    private Boolean ferrao;

    public Escorpiao()
    {
        ferrao = true;
    }

    public void setFerrao(Boolean ferrao)
    {
        this.ferrao = ferrao;
    }
    public Boolean getFerrao()
    {
        return ferrao; 
    }

    public void alerta()
    {
        System.out.println("Cuidado para nao ser ferroado!");
    }

    // ======================== metodo abstrato na classe mae =========================

    public void cacar()
    {
        System.out.println("Escorpião espera a presa escondido");
    }
}