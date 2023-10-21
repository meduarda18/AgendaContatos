package agendacontatos;


public class ContatoEmail extends Contato{
    private String email;
    private RelacionamentoEmail relacionamento;

    public ContatoEmail(String nome, int contato, String email) {
        super(nome, contato);
        this.email = email;
    }

    // sobrecarga de métodos (construtor), visto que o usuário pode escolher relacionar ou não
    public ContatoEmail(String nome, int contato, String email, RelacionamentoEmail relacionamento) {
        super(nome, contato);
        this.email = email;
        this.relacionamento = relacionamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Email: " + email +", Telefone: " + getContato();
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

        public RelacionamentoEmail getRelacionamento() {
        return relacionamento;
    }
    public void setRelacionamento(RelacionamentoEmail relacionamento) {
        this.relacionamento = relacionamento;
    }

}

