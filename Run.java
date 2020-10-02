//João Roberto Savini Merante RA 1886525

public class Run
{
	private static MenuAranha menuaranha = new MenuAranha();
	private static MenuEscorpiao menuescorpiao = new MenuEscorpiao();
	public static void main(String[] args)
	{
		//====================================== instancias =====================================================

		Leitura leitura = new Leitura();
		//Aracnideos aracnideo1 =  new Aracnideos();      // Coerção
		//Aracnideos aracnideo2 =  new Aranha();          // Coerção
		//Aranha aranha =  new Aranha();
		//Escorpiao escorpiao = new Escorpiao();

		// ===================================== coerção ===================================================

		/*
		aracnideo1.peconhento();
		aracnideo2.peconhento();
		*/

		// ==============================================================================================
		
		boolean continueMenuPrincipal = true;
		int opcaoMenuPrincipal = 0;

		while(continueMenuPrincipal)
		{
			System.out.println("\n =================== MENU ARACNIDEOS ===================\n");
			System.out.println("\t (1) MENU ARANHA");
			System.out.println("\t (2) MENU ESCORPIAO");
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

				case 2:
					menuescorpiao.criarMenuEscorpiao();
					break;
				
				case 9:
					continueMenuPrincipal = false;
					break;

                default:
					System.out.println("Escolha uma opcao...");
					break;	
			}
		}
	}
}