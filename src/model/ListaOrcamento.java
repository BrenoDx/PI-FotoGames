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
public class ListaOrcamento {
    private static final List<Orcamento> lista = new ArrayList<>();
    
    public static List<Orcamento> listar(){
        return lista;
    }
    
    public static void adicionar(Orcamento orcamento){
        lista.add(orcamento);
    }
    
    public static void remover(int index){
        lista.remove(index);
    }
    
    public static Orcamento getOrcamento(int index){
         return lista.get(index);
    }
}
