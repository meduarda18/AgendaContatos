package agendacontatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import agendacontatos.contatos.Contato;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public String categorias(){
        String[] categoria = {"Favoritos", "Trabalho", "Pessoal"};
        Scanner leitor = new Scanner(System.in);
        
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
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        List<Contato> contatosFiltrados = contatos.stream().filter(c -> c.getContato() == buscaContato).toList();
        System.out.println(contatosFiltrados);
    }

    
}
