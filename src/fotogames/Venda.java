
package fotogames;

/**
 *
 * @author breno
 */
public class Venda {
    String formPagamento, data;
    int nf;
    Acessorio acessorio;
    Hardware hardware;
    Jogos jogos;
    Cliente cliente;
    Orcamento orcamento;
    
   public Venda(){
    } 
   public Venda(String formPagamento, int nf, Acessorio acessorio, Jogos jogos, Cliente cliente, Orcamento orcamento){
       this.formPagamento = formPagamento;
       this.data = data;
       this.nf = nf;
   }
    
 /*  public void cadastroVenda(){
       
   } 
    
   public void cancelarVenda(){
       
   }
    
    public float calcularTotal(){
        
        return
    }*/
    
}
