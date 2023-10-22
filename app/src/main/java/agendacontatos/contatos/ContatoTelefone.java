package agendacontatos.contatos;

public class ContatoTelefone extends Contato{
    private int aniversario;

    public ContatoTelefone(String nome, int contato, int aniversario) {
        super(nome, contato);
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Telefone: " + getContato();
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

}