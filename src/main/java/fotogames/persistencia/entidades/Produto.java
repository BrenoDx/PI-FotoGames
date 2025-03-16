/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.entidades;

import fotogames.persistencia.entidades.Orcamento_Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */

/**
 * Classe que representa as informações básicas dos produtos no sistema.
 */
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Identificador único do usuarios
    
    private String nomeProduto, fabricante, categoria, cor, plataforma; // Informações básicas (Nome, fabricante, categoria, cor e senha plataforma)
    private int garantia; // Garantia do produto
    private double valor; // Valor do produto
    
    @OneToMany(mappedBy="produto")
    private List<Venda_Produto> lista = new ArrayList<>(); // Chave mapeada na classe Venda_Produto.

    @OneToMany(mappedBy="produto")
    private List<Orcamento_Produto> listaOrc = new ArrayList(); // Chave Mapeada na classe Orcamento_Produto.
    
     /**
     * Obtém o identificador único.
     */
    public int getId() {
        return id;
    }

     /**
     * Define o identificador único.
     */
    public void setId(int id) {
        this.id = id;
    }

     /**
     * Obtém a fabricante do produto.
     */
    public String getFabricante() {
        return fabricante;
    }

     /**
     * Define a fabricante do produto.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

     /**
     * Obtém a categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

     /**
     * Define a categoria do produto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

     /**
     * Obtém a cor do produto
     */
    public String getCor() {
        return cor;
    }

     /**
     * Define a cor do produto
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

     /**
     * Obtém a plataforma.
     */
    public String getPlataforma() {
        return plataforma;
    }

     /**
     * Define a plataforma.
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

     /**
     * Obtém a garantia do produto.
     */
    public int getGarantia() {
        return garantia;
    }

     /**
     * Define a garantia do produto.
     */
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

     /**
     * Obtém o valor do produto.
     */
    public double getValor() {
        return valor;
    }

     /**
     * Define o valor do produto.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Obtém o nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Define o nome do produto.
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * obtém lista Venda_Produto.
     */
    public List<Venda_Produto> getLista() {
        return lista;
    }

    /**
     * Define a lista Venda_Produto.
     */
    public void setLista(List<Venda_Produto> lista) {
        this.lista = lista;
    }

    /**
     * Obtém lista Orcamento_Produto
     */
    public List<Orcamento_Produto> getListaOrc() {
        return listaOrc;
    }

    /**
     * Define a lista Orcamento_Produto.
     */
    public void setListaOrc(List<Orcamento_Produto> listaOrc) {
        this.listaOrc = listaOrc;
    }
    
    

    
}
