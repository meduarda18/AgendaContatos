


// OLHA O QUE EU FIZ 

// comentei teu código e fiz da aneira que estava pensando, caso não entenda me fala
// eu só destrinchei e tirei o tipo e a lista, a lista pelo que te falei no whats
//  pensei em apenas email ter um marcador e os outro poder fazer grupos (nunca vi grupo em email)

// o tipo pensei em cada um ser uma classe, visto que ele pediu atributos específicos, fiz um enum "RelacionamentoEmail" para 
// relacionar os emails

// aqui no main só estava testando umas coisas


package agendacontatos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("1- Iniciar o app Agenda de Contatos \n2- Não iniciar o app Agenda de Contatos \nDigite o número da opção escolhida: ");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            Agenda agenda = new Agenda();
            Menu menu = new Menu(agenda);

            while (true) {
                System.out.println("\n*** Menu ***\n1 - Adicionar contato\n2 - Remover contato\n3 - Atualizar conato\n4 - Listar contatos\n0 - Sair");
                
                opcao = leitor.nextInt(); 
                if (opcao == 0){
                    break;
                } else if (opcao == 1){
                    menu.menuAdicionar(opcao); // recebeu argumento
                } else if (opcao == 4){
                    agenda.listarContatos();
                }                  
            }
        }
        leitor.close();
    }
}
