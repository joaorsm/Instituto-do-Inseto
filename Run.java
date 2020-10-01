//João Roberto Savini Merante RA 1886525

public class Run
{
	private static MenuAranha menuaranha = new MenuAranha();
	public static void main(String[] args)
	{
		//====================================== instancias =====================================================

		Leitura leitura = new Leitura();
		//Aracnideos aracnideo1 =  new Aracnideos();      // Coerção
		//Aracnideos aracnideo2 =  new Aranha();          // Coerção
		//Aranha omiranha =  new Aranha();
		//Escorpiao escorpiao = new Escorpiao();

		// ===================================== coerção ===================================================

		/*
		aracnideo1.peconhento();
		aracnideo2.peconhento();
		*/

		// ===================================== entradas aranha =====================================================
		
		boolean continueMenuPrincipal = true;
		int opcaoMenuPrincipal = 0;
		//boolean count = false;
		//MenuAranha menuaranha = new MenuAranha();

		while(continueMenuPrincipal)
		{
			//MenuAranha menuaranha = new MenuAranha();
			System.out.println("\n =================== MENU CADASTRO ARACNIDEO ===================\n");
			System.out.println("\t (1) CADASTRAR ARANHA");
			System.out.println("\t (2) CADASTRAR ESCORPIAO");
			System.out.println("\n\t (9) SAIR");

			try
			{
				opcaoMenuPrincipal = Integer.parseInt(leitura.entDados("\nEscolha uma opcao: "));
			}
			catch(NumberFormatException nfe)
			{
				leitura.entDados("\nA opcao deve ser um numero inteiro - Press <Enter>");
				continue;
			}

			switch(opcaoMenuPrincipal)
			{
				case 1:
					menuaranha.criarMenuAranha();
					break;
				
				case 9:
					continueMenuPrincipal = false;
					break;

                default:
					System.out.println("Escolha uma opcao...");
					break;	
			}
		}

		
		
		
		/*
		System.out.println("\n ============= Coletando dados de Aranha =============\n");

		//omiranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Entre com a quantidade de olhos: ")));
		try
		{
			omiranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("\nEntre com a quantidade de olhos: ")));
			System.out.println("\n A quantidade de olhos eh: "+omiranha.getQuantidadeOlhos());
		}
		catch(OlhosException oe)
		{
			oe.avisoOlhos(omiranha);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
		}

		omiranha.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

		omiranha.setEspecie(leitura.entDados("Entre com a especie: "));

		omiranha.setCor(leitura.entDados("Entre com a cor: "));

		omiranha.getRegiao().setPais(leitura.entDados("Entre com o pais de origem: "));

		omiranha.getRegiao().setEstado(leitura.entDados("Entre com o estado de origem: "));

		omiranha.setTeia(Boolean.parseBoolean(leitura.entDados("Produz teia? (true or false): ")));

		if(omiranha.getPeconhento())
		{
			omiranha.setVeneno(leitura.entDados("Nome do veneno: "));
			System.out.println();
			omiranha.peconhento(omiranha.getVeneno());
		}
		
		omiranha.seda();
		omiranha.cacar();

		omiranha.seda(omiranha.getTeia());

		omiranha.peconhento(omiranha.getPeconhento());

		try
		{
			omiranha.setSubOrdem(leitura.entDados("\nInforme a sub ordem: "));
			System.out.println("\nSub Ordem..: "+omiranha.getSubOrdem());
		}
		catch(SubOrdemException soe){
			soe.avisoSubOrdem(omiranha);
		}


		// =================================== entradas escorpiao =============================================

		System.out.println("\n ============= Coletando dados de Escorpiao =============\n");

		//escorpiao.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Entre com a quantidade de olhos: ")));
		try
		{
			omiranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("\nEntre com a quantidade de olhos: ")));
			System.out.println("\n A quantidade de olhos eh: "+omiranha.getQuantidadeOlhos());
		}
		catch(OlhosException oe)
		{
			oe.avisoOlhos(omiranha);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
		}

		escorpiao.setPeconhento(Boolean.parseBoolean(leitura.entDados("Eh peconhento? <true or false>: ")));

		escorpiao.setEspecie(leitura.entDados("Entre com a especie: "));

		escorpiao.setCor(leitura.entDados("Entre com a cor: "));

		escorpiao.getRegiao().setPais(leitura.entDados("De entrada no pais de origem: "));

		escorpiao.getRegiao().setEstado(leitura.entDados("De entrada no estado de origem: "));

		escorpiao.setFerrao(Boolean.parseBoolean(leitura.entDados("Ainda tem ferrao? (true or false): ")));
		


		// ================================ impressão dos dados coletados ==============================

		System.out.println("\n====================== ARANHA ======================\n");

		System.out.println("Pernas: "+ omiranha.getPernas());
		System.out.println("Olhos: "+ omiranha.getQuantidadeOlhos());
		//System.out.println("Peconhento: "+ omiranha.getPeconhento());
		System.out.println("Especie: "+omiranha.getEspecie());
		System.out.println("Cor: "+ omiranha.getCor());
		System.out.println("Pais: "+ omiranha.getRegiao().getPais());
		System.out.println("Estado: "+ omiranha.getRegiao().getEstado());

		System.out.println();

		System.out.println("\n====================== ESCORPIAO ======================\n");

		System.out.println("Pernas: "+ escorpiao.getPernas());
		System.out.println("Olhos: "+ escorpiao.getQuantidadeOlhos());
		//System.out.println("Peconhento: "+ escorpiao.getPeconhento());
		System.out.println("Especie: "+escorpiao.getEspecie());
		System.out.println("Cor: "+ escorpiao.getCor());
		System.out.println("Pais: "+ escorpiao.getRegiao().getPais());
		System.out.println("Estado: "+ escorpiao.getRegiao().getEstado());
		System.out.println();

		if(escorpiao.getFerrao())
		{
			System.out.println("Possui ferrao!");
			escorpiao.alerta();
		}else
		{
			System.out.println("Ja perdeu o ferrao");
		}

		escorpiao.informativo();

		escorpiao.cacar();
		*/


		// ======================= testando exception ============================

		/*try
		{
			omiranha.setSubOrdem(leitura.entDados("\nInforme a sub ordem: "));
			System.out.println("\nSub Ordem..: "+omiranha.getSubOrdem());
		}
		catch(SubOrdemException soe){
			soe.avisoSubOrdem(omiranha);
		}*/
	}
}