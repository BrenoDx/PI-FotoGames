/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.entidades;

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
 * Classe que representa cliente
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Identificador único do produto
    
    private String nome, telefone, email, cpf; // Informações básicas dos cliente (EX: nome, telefone, email, cpf)

    @OneToMany(mappedBy="cliente")
    private List<Orcamento> lista = new ArrayList<>(); // Chave mapeada na classe Orcamento.
    
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
     * Obtém o nome do cliente.
     */
    public String getNome() {
        return nome;
    }

     /**
     * Define o nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

     /**
     * Obtém o telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

     /**
     * Define o telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     /**
     * Obtém o email do cliente.
     */
    public String getEmail() {
        return email;
    }

     /**
     * Define o email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

     /**
     * Obtém o CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

     /**
     * Define o CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém a lista Orcamento.
     */
    public List<Orcamento> getLista() {
        return lista;
    }

    /**
     * Define lista Orcamento.
     */
    public void setLista(List<Orcamento> lista) {
        this.lista = lista;
    }
    
    
}
