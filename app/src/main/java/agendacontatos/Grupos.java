package agendacontatos;

import java.util.List;

import agendacontatos.contatos.Contato;

import java.util.ArrayList;


public class Grupos extends SuaAgenda{
  private String nomeGrupo;  
  private List<Contato>contatosGrupo;

  public Grupos(String nomeGrupo){
    super();
    this.nomeGrupo = nomeGrupo;
    this.contatosGrupo = new ArrayList<Contato>();
    
  }
  
  public String getNomeGrupo() {
    return nomeGrupo;
  }

  public void setNomeGrupo(String nomeGrupo) {
    this.nomeGrupo = nomeGrupo;
  }

  public void adicionar(Contato contato){
    contatosGrupo.add(contato);
  }

  public void remover(Contato contato){
    contatosGrupo.remove(contato);
  }

  public List<Contato> getContatosGrupo(){
    return contatosGrupo;
  }




}
