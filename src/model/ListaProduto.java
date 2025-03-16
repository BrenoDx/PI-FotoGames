/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class ListaProduto {
    private final static List<Produto> lista = new ArrayList<>();
    
    public static List<Produto> listar(){
        return lista;
    }
    
    public static void adicionar(Produto produto){
        lista.add(produto);
    }
    
    public static void remover(int index){
        lista.remove(index);
    }
}
