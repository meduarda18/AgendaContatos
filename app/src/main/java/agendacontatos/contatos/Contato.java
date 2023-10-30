package agendacontatos.contatos;

public class Contato {
    private String nome;
    private String sobrenome;
    private int contato;
    private boolean chamadaVideo;
    private String categoria;

    // construtor
    public Contato(String nome,String sobrenome, int contato, boolean chamadaVideo, String categoria){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
        this.chamadaVideo = chamadaVideo;
        this.categoria = categoria;

        if (contato < 0) {
            throw new ContatoNegativoException("Número inválido. Não é possível adicionar número negativo.");
        }
        if (String.valueOf(contato).length() != 9) {
            throw new ContatoInvalidoException("Número inválido. Deve conter 9 dígitos.");
        }
    }

    public void editar(String novoNome, String novoSobrenome, int novoContato) {
        this.nome = novoNome;
        this.sobrenome = novoSobrenome;
        this.contato = novoContato;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}


