package agendacontatos.contatos;
import java.util.Scanner;

public class ContatoTelefone extends Contato{
    private String aniversario;
    Scanner leitor = new Scanner(System.in);

    public ContatoTelefone(String nome, String sobrenome, int contato, String categoria, String aniversario) {
        super(nome, sobrenome, contato, false, categoria);
        
        if (isValidDataDeAniversario(aniversario)) {
            this.aniversario = aniversario;
        } else {
            throw new IllegalArgumentException("Data de aniversário inválida. Use o formato 'dd/mm/yyyy'.");
        }

    }

    @Override
    public void editar(String novoNome, String novoSobrenome, int novoContato) {
        super.editar(novoNome, novoSobrenome, novoContato);
        System.out.println("Digite o novo aniversário (dd/mm/yyyy): ");
        String novoAniversario = leitor.next();
        setAniversario(novoAniversario);
    }

    @Override
    public String toString() {
        return "\nContatos Telefone\nNome: " + getNome() + ", Telefone: " + getContato();
    }

    // Validação da data de aniversário no formato 'dd/mm/yyyy'
    private boolean isValidDataDeAniversario(String data) {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        return data.matches(regex);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContatoTelefone outro = (ContatoTelefone) obj;
        return getContato() == outro.getContato();
    }


}