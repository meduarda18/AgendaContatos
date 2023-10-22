package agendacontatos;

import java.util.Scanner;

import agendacontatos.contatos.ContatoEmail;
import agendacontatos.contatos.ContatoTelefone;
import agendacontatos.contatos.ContatoWhatsApp;

public class Menu {
    private Agenda agenda; 

    public Menu(Agenda agenda) {
        this.agenda = agenda;
    }

    public void menuAdicionar(int opcaoAdicionar){ // passando parâmentros para funcionar
        Scanner leitor = new Scanner(System.in);

        while (opcaoAdicionar != 0 ) {
            System.out.println("***\nMenu Adicionar ***");
            System.out.println("1 - Adicionar em Telefone");
            System.out.println("2 - Adicionar em Email");
            System.out.println("3 - Adicionar em WhatsApp");
            System.out.println("0 - Voltar");
            opcaoAdicionar = leitor.nextInt();

            if (opcaoAdicionar > 0) {
                System.out.print("Nome: ");
                String nomeTelefone = leitor.next();
                System.out.print("Telefone: ");
                int telefone = leitor.nextInt();

                switch (opcaoAdicionar) {
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
                }
            }
        }
    }

}
