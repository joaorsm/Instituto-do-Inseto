//João Roberto Savini Merante RA 1886525

public class Aranha extends Aracnideos
{
	private Boolean teia;
	private String especie;
	private String subOrdem;
	private String veneno;

	public Aranha()
	{
		teia = true;
		especie = "";
		subOrdem = "";
		veneno = "";
	}

	//metodos get/set

	public Boolean getTeia()
	{
		return teia;
	}
	public void setTeia(Boolean teia)
	{
		this.teia = teia;
	}

	public String getEspecie()
	{
		return especie;
	}
	public void setEspecie(String especie)
	{
		this.especie = especie;
	}

	public String getSubOrdem()
	{
		return subOrdem;
	}
	public void setSubOrdem(String subOrdem)
	{
		this.subOrdem = subOrdem;
	}

	public String getVeneno()
	{
		return veneno;
	}
	public void setVeneno(String veneno)
	{
		this.veneno = veneno;
	}

	// metodos

	public void seda()
	{
		System.out.println("\nProduz seda para outros fins");
	}
	public void seda(Boolean teia)
	{
		if(teia)
		{
			System.out.println("Produz teia");
		}else
		{
			System.out.println("Nao produz teia");
		}
	}

	public void peconhento(Boolean peconhento)
	{
		if(peconhento)
		{
			System.out.println("Aranha peconhento");
		}else
		{
			System.out.println("Aranha nao peconhenta");
		}
	}

	public void peconhento(String veneno)
	{

		System.out.println("O nome do veneno eh: "+veneno);
	}
}