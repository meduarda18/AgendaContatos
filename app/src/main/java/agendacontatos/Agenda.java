package agendacontatos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        System.out.print("1 - Favoritos\n2 - Trabalho\n3 - Pessoal\nEscolha uma categoria: ");
        
        int escolha = leitor.nextInt();
    
        switch (escolha) {
            case 1:
                return "Favoritos";
            case 2:
                return "Trabalho";
            case 3:
                return "Pessoal";
            default:
                return "Nenhum";        
        
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

            System.out.println("Novo nome: ");
            String novoSobrenome = leitor.next();
    
            System.out.println("Novo Contato: ");
            int novoContato = leitor.nextInt();
    
            for (Contato contato : contatosFiltrados) {
                contato.setNome(novoNome);
                contato.setSobrenome(novoSobrenome);
                contato.setContato(novoContato);
            }
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exportarContatosParaCSV(String nomeArquivo) {
        try {
            FileWriter writer = new FileWriter(nomeArquivo);
    
            // Escreve o cabeçalho do CSV
            writer.write("Nome, Sobrenome, Contato, Aniversário, Email, Recebebe chamada de vídeo?, Tipo\n");
    
            for (Contato contato : contatos) {
                String nome = contato.getNome();
                String sobrenome = contato.getSobrenome();
                int contatoValue = contato.getContato();
                String tipo = "";
    
                if (contato instanceof ContatoTelefone) {
                    tipo = "Telefone";
                } else if (contato instanceof ContatoEmail) {
                    tipo = "Email";
                } else if (contato instanceof ContatoWhatsApp) {
                    tipo = "WhatsApp";
                }
    
                // Escreve os dados do contato no arquivo CSV
                if(contato instanceof ContatoTelefone){
                    ContatoTelefone contatoTelefone = (ContatoTelefone) contato;
                    String aniversario = contatoTelefone.getAniversario();
                    writer.write(nome + ", " + sobrenome + ", " + contatoValue + ", " +  aniversario + ", sem informação " + ", não, " + tipo + "\n");

                } else if (contato instanceof ContatoEmail) {
                    ContatoEmail contatoEmail = (ContatoEmail) contato;
                    String email = contatoEmail.getEmail();
                    writer.write(nome + ", " + sobrenome + ", " + contatoValue + ", sem informação " + ", " +  email +", não, " + tipo + "\n");

                } else {
                    writer.write(nome + ", " + sobrenome + ", " + contatoValue + ", sem informação " + ", sem informação " +", sim, "  + tipo + "\n");
                }
                
            }
    
            writer.close();
            System.out.println("Contatos exportados com sucesso para " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao exportar contatos para CSV: " + e.getMessage());
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
