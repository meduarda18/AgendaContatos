package agendacontatos;

import java.util.List;
import java.util.ArrayList;


public class Grupos {
  private String nomeGrupo;  
  private List<Contato>contatosGrupo;

  public Grupos(String nomeGrupo){
    this.nomeGrupo = nomeGrupo;
    this.contatosGrupo = new ArrayList<Contato>();
    
  }
  
  public String getNomeGrupo() {
    return nomeGrupo;
  }

  public void setNomeGrupo(String nomeGrupo) {
    this.nomeGrupo = nomeGrupo;
  }

  public void adicionarContato(Contato contato){
    contatosGrupo.add(contato);
  }

  public void removerContato(Contato contato){
    contatosGrupo.remove(contato);
  }

  public List<Contato> geContatosGrupo(){
    return contatosGrupo;
  }




}
