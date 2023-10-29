package agendacontatos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("1- Iniciar o app Agenda de Contatos \n2- Não iniciar o app Agenda de Contatos \nDigite a opção escolhida: ");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            Agenda agenda = new Agenda();
            Menu menu = new Menu(agenda);

            while (true) {
                
                System.out.println(
                    "\n*** Menu ***\n" +
                    "1 - Adicionar contato\n" +
                    "2 - Remover contato\n" +
                    "3 - Buscar contato\n" +
                    "4 - Listar contatos\n" +
                    "5 - Editar contatos\n" +
                    "0 - Sair"
                );
                opcao = leitor.nextInt(); 
                if (opcao == 0){
                    break;
                } else if (opcao == 1){
                    menu.menuAdicionar(opcao);
                } else if (opcao == 2){
                    agenda.excluir(); // recebeu argumento
                } else if (opcao == 3){
                    agenda.filtrar();
                } else if (opcao == 4){
                    agenda.listarContatos();
                } else if (opcao == 5){
                    agenda.editar();

                }
            }
        }
        leitor.close();
    }
}
