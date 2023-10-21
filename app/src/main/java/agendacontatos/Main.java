


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
                System.out.println("1 - Adicionar novo contato");
                System.out.println("0 - para sair");
                op = leitor.nextInt();

                switch (op) {
                    case 1:
                        agenda.adicionarContato(contato);
                        break;
                
                    default:
                        break;
                }
            }
        }    
    }
}
