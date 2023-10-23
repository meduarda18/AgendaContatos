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
        
        System.out.println("Escolha uma categoria:\n1- Favoritos, 2- Trabalho, 3- Pessoal");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            return categoria[0];
        } else if (escolha == 2) {
            return categoria[1];
        } else {
            return categoria[2];
        }
        
    }

    
}
