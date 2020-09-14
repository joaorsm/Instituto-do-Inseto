public class SubOrdemException extends Exception
{
	Leitura leitura = new Leitura();

	public Aranha avisoSubOrdem(Aranha aranha)
	{
		System.out.println("A sub ordem deve ser # Mesothelae # ou # Opisthothelae #");

		try
		{
			aranha.setSubOrdem(leitura.entDados("\nInforme novamente a sub ordem: "));
			System.out.println("\nSub Ordem..: "+aranha.getSubOrdem());
		}
		catch(SubOrdemException soe)
		{
			soe.avisoSubOrdem(aranha);
		}

		return aranha;
		//System.out.println("");
	}
}