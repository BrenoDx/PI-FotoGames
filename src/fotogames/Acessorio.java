package fotogames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Acessorio extends Produto {
    private String cor;
    Scanner entrada = new Scanner(System.in);
   
    public Acessorio(){
            }
    
    public Acessorio(String _nomeProduto, String _fabricante, float _valor, int _qntdProduto, int _garantia, String cor){
       super(_nomeProduto, _fabricante, _valor, _qntdProduto, _garantia);
       this.cor = cor;
           }
    
    @Override
    public void cadastroProduto(List<Produto> produtos){
        System.out.println("**************Fotogames**************");
        System.out.println("---------Cadastro Acessorios----------");
        System.out.println("Nome do produto:");
        String produto = entrada.nextLine();
        System.out.println("Fabricante:");
        String fabricante = entrada.nextLine();
        System.out.println("Cor do produto");
        String cor = entrada.nextLine();
        System.out.println("Valor do produto:");
        float valor = entrada.nextFloat();
        entrada.nextLine(); 
        System.out.println("Quantidade no estoque:");
        int qntdProduto = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Garantia do Produto: (Informar em total de dias)");
        int garantia = entrada.nextInt();
        entrada.nextLine();
        System.out.println("*************************************");
        Acessorio listaAcessorio = new Acessorio(produto, fabricante, valor, qntdProduto, garantia, cor);
        produtos.add(listaAcessorio);
            }
    
    @Override
    public void exibirProduto(){
         super.exibirProduto();
         if(this.cor != null){
         System.out.println("Cor do produto: " + this.cor);
         System.out.println("*************************************");  
            }
    }
    @Override
    public void pesquisarProduto(){
        
            }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
