//João Roberto Savini Merante RA 1886525

public class Aracnideos
{
	private int pernas = 8;
	private int quantidadeOlhos;
	private boolean peconhento;
	private String cor;
	private Regiao regiao = new Regiao();

	public int getPernas()
	{
		return pernas;
	}

	public void setPernas(int pernas)
	{
		this.pernas = pernas;
	}

	public int getQuantidadeOlhos()
	{
		return quantidadeOlhos;
	}

	public void setQuantidadeOlhos(int quantidadeOlhos)
	{
		this.quantidadeOlhos = quantidadeOlhos;
	}

	public boolean getPeconhento()
	{
		return peconhento;
	}

	public void setPeconhento(boolean peconhento)
	{
		this.peconhento = peconhento;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public Regiao getRegiao()
	{
		return regiao;
	}

	public void setRegiao(Regiao regiao)
	{
		this.regiao = regiao;
	}
}