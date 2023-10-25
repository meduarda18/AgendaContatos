package agendacontatos.contatos;

public class Contato {
    private String nome;
    private int contato;
    private boolean chamadaVideo;

    // construtor
    public Contato(String nome, int contato, boolean chamadaVideo){
        this.nome = nome;
        this.contato = contato;
        this.chamadaVideo = chamadaVideo;
    }

    // setters e getters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public boolean isChamadaVideo() {
        return chamadaVideo;
    }

    public void setChamadaVideo(boolean chamadaVideo) {
        this.chamadaVideo = chamadaVideo;
    }
}


