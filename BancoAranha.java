//João Roberto Savini Merante RA 1886525

import java.util.ArrayList;
import java.util.List;

public class BancoAranha
{
    private List<Aranha> bdAranha = new ArrayList<Aranha>();
    private Leitura leitura = new Leitura();
    private Aranha aranha = new Aranha();

    public List<Aranha> getBdAranha()
    {
        return bdAranha;
    }

    public Aranha consultaAranhaCodigo(Aranha aranha)
    {
        for (int i = 0; i < bdAranha.size(); i++) {
            if(bdAranha.get(i).getId() == aranha.getId())
            {
                return bdAranha.get(i);
            }
        }
        return null;
    }

    public Aranha cadastrarAranha(Aranha aranha, int count)
    {
        boolean continueMenuBancoAranha = true;

        aranha.setId(count);

        while(continueMenuBancoAranha)
        {
            try
		    {
			    aranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("\nEntre com a quantidade de olhos:")));
                continueMenuBancoAranha = false;
		    }
		    catch(OlhosException oe)
		    {
                oe.avisoOlhos(aranha);
		    }
		    catch(NumberFormatException nfe)
		    {
                System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
                OlhosException oe = new OlhosException();
                oe.avisoOlhos(aranha);
            }
            continueMenuBancoAranha = false;  
        }

        aranha.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

        aranha.setEspecie(leitura.entDados("Entre com a especie: "));

        aranha.setCor(leitura.entDados("Entre com a cor: "));

		aranha.getRegiao().setPais(leitura.entDados("Entre com o pais de origem: "));

        aranha.getRegiao().setEstado(leitura.entDados("Entre com o estado de origem: "));

        aranha.setTeia(Boolean.parseBoolean(leitura.entDados("Produz teia? (true or false): ")));
        
        if(aranha.getPeconhento())
		{
			aranha.setVeneno(leitura.entDados("Nome do veneno: "));
		}

		try
		{
			aranha.setSubOrdem(leitura.entDados("Informe a sub ordem: "));
		}
		catch(SubOrdemException soe){
			soe.avisoSubOrdem(aranha);
		}
        return aranha;
    }

    public void imprimirAranha(Aranha aranha)
    {
        System.out.println();
        System.out.println("ID: "+ aranha.getId());
        System.out.println("Pernas: "+ aranha.getPernas());
		System.out.println("Olhos: "+ aranha.getQuantidadeOlhos());
		System.out.println("Especie: "+aranha.getEspecie());
		System.out.println("Cor: "+ aranha.getCor());
		System.out.println("Pais: "+ aranha.getRegiao().getPais());
        System.out.println("Estado: "+ aranha.getRegiao().getEstado());
        System.out.println("Sub ordem: "+ aranha.getSubOrdem());
        if (aranha.getTeia())
        {
            aranha.seda(aranha.getTeia());
        }else
        {
            aranha.seda(aranha.getTeia());
            aranha.seda();
        }
        aranha.cacar();
        aranha.peconhento(aranha.getPeconhento());
        if(aranha.getPeconhento())
        {
            aranha.peconhento(aranha.getVeneno());
        }
    }

    public Aranha excluirAranha(Aranha aranha){

        aranha = consultaAranhaCodigo(aranha);
        if (bdAranha.remove(aranha)) 
        {
            return aranha;
        }
        return null;
    }
}