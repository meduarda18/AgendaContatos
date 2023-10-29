package agendacontatos.contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import agendacontatos.RelacionamentoEmail;

public class ContatoEmail extends Contato{
    private String email;
    // private RelacionamentoEmail relacionamento;
    private String relacionamento;

    public ContatoEmail(String nome, int contato, String email) {
        super(nome, contato, false);
        this.email = email;
    }

    // sobrecarga de métodos (construtor), visto que o usuário pode escolher relacionar ou não
    public ContatoEmail(String nome, int contato, String email, String relacionamento) {
        super(nome, contato, false);
        this.email = email;
        this.relacionamento = relacionamento;
    }

    @Override
    public String toString() {
        return "\nContatos Email\nNome: " + getNome() + ", Email: " + email +", Telefone: " + getContato() + ", Relacionamento: " + relacionamento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelacionamento() {
        return relacionamento;
    }
    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

}

