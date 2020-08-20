//João Roberto Savini Merante RA 1886525

public class Run
{
	public static void main(String[] args)
	{
		Leitura leitura = new Leitura();
		Aracnideos aracnideo =  new Aracnideos();

		aracnideo.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Entre com a quantidade de olhos: ")));		
	}
}