/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.JPAUtil;
import fotogames.persistencia.entidades.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe responsável pra manipular venda no BD.
 */
public class VendaDAO {

    private static EntityManager em; //Instância EntityManager

    /**
     * Método para cadastrar a venda
     */
    public void cadastrar(Venda venda){
        try{
            em = JPAUtil.getEntityManager();
            
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!" +  e.getMessage());
        }finally{
            JPAUtil.closeEntity();
        }
    }
    
    /**
     * Método para retornar as vendas
     */
    public List<Venda> listar(){
        try{
            em = JPAUtil.getEntityManager();
            
            Query consulta = em.createQuery("SELECT v FROM Venda v");
            List<Venda> lista = consulta.getResultList();
            
            return lista;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Nenhuma venda foi encontrada!");
        }finally{
            JPAUtil.closeEntity();
        }
        return null;
    }
}
