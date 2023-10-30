package agendacontatos.contatos;


public class ContatoWhatsApp extends Contato{

    //construtor
    public ContatoWhatsApp(String nome, String sobrenome, int contato, String categoria) {
        super(nome, sobrenome, contato, true, categoria);
    }

    @Override
    public String toString() {
        return "\nContatos WhatsApp\nNome: " + getNome() + ", Telefone: " + getContato();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContatoWhatsApp outro = (ContatoWhatsApp) obj;
        return getContato() == outro.getContato();
    }



}
