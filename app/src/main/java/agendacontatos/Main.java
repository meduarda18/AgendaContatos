


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
        Agenda agenda = new Agenda();

        System.out.println("1- iniciar o app Agenda de Contatos \n2- não iniciar o app Agenda de Contatos \n");
        int op = leitor.nextInt();

        if (op == 1) {
            while (op != 0) {
                System.out.println("\n*** Menu ***");
                System.out.println("1 - Adicionar em Telefone");
                System.out.println("2 - Adicionar em Email");
                System.out.println("3 - Adicionar em WhatsApp");
                System.out.println("4- listar");
                System.out.println("0 - para sair");
                op = leitor.nextInt();

                if (op >= 1 || op <= 4){
                    String nomeTelefone;
                    int telefone;
                    if(op >= 1 || op<= 3){
                        System.out.print("Nome: ");
                        nomeTelefone = leitor.next();
                        System.out.print("Telefone: ");
                        telefone = leitor.nextInt();
                    }
                    

                    switch (op) {
                        case 1:
                            System.out.print("Aniversário: ");
                            int aniversario = leitor.nextInt();
                            agenda.adicionarContato(new ContatoTelefone(nomeTelefone, telefone, aniversario));
                            break;
                        case 2:
                            System.out.print("Email: ");
                            String email = leitor.next();
                            agenda.adicionarContato(new ContatoEmail(nomeTelefone, telefone, email));
                            break;
                        case 3:
                            agenda.adicionarContato(new ContatoWhatsApp(nomeTelefone, telefone));
                            break;
                        case 4:
                            agenda.listarContatos();
                            break;
                        default:
                            break;
                    }
                }               
            }
        }    
    }
}
