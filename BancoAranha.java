//João Roberto Savini Merante RA 1886525

import java.util.ArrayList;
import java.util.List;

public class BancoAranha
{
    private List<Aranha> bdAranha = new ArrayList<Aranha>();
    private Aranha aranha = new Aranha();
    private Leitura leitura = new Leitura();

    public List<Aranha> getBdAranha()
    {
        return bdAranha;
    }

    public Aranha cadastrarAranha(Aranha aranha)
    {
        boolean continueMenu = true;

        while(continueMenu)
        {
            try
		    {
			    aranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("\nEntre com a quantidade de olhos: ")));
                System.out.println("\n A quantidade de olhos eh: "+aranha.getQuantidadeOlhos());
                continueMenu = false;
		    }
		    catch(OlhosException oe)
		    {
                oe.avisoOlhos(aranha);
		    }
		    catch(NumberFormatException nfe)
		    {
                System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
            }
            
            
        }

        aranha.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

        return aranha;
    }
}