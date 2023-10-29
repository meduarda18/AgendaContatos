package agendacontatos.contatos;


public class ContatoEmail extends Contato{
    private String email;
    private String relacionamento;

    public ContatoEmail(String nome, String sobrenome, int contato, String email) {
        super(nome, sobrenome, contato, false);
        this.email = email;
    }

    // sobrecarga de métodos (construtor), visto que o usuário pode escolher relacionar ou não
    public ContatoEmail(String nome, String sobrenome, int contato, String email, String relacionamento) {
        super(nome, sobrenome, contato, false);
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

