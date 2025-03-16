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
public class ListaVenda {
    private final static List<Venda> lista = new ArrayList<>();
    
    public static List<Venda> listar(){
        return lista;
    }
    
    public static void adicionar(Venda venda){
        lista.add(venda);
    }
    
    public static void remover(int index){
        lista.remove(index);
    }
    
}
