
package fotogames;

import java.util.List;

/**
 *
 * @author breno
 */
public class Produto {
    private String nomeProduto;
    private String fabricante;
    private float valor;
    private int qntdProduto;
    private int garantia;
    
    public Produto(){
            }
    
    public Produto(String nomeProduto, String fabricante, float valor, int qntdProduto, int garantia){
        this.nomeProduto = nomeProduto;
        this.fabricante = fabricante;
        this.valor = valor;
        this.qntdProduto = qntdProduto;
        this.garantia = garantia;
    }
    
    public void cadastroProduto(List<Produto> produtos){
            }
    public void exibirProduto(){
        if(nomeProduto != null && valor != 0){
         System.out.print(nomeProduto);
         System.out.println(" " + fabricante);
         System.out.printf("R$ %.2f%n", valor);
         System.out.print("Estoque: " + qntdProduto + " Unidade(s)");
         System.out.println(" Garantia: " + garantia + " Dia(s)");
        }
            }
    public void pesquisarProduto(){
            }

    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQntdProduto() {
        return qntdProduto;
    }

    public void setQntdProduto(int qntdProduto) {
        this.qntdProduto = qntdProduto;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
         
}
