package operacoes_basicas;
import java.util.HashSet;
import java.util.Set;

public class Convidados {
  private Set<Convidado> convidados;

  public Convidados(){
    this.convidados = new HashSet<>();
  }

  public void addConvidado(String nome, int codigoConvite){
    convidados.add(new Convidado(nome, codigoConvite));
  }

  public void removerPeloCodigo(int codigo){
    Convidado data = null;
    for(Convidado c : convidados){
      if(c.getCodigoConvite() == codigo){
        data = c;
        break;
      }
    }
    convidados.remove(data);
  }

  public int contarConvidados(){
    return convidados.size();
  }

  public void exibirConvidados(){
    System.out.println(convidados);
  }


  public static void main (String []args){
    Convidados convidados = new Convidados();

    System.out.println("numero de convidados: " + convidados.contarConvidados());
    
    convidados.addConvidado("Walassi", 0001);
    convidados.addConvidado("ana", 0002);
    convidados.addConvidado("Guilherme", 0003);
    convidados.addConvidado("Gui", 0003);
    System.out.println("numero de convidados: " + convidados.contarConvidados());
    convidados.exibirConvidados();
    
    convidados.removerPeloCodigo(0003);
    convidados.addConvidado("Guilherme", 0003);
    convidados.exibirConvidados();
  }

}
