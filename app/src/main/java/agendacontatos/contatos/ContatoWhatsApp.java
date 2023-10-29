package agendacontatos.contatos;

public class ContatoWhatsApp extends Contato{

    //construtor
    public ContatoWhatsApp(String nome, int contato) {
        super(nome, contato, true);
    }

    @Override
    public String toString() {
        return "\nContatos WhatsApp\nNome: " + getNome() + ", Telefone: " + getContato();
    }



}
