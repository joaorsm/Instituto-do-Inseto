//João Roberto Savini Merante RA 1886525

public class OlhosException extends Exception
{
	boolean continueMenu = true;
	Leitura leitura = new Leitura();

	public Aracnideos avisoOlhos(Aracnideos aracnideo)
	{
		while(continueMenu)
		{
			System.out.println("A quantidade de olhos deve ser par!");

			try
			{
				aracnideo.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Tente novamente!")));
				//System.out.println("\nPossui: "+aracnideo.getQuantidadeOlhos()+" olhos..");
				
			}
			catch(OlhosException oe)
			{
				oe.avisoOlhos(aracnideo);
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Quantidade de olhos deve ser um numero do tipo Inteiro.");
				this.avisoOlhos(aracnideo);
			}
			continueMenu = false;
		}
		return aracnideo;
	}
}