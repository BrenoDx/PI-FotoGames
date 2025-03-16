/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.entidades.Cliente;
import fotogames.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
/**
 * Método responsável para manipular clientes no BD.
 */
public class ClienteDAO {

    private static EntityManager em; // Instância EntityManager

    /**
     * Método para cadastrar cliente
     */
    public void cadastrar(Cliente cliente) {
        try {
            em = JPAUtil.getEntityManager();

            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!" + e.getMessage());
        } finally {
            JPAUtil.closeEntity();
        }
    }

    /**
     * Método retornar uma lista de clientes cadastrados.
     */
    public List<Cliente> listar() {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT c FROM Cliente c");
            

            List<Cliente> lista = consulta.getResultList();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para retorna apenas um cliente 
     */
    public Cliente getCliente(int id) {
        try {
            em = JPAUtil.getEntityManager();
            Cliente cliente = null;

            cliente = em.find(Cliente.class, id);
            return cliente;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }finally {
            JPAUtil.closeEntity();
        }
        return null;
    }
    
}
