//João Roberto Savini Merante RA 1886525

public class Run
{
	public static void main(String[] args)
	{
		Leitura leitura = new Leitura();
		//Aracnideos aracnideo =  new Aracnideos();
		Aranha omiranha =  new Aranha();
		Escorpiao escorpiao = new Escorpiao();

		System.out.println("\nARANHA\n");

		omiranha.setQuantidadeOlhos(Integer.parseInt(leitura.entDados("Entre com a quantidade de olhos: ")));

		omiranha.setPeconhento(Boolean.parseBoolean(leitura.entDados("Peconhento? (true or false): ")));

		omiranha.setCor(leitura.entDados("Entre com a cor: "));

		omiranha.getRegiao().setPais(leitura.entDados("Entre com o pais de origem: "));

		omiranha.getRegiao().setEstado(leitura.entDados("Entre com o estado de origem: "));

		omiranha.setTeia(Boolean.parseBoolean(leitura.entDados("Produz teia? (true or false): ")));

		if(omiranha.getPeconhento())
		{
			omiranha.setVeneno(leitura.entDados("Nome do veneno: "));
			omiranha.peconhento(omiranha.getVeneno());
		}
		
		omiranha.seda();

		omiranha.seda(omiranha.getTeia());

		omiranha.peconhento(omiranha.getPeconhento());

		System.out.println("\nEscorpiao\n");
		escorpiao.setFerrao(Boolean.parseBoolean(leitura.entDados("Tem ferrao? (true or false):")));

		System.out.println("\nARANHA\n");

		System.out.println("\nPernas: "+ omiranha.getPernas());
		System.out.println("Olhos: "+ omiranha.getQuantidadeOlhos());
		//System.out.println("Peconhento: "+ omiranha.getPeconhento());
		System.out.println("Cor: "+ omiranha.getCor());
		System.out.println("Pais: "+ omiranha.getRegiao().getPais());
		System.out.println("Estado: "+ omiranha.getRegiao().getEstado());
		System.out.println("\nESCORPIAO\n");
		System.out.println("Ferrao: "+ escorpiao.getFerrao());


	}
}