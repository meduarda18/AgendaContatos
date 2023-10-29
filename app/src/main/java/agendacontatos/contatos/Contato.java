package agendacontatos.contatos;

public class Contato {
    private String nome;
    private String sobrenome;
    private int contato;
    private boolean chamadaVideo;

    // construtor
    public Contato(String nome,String sobrenome, int contato, boolean chamadaVideo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
        this.chamadaVideo = chamadaVideo;

        if (contato < 0) {
            throw new ContatoNegativoException("Número inválido. Não é possível adicionar número negativo.");
        }
        if (String.valueOf(contato).length() != 9) {
            throw new ContatoInvalidoException("Número inválido. Deve conter 9 dígitos.");
        }
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}


