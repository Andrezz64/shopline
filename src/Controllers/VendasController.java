// Classe de controller para gerencia o banco de dados apartir das entitys
package Controllers;


import Models.Vendas;
import Modules.Time;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Andre.infra
 */
public class VendasController {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopLinePU");
    private final EntityManager em = emf.createEntityManager();

    // Procura por um produto com um ID especifico
  
    public Vendas findOne(int id) {
        em.getTransaction().begin();
        Vendas entity = em.find(Vendas.class, 1);
        em.getTransaction().commit();

   

        if (entity != null) {

            Vendas venda = new Vendas();
             String data = venda.getDataVenda();
             double valorTotal = venda.getValorTotal();
             

            em.close();
            return venda;

        } else {
            System.out.println(" Venda não encontrado.");
        }
        em.close();
        return null;

    }

    // Lista todos os Vendas da base
  
    public List<Vendas> findMany() {

        em.getTransaction().begin();

        String jpql = "SELECT p FROM Vendas p"; // Consulta JPQL para selecionar todos os registros
        TypedQuery<Vendas> query = em.createQuery(jpql, Vendas.class);

        List<Vendas> Vendas = query.getResultList(); // Obtém todos os registros da tabela

        em.getTransaction().commit();
        em.close();
        emf.close();
        return Vendas;
    }

    // Cria uma nova entry de produto.

    public void createOne(double ValorTotal) {
        
        Vendas novaVenda = new Vendas();
        Time dataModule = new Time();
        novaVenda.setDataVenda(dataModule.GetData());
        novaVenda.setValorTotal(ValorTotal);
        
        em.getTransaction().begin();
        em.persist(novaVenda);
        em.getTransaction().commit();
        em.close();
    }
    // exclui um produto pelo ID.

    public void deleteOne(int id) {
        em.getTransaction().begin();

        Vendas VendaDeleted = em.find(Vendas.class, id);
       if(VendaDeleted != null){
        em.remove(VendaDeleted);
        em.getTransaction().commit();
        em.close();
       }

    }
}
