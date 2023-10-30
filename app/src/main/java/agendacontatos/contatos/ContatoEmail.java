package agendacontatos.contatos;
import java.util.Scanner;


public class ContatoEmail extends Contato{
    private String email;
    Scanner leitor = new Scanner(System.in);

    public ContatoEmail(String nome, String sobrenome, int contato, String categoria, String email) {
        super(nome, sobrenome, contato, false, categoria);
        this.email = email;
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("O email não está em um formato válido.");
        }
    }

    @Override
    public void editar(String novoNome, String novoSobrenome, int novoContato) {
        super.editar(novoNome, novoSobrenome, novoContato);
        System.out.println("Digite o novo email (nome@exemplo.com): ");
        String novoAniversario = leitor.next();
        setEmail(novoAniversario);
    }

    @Override
    public String toString() {
        return "\nContatos Email\nNome: " + getNome() + ", Email: " + email +", Telefone: " + getContato();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContatoEmail outro = (ContatoEmail) obj;
        return getContato() == outro.getContato();
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Padrão de email simples
        return email.matches(regex);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

