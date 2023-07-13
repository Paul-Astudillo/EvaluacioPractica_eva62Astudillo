package ec.edu.ups.eva62Astudillo.datos;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.eva62Astudillo.modelo.Motocicleta;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class MotocicletaDAO  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	
	public void  insert(Motocicleta motocicleta) {
		em.persist(motocicleta);
		
		
	}
	
	public void  update(Motocicleta motocicleta) {
		em.merge(motocicleta);
			
	}
	
	public Motocicleta getById(String placa) {
		Motocicleta m=em.find(Motocicleta.class, placa);
		return m;
		
			
	}
	
	
	public void  delete(String placa) {
		
		Motocicleta m=em.find(Motocicleta.class, placa);
		em.remove(m);
	}
	
	
	public List<Motocicleta> getAll(){
		String jpql = "SELECT m FROM Motocicleta m";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
	
	

}
