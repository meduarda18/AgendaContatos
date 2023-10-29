package agendacontatos.contatos;

public class ContatoTelefone extends Contato{
    private int aniversario;

    public ContatoTelefone(String nome, String sobrenome, int contato, int aniversario) {
        super(nome, sobrenome, contato, false);
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "\nContatos Telefone\nNome: " + getNome() + ", Telefone: " + getContato();
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

}