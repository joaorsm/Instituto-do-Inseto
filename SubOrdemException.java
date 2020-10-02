//João Roberto Savini Merante RA 1886525

public class SubOrdemException extends Exception
{
	Leitura leitura = new Leitura();

	public Aranha avisoSubOrdem(Aranha aranha)
	{
		System.out.println("A sub ordem deve ser # Mesothelae # ou # Opisthothelae #");

		try
		{
			aranha.setSubOrdem(leitura.entDados("\nInforme novamente a sub ordem: "));
		}
		catch(SubOrdemException soe)
		{
			soe.avisoSubOrdem(aranha);
		}

		return aranha;
	}
}