//João Roberto Savini Merante RA 1886525

public class MenuEscorpiao {

    private BancoEscorpiao bancoEscorpiao = new BancoEscorpiao();
    private Leitura leitura = new Leitura();
    private Escorpiao escorpiao = new Escorpiao();
    private int count = 0;


    public void criarMenuEscorpiao()
    {
        int opcaoMenuEscorpiao = 0;
        boolean continueMenuEscorpiao = true;
        while (continueMenuEscorpiao)
        {
            System.out.println("\n ============== MENU DE ESCORPIOES ==============");
            System.out.println("\n\t (1) INSERIR");
            System.out.println("\t (2) IMPRIMIR ESCORPIOES REGISTRADOS");
            System.out.println("\t (3) CONSULTAR ESCORPIAO PELO ID");
            System.out.println("\t (4) ALTERAR INFORMACOES DE ESCORPIAO PELO ID");
            System.out.println("\t (5) EXCLUIR ESCORPIAO PELO ID");
            System.out.println("\n\t (9) VOLTAR PARA O MENU ANTERIOR");

            try {
                opcaoMenuEscorpiao = Integer.parseInt(leitura.entDados("\nEscolha uma opcao: "));
            }
            catch (NumberFormatException nfe) {
                leitura.entDados("\nA opcao deve ser um numero inteiro");
                continue;
            }

            switch (opcaoMenuEscorpiao) {
                case 1:
                    escorpiao = new Escorpiao();
                    count++;
                    escorpiao = bancoEscorpiao.cadastrarEscorpiao(escorpiao, count);
                    bancoEscorpiao.getBdEscorpiao().add(escorpiao);
                    break;

                case 2:
                    for (int i = 0; i < bancoEscorpiao.getBdEscorpiao().size(); i++) {
                        bancoEscorpiao.imprimirEscorpiao(bancoEscorpiao.getBdEscorpiao().get(i));
                    }
                    break;

                case 3:
                    escorpiao = new Escorpiao();
                    escorpiao.setId(Integer.parseInt(leitura.entDados("Digite o ID que deseja consultar:")));
                    escorpiao = bancoEscorpiao.consultaEscorpiaoCodigo(escorpiao);
                    if(escorpiao == null)
                    {
                        System.out.println("ID nao registrado no banco de dados");
                    }else
                    {
                        bancoEscorpiao.imprimirEscorpiao(escorpiao);
                    }
                    break;

                case 4:
                    escorpiao = new Escorpiao();
                    escorpiao.setId(Integer.parseInt(leitura.entDados("Digite o ID que deseja alterar:")));
                    escorpiao = bancoEscorpiao.alterarEscorpiao(escorpiao);
                    if (escorpiao != null)
                    {
                        System.out.println("Registro alterado com sucesso!");
                        bancoEscorpiao.imprimirEscorpiao(escorpiao);                        
                    } else
                    {
                        System.out.println("ID nao registrado no BD..");                    
                    }
                    break;

                case 5:
                    escorpiao = new Escorpiao();
                    try
                    {
                        escorpiao.setId(Integer.parseInt(leitura.entDados("Digite o ID do escorpiao que deseja excluir:")));
                    }
                    catch(NumberFormatException nfe)
                    {
                        leitura.entDados("ID deve ser um valor inteiro");
                        
                    }

                    escorpiao = bancoEscorpiao.excluirEscorpiao(escorpiao);

                    if (escorpiao != null) {
                        System.out.println("Exclusao realizada com sucesso");
                    } else {
                        System.out.println("Nenhum escorpiao registrado com este ID");
                    }
                    break;

                case 9:
                    continueMenuEscorpiao = false;
                    break;

                default:
                    System.out.println("Escolha uma opcao...");
                    break;
            }
        }
    }
}