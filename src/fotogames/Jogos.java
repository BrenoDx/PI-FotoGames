package fotogames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Jogos extends Produto {
    private String plataforma;
    Scanner entrada = new Scanner(System.in);
    
    public Jogos(){
            }
    public Jogos(String _nomeProduto, String _fabricante, float _valor, int _qntdProduto, int _garantia, String plataforma){
        super(_nomeProduto, _fabricante, _valor, _qntdProduto, _garantia);
        this.plataforma = plataforma;
    }
    
    @Override
    public void cadastroProduto(List<Produto> produtos){
        System.out.println("**************Fotogames**************");
        System.out.println("---------Cadastro Jogos Fisicos----------");
        System.out.println("Nome do Jogo:");
        String produto = entrada.nextLine();
        System.out.println("Desenvolvida pela empresa:");
        String fabricante = entrada.nextLine();
        System.out.println("Plataforma do jogo: *Xbox/Playstation");
        String plataforma = entrada.nextLine();
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
        
        Jogos listaJogos = new Jogos(produto, fabricante, valor, qntdProduto, garantia, plataforma);
        produtos.add(listaJogos);
            }
    
    @Override
    public void exibirProduto(){
         super.exibirProduto();
         if(this.plataforma != null){
         System.out.println(this.plataforma);
         System.out.println("*************************************");
         }
            }
    
    @Override
    public void pesquisarProduto(){ 
            }
    
}
