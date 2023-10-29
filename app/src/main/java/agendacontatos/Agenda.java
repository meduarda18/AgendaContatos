package agendacontatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Optional;

import agendacontatos.contatos.Contato;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

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

    public void excluir(){
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        List<Contato> contatoFiltrado = contatos.stream().filter(c -> c.getContato() == buscaContato).toList();
        contatos.removeAll(contatoFiltrado);
    }

    public void editar(){
        System.out.println("Digite o número: ");
        int buscaContato = leitor.nextInt();
        Optional<Contato> contatoParaEditar = contatos.stream().filter(c -> c.getContato() == buscaContato).findFirst(); // retorna o primeiro que aparecer

        Contato contato = contatoParaEditar.get(); 

        System.out.println("Novo nome: ");
        String novoNome = leitor.next();
        contato.setNome(novoNome);

        System.out.println("Novo Contato: ");
        int novoContato = leitor.nextInt();
        contato.setContato(novoContato);
    }
    
}
