package agendacontatos.contatos;


public class ContatoWhatsApp extends Contato{

    //construtor
    public ContatoWhatsApp(String nome, String sobrenome, int contato) {
        super(nome, sobrenome, contato, true);
    }

    @Override
    public String toString() {
        return "\nContatos WhatsApp\nNome: " + getNome() + ", Telefone: " + getContato();
    }



}
