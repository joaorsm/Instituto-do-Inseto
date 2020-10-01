//João Roberto Savini Merante RA 1886525

import java.util.ArrayList;
import java.util.List;

public class BancoEscorpiao
{
    private List<Escorpiao> bdEscorpiao = new ArrayList<Escorpiao>();
    private Leitura leitura = new Leitura();
    private Escorpiao escorpiao = new Escorpiao();

    public List<Escorpiao> getBdEscorpiao()
    {
        return bdEscorpiao;
    }

    public Escorpiao consultaEscorpiaoCodigo(Escorpiao escorpiao)
    {
        for (int i = 0; i < bdEscorpiao.size(); i++) {
            if(bdEscorpiao.get(i).getId() == escorpiao.getId())
            {
                return bdEscorpiao.get(i);
            }
        }
        return null;
    }

    public Escorpiao cadastrarEscorpiao(Escorpiao escorpiao, int count)
    {
        boolean continueMenuBancoEscorpiao = true;

        escorpiao.setId(count);

        while(continueMenuBancoEscorpiao)
        {
            try
		    {
			    escorpiao.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("\nEntre com a quantidade de olhos: BANCO ESCORPIAO")));
                //System.out.println("\nA quantidade de olhos eh: "+aranha.getQuantidadeOlhos());
                continueMenuBancoEscorpiao = false;
		    }
		    catch(OlhosException oe)
		    {
                oe.avisoOlhos(escorpiao);
		    }
		    catch(NumberFormatException nfe)
		    {
                System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
                OlhosException oe = new OlhosException();
                oe.avisoOlhos(escorpiao);
            }
            continueMenuBancoEscorpiao = false;  
        }

        escorpiao.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

        escorpiao.setEspecie(leitura.entDados("Entre com a especie: "));

        escorpiao.setCor(leitura.entDados("Entre com a cor: "));

		escorpiao.getRegiao().setPais(leitura.entDados("Entre com o pais de origem: "));

        escorpiao.getRegiao().setEstado(leitura.entDados("Entre com o estado de origem: "));

        //escorpiao.setTeia(Boolean.parseBoolean(leitura.entDados("Produz teia? (true or false): ")));
        
        /*if(escorpiao.getPeconhento())
		{
			escorpiao.setVeneno(leitura.entDados("Nome do veneno: "));
			//System.out.println();
			//aranha.peconhento(aranha.getVeneno());
		}*/
		
		//aranha.seda();
		//aranha.cacar();

		//aranha.seda(aranha.getTeia());

		//aranha.peconhento(aranha.getPeconhento());

		/*try
		{
			escorpiao.setSubOrdem(leitura.entDados("\nInforme a sub ordem: "));
			//System.out.println("\nSub Ordem..: "+aranha.getSubOrdem());
		}
		catch(SubOrdemException soe){
			soe.avisoSubOrdem(escorpiao);
		}*/


        return escorpiao;
    }

    public void imprimirEscorpiao(Escorpiao escorpiao)
    {
        System.out.println();
        System.out.println("ID: "+ escorpiao.getId());
        System.out.println("Pernas: "+ escorpiao.getPernas());
		System.out.println("Olhos: "+ escorpiao.getQuantidadeOlhos());
		//System.out.println("Peconhento: "+ aranha.getPeconhento());
		System.out.println("Especie: "+escorpiao.getEspecie());
		System.out.println("Cor: "+ escorpiao.getCor());
		System.out.println("Pais: "+ escorpiao.getRegiao().getPais());
        System.out.println("Estado: "+ escorpiao.getRegiao().getEstado());
        /*if (escorpiao.getTeia())
        {
            escorpiao.seda(escorpiao.getTeia());
        }else
        {
            escorpiao.seda(escorpiao.getTeia());
            escorpiao.seda();
        }*/
        escorpiao.cacar();
        escorpiao.peconhento();
        //escorpiao.peconhento(escorpiao.getVeneno());
    }

    public Escorpiao excluirEscorpiao(Escorpiao escorpiao){

        escorpiao = consultaEscorpiaoCodigo(escorpiao);
        if (bdEscorpiao.remove(escorpiao)) 
        {
            return escorpiao;
        }
        return null;
    }
}