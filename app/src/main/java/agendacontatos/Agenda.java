package agendacontatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Optional;

import agendacontatos.contatos.Contato;
import agendacontatos.contatos.ContatoEmail;
import agendacontatos.contatos.ContatoTelefone;
import agendacontatos.contatos.ContatoWhatsApp;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    public void adicionarContato(Contato contato) {
        if (!contatos.contains(contato)) { // Verifica se o contato já existe na lista
            contatos.add(contato);
        } else {
            System.out.println("Este contato já existe na sua lista.");
        }
    }


    public String categorias(){
        String[] categoria = {"Favoritos", "Trabalho", "Pessoal"};
        
        System.out.print("1 - Favoritos\n2 - Trabalho\n3 - Pessoal\nEscolha uma categoria: ");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            return categoria[0];
        } else if (escolha == 2) {
            return categoria[1];
        } else {
            return categoria[2];
        }
        
        
    }
    

    public void filtrar(){
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        List<Contato> contatoFiltrado = contatos.stream().filter(c -> c.getContato() == buscaContato).toList();
        System.out.println(contatoFiltrado);
    }

    public void listarContatosPorTipo(List<Contato> contatos, Class<?> tipo, String titulo) {
        List<Contato> contatosFiltrados = contatos.stream()
            .filter(c -> tipo.isInstance(c))
            .collect(Collectors.toList());

        System.out.println("\n" + titulo + ": ");
        
        for (Contato contato : contatosFiltrados) {
            if (tipo.isInstance(contato)) {
                System.out.print("Nome: " + contato.getNome() + ", Telefone: " + contato.getContato());

                if (tipo == ContatoTelefone.class) {
                    ContatoTelefone contatoTelefone = (ContatoTelefone) contato;
                    System.out.println(", Aniversário: " + contatoTelefone.getAniversario());
                } else if (tipo == ContatoEmail.class) {
                    ContatoEmail contatoEmail = (ContatoEmail) contato;
                    System.out.println(", Email: " + contatoEmail.getEmail());
                } else if (tipo == ContatoWhatsApp.class) {
                    System.out.println(", Pode realizar chamada de vídeo.");
                }
            }
        }
    }

    public void listarContatos() {
        listarContatosPorTipo(contatos, ContatoTelefone.class, "Contatos do Telefone");
        listarContatosPorTipo(contatos, ContatoEmail.class, "Contatos do Email");
        listarContatosPorTipo(contatos, ContatoWhatsApp.class, "Contatos do WhatsApp");
    }


    public void excluir(){
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        List<Contato> contatoFiltrado = contatos.stream().filter(c -> c.getContato() == buscaContato).toList();
        contatos.removeAll(contatoFiltrado);
    }

    public void editar() {
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        List<Contato> contatosFiltrados = contatos.stream()
                .filter(c -> c.getContato() == buscaContato)
                .collect(Collectors.toList());
    
        if (!contatosFiltrados.isEmpty()) {
            System.out.println("Novo nome: ");
            String novoNome = leitor.next();
    
            System.out.println("Novo Contato: ");
            int novoContato = leitor.nextInt();
    
            for (Contato contato : contatosFiltrados) {
                contato.setNome(novoNome);
                contato.setContato(novoContato);
            }
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
    

    // public boolean contatoExistente(int contato) {
    //     for (Contato c : contatos) {
    //         if (c.getContato() == contato) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    
}
