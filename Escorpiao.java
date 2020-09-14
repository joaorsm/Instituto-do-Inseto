//João Roberto Savini Merante RA 1886525

public class Escorpiao extends Aracnideos implements InfoFerrao
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
        System.out.println("Escorpiao espera a presa escondido");
    }

    // ===================== implemento interface ==============================

    public void informativo()
    {
        System.out.println("Escorpioes perdem o ferrao quando ameacados a fim de sobreviver ate o acasalamento");
    }
}