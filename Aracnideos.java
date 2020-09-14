//João Roberto Savini Merante RA 1886525

public abstract class Aracnideos
{
	private int pernas;
	private int quantidadeOlhos;
	private boolean peconhento;
	private String especie;
	private String cor;
	private Regiao regiao = new Regiao();

	public Aracnideos()
	{
		pernas = 8;
		quantidadeOlhos = 0;
		peconhento = true;
		especie = "";
		cor = "";
	}

	// ========================== metodo final =====================================

	public final int getPernas()
	{
		return pernas;
	}

	public final void setPernas(int pernas)
	{
		this.pernas = pernas;
	}

	// =========================== metodos ====================================

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

	public String getEspecie()
	{
		return especie;
	}

	public void setEspecie(String especie)
	{
		this.especie = especie;
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

	public void peconhento()
	{
		System.out.println("Aracnideo peconhento!");
	}

	// ======================== metodo abstrato ===============================

	public abstract void cacar();
}