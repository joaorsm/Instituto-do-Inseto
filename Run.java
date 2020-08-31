//João Roberto Savini Merante RA 1886525

public class Run
{
	public static void main(String[] args)
	{
		Leitura leitura = new Leitura();
		Aracnideos aracnideo =  new Aracnideos();

		aracnideo.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Entre com a quantidade de olhos: ")));

		aracnideo.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

		aracnideo.setCor(leitura.entDados("Entre com a cor: "));

		aracnideo.getRegiao().setPais(leitura.entDados("Entre com o pais de origem: "));

		aracnideo.getRegiao().setEstado(leitura.entDados("Entre com o estado de origem: "));

		System.out.println("Pernas: "+ aracnideo.getPernas());
		System.out.println("Olhos: "+ aracnideo.getQuantidadeOlhos());
		System.out.println("Peconhento: "+ aracnideo.getPeconhento());
		System.out.println("Cor: "+ aracnideo.getCor());
		System.out.println("Pais: "+ aracnideo.getRegiao().getPais());
		System.out.println("Estado: "+ aracnideo.getRegiao().getEstado());
	}
}