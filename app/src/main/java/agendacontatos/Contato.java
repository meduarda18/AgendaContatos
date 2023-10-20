package agendacontatos;

import java.util.ArrayList;
import java.util.List;

public class Contato {
  public String nome;
  public int telefone;
  public String tipo;
  List<Contato>contatos;

  public Contato(String nome, int telefone, String tipo){
    this.nome = nome;
    this.telefone = telefone;
    this.tipo = tipo;
    this.contatos = new ArrayList<Contato>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getTelefone() {
    return telefone;
  }

  public void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }





}
