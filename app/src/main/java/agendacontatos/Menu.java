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

    public void menuAdicionar(int opcaoAdicionar) {
        Scanner leitor = new Scanner(System.in);
    
        while (opcaoAdicionar != 0) {
            System.out.print("\n***Menu Adicionar*** \n1 - Adicionar em Telefone\n2 - Adicionar em Email\n3 - Adicionar em WhatsApp\n0 - Voltar\nDigite a opção escolhida: ");
            opcaoAdicionar = leitor.nextInt();

            if (opcaoAdicionar == 0) {
                break;
            }
                
            System.out.print("Nome: ");
            String nome = leitor.next();
            System.out.print("Sobrenome: ");
            String sobrenome = leitor.next();
            System.out.print("Contato: ");
            int contato = leitor.nextInt();

            
    
            switch (opcaoAdicionar) {
                case 1:
                    System.out.print("Aniversário: ");
                    String aniversario = leitor.next();
                    String categoria = agenda.categorias();
                    agenda.adicionarContato(new ContatoTelefone(nome, sobrenome, contato, categoria, aniversario));
                    break;
                case 2:
                    System.out.print("Email: ");
                    String email = leitor.next();
                    categoria = agenda.categorias();
                    agenda.adicionarContato(new ContatoEmail(nome, sobrenome, contato, categoria , email));
                    break;
                case 3:
                    categoria = agenda.categorias();
                    agenda.adicionarContato(new ContatoWhatsApp(nome, sobrenome, contato, categoria ));
                    break;
            }

        }
    }
}


