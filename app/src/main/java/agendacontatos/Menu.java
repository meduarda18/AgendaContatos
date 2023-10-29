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
                
            System.out.print("Nome: ");
            String nome = leitor.next();
            System.out.print("Sobrenome: ");
            String sobrenome = leitor.next();
            System.out.print("Contato: ");
            int contato = leitor.nextInt();
    
            switch (opcaoAdicionar) {
                case 1:
                    System.out.print("Aniversário: ");
                    int aniversario = leitor.nextInt();
                    agenda.adicionarContato(new ContatoTelefone(nome, sobrenome, contato, aniversario));
                    break;
                case 2:
                    System.out.print("Email: ");
                    String email = leitor.next();
                    System.out.println("Deseja adicionar a alguma categoria? 1- sim 2-não");
                    int escolha2 = leitor.nextInt();
                    String relacionamento = (escolha2 == 1) ? agenda.categorias() : "Nenhum";
                    agenda.adicionarContato(new ContatoEmail(nome, sobrenome, contato, email, relacionamento));
                    break;
                case 3:
                    agenda.adicionarContato(new ContatoWhatsApp(nome, sobrenome, contato));
                    break;
            }
        }
    }

    // public void menuAdicionar(int opcaoAdicionar) {
    //     Scanner leitor = new Scanner(System.in);
    
    //     while (opcaoAdicionar != 0) {
    //         System.out.print("\n***Menu Adicionar*** \n1 - Adicionar em Telefone\n2 - Adicionar em Email\n3 - Adicionar em WhatsApp\n0 - Voltar\nDigite a opção escolhida: ");
    //         opcaoAdicionar = leitor.nextInt();
    
    //         System.out.print("Nome: ");
    //         String nome = leitor.next();
    //         System.out.print("Sobrenome: ");
    //         String sobrenome = leitor.next();
    //         System.out.print("Contato: ");
    //         int contato = leitor.nextInt();
    
    //         // Verifique se o contato já existe
    //         if (agenda.contatoExistente(contato)) {
    //             System.out.println("Este contato já existe na agenda. Não é possível adicionar um contato duplicado.");
    //         } else {
    //             switch (opcaoAdicionar) {
    //                 case 1:
    //                     System.out.print("Aniversário: ");
    //                     int aniversario = leitor.nextInt();
    //                     agenda.adicionarContato(new ContatoTelefone(nome, sobrenome, contato, aniversario));
    //                     break;
    //                 case 2:
    //                     System.out.print("Email: ");
    //                     String email = leitor.next();
    //                     System.out.println("Deseja adicionar a alguma categoria? 1 - sim 2 - não");
    //                     int escolha2 = leitor.nextInt();
    //                     String relacionamento = (escolha2 == 1) ? agenda.categorias() : "Nenhum";
    //                     agenda.adicionarContato(new ContatoEmail(nome, sobrenome, contato, email, relacionamento));
    //                     break;
    //                 case 3:
    //                     agenda.adicionarContato(new ContatoWhatsApp(nome, sobrenome, contato));
    //                     break;
    //             }
    //         }
    //     }
    // }
    
}


