//João Roberto Savini Merante RA 1886525

public class MenuAranha
{
    private BancoAranha bancoAranha = new BancoAranha();
    private Leitura leitura = new Leitura();
    private Aranha aranha = new Aranha();
    private int count = 0;


    public void criarMenuAranha()
    {
        int opcaoMenuAranha = 0;
        boolean continueMenuAranha = true;
        while (continueMenuAranha)
        {
            System.out.println("\n ============== MENU DE ARANHAS ==============");
            System.out.println("\n\t (1) INSERIR");
            System.out.println("\t (2) IMPRIMIR ARANHAS REGISTRADAS");
            System.out.println("\t (3) CONSULTAR ARANHA PELO ID");
            System.out.println("\t (4) ALTERAR INFORMACOES DE ARANHA PELO ID");
            System.out.println("\t (5) EXCLUIR ARANHA PELO ID");
            System.out.println("\n\t (9) VOLTAR PARA O MENU ANTERIOR");

            try {
                opcaoMenuAranha = Integer.parseInt(leitura.entDados("\nEscolha uma opcao: "));
            }
            catch (NumberFormatException nfe) {
                leitura.entDados("\nA opcao deve ser um numero inteiro");
                continue;
            }

            switch (opcaoMenuAranha) {
                case 1:
                    aranha = new Aranha();
                    count++;
                    aranha = bancoAranha.cadastrarAranha(aranha, count);
                    bancoAranha.getBdAranha().add(aranha);
                    break;

                case 2:
                    for (int i = 0; i < bancoAranha.getBdAranha().size(); i++) {
                        bancoAranha.imprimirAranha(bancoAranha.getBdAranha().get(i));
                    }
                    break;

                case 3:
                    aranha = new Aranha();
                    aranha.setId(Integer.parseInt(leitura.entDados("Digite o ID que deseja consultar:")));
                    aranha = bancoAranha.consultaAranhaCodigo(aranha);
                    if(aranha == null)
                    {
                        System.out.println("ID nao registrado no banco de dados");
                    }else
                    {
                        bancoAranha.imprimirAranha(aranha);
                    }
                    break;

                case 4:
                    aranha = new Aranha();
                    aranha.setId(Integer.parseInt(leitura.entDados("Digite o ID que deseja alterar:")));
                    aranha = bancoAranha.alterarAranha(aranha);
                    if (aranha != null)
                    {
                        System.out.println("Registro alterado com sucesso!");
                        bancoAranha.imprimirAranha(aranha);                        
                    } else
                    {
                        System.out.println("ID nao registrado no BD..");                    
                    }
                    break;

                case 5:
                    aranha = new Aranha();
                    try
                    {
                        aranha.setId(Integer.parseInt(leitura.entDados("Digite o ID da aranha que deseja excluir:")));

                    }
                    catch(NumberFormatException nfe)
                    {
                        leitura.entDados("ID deve ser um valor inteiro");
                    }

                    aranha = bancoAranha.excluirAranha(aranha);

                    if (aranha != null) {
                        System.out.println("Exclusao realizada com sucesso");
                    } else {
                        System.out.println("Nenhuma aranha registrada com este ID");
                    }
                    break;

                case 9:
                    continueMenuAranha = false;
                    break;

                default:
                    System.out.println("Escolha uma opcao...");
                    break;
            }
        }
    }
}