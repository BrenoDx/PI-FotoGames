package fotogames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class FotoGames {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Acessorio acessorio = new Acessorio();
       Hardware hardware = new Hardware();
       Jogos jogo = new Jogos();
       List<Produto> listaProduto = new ArrayList<>();
       int opcao = 0 ;
       String menu;
        
        do{
          System.out.println("*****************Fotogames****************");
          System.out.println("Seja Bem vindo ao Sistema da loja Fotogames");
          System.out.println("Apenas um prototipo");
          System.out.println("******************************************");
        
            System.out.println("Escolha o numero do menu");
            System.out.println("1 - (DP)Pesquisar; 2 - Cadastrar Produto; 3 - (D)Cadastar Venda; 4 - (D)Cadastrar Orcamento; 5 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("Algumas funcionalidades ainda estao EM DESENVOLVIMENTO");
                    for(Produto p : listaProduto){
                        p.exibirProduto();
                    }
                    System.out.println();
                       break;
                    
                case 2:
                    System.out.println("Acessorio; Hardware; Jogos;");
                    System.out.println("Categoria do produto?");
                    String opProduto = entrada.nextLine();
                    
                    if(opProduto.equalsIgnoreCase("Acessorio")){
                       acessorio.cadastroProduto(listaProduto); 
                      
                    }else if(opProduto.equalsIgnoreCase("Hardware")){
                        hardware.cadastroProduto(listaProduto);
                      
                    }else if(opProduto.equalsIgnoreCase("Jogos")){
                        jogo.cadastroProduto(listaProduto);
                        listaProduto.add(jogo);
                    }else{
                        System.out.println("Categoria do produto não encontrada.");
                    } break;
                    
                case 3:
                    System.out.println("EM DESENVOLVIMENTO");
                    break;
                case 4:
                    System.out.println("EM DESENVOLVIMENTO"); 
                    break;
                case 5:
                    System.out.println("Obrigado por usar nosso prototipo");
                    break;
                default:
                    System.out.println("Opcao invalida");
        }                    
            
    }while(opcao!=5);
        
        
    }
    
}
