//João Roberto Savini Merante RA 1886525

public class Aranha extends Aracnideos
{
	private Boolean teia;
	private String subOrdem;
	private String veneno;

	public Aranha()
	{
		teia = true;
		subOrdem = "";
		veneno = "";
	}

	// ============================== metodos get/set ==============================

	public Boolean getTeia()
	{
		return teia;
	}
	public void setTeia(Boolean teia)
	{
		this.teia = teia;
	}

	public String getVeneno()
	{
		return veneno;
	}
	public void setVeneno(String veneno)
	{
		this.veneno = veneno;
	}

	// ===================== metodo abstrato na classe mãe ==========================

	public void cacar()
	{
		if (teia)
		{
			System.out.println("Aranha espera a presa se embolar na teia");
		}else
		{
			System.out.println("Aranha caca de outras formas...");
		}
	}

	// ================================== sobrecarga ===================================

	public void seda()
	{
		System.out.println("Produz seda para qualquer fim");
	}

	public void seda(Boolean teia)
	{
		if(teia)
		{
			System.out.println("Finalidade da seda: Produz teia");
		}else
		{
			System.out.println("Finalidade da seda: Nao produz teia");
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

	// ================================ sobrescrita e coerção ==============================
	
	public void peconhento()
	{
		System.out.println("Aranha peconhento!!!");
	}

	// ================================ exception ========================================

	public String getSubOrdem()
	{
		return subOrdem;
	}
	public void setSubOrdem(String subOrdem) throws SubOrdemException
	{
		if(subOrdem.equalsIgnoreCase("Mesothelae")) //Mesothelae Opisthothelae
		{
			this.subOrdem = subOrdem;
		}else if(subOrdem.equalsIgnoreCase("Opisthothelae"))
		{
			this.subOrdem = subOrdem;
		}else
		{
			throw new SubOrdemException();
		}	
	}
}