//João Roberto Savini Merante RA 1886525

public class MenuAranha
{
    private BancoAranha bancoAranha = new BancoAranha();
    private Leitura leitura = new Leitura();
    private Aranha aranha = new Aranha();
    private boolean continueMenu = true;

    public void criarMenuAranha()
    {
        int opcaoMenu = 0;

        while(continueMenu)
        {
            System.out.println("\n ============== CADASTRO DE ARANHA ==============");
            System.out.println("\n\t (1) INSERIR");
            System.out.println("\t (2) IMPRIMIR ARANHAS REGISTRADAS");

            try{
                opcaoMenu = Integer.parseInt(leitura.entDados("\nEscolha uma opcao: "));
            }
            catch(NumberFormatException nfe){
                leitura.entDados("\nA opcao deve ser um numero inteiro - Press <Enter>");
                continue;
            }
            break;           
        }

        switch(opcaoMenu)
        {
            case 1:
                aranha = new Aranha();
                aranha = bancoAranha.cadastrarAranha(aranha);
                bancoAranha.getBdAranha().add(aranha);
                break;
        }
    }
}