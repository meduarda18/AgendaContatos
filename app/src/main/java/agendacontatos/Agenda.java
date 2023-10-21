package agendacontatos;

import java.util.ArrayList;
import java.util.List;

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

    
}
