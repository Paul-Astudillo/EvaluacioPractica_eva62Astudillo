package ec.edu.ups.eva62Astudillo.negocio;

import java.util.List;

import ec.edu.ups.eva62Astudillo.datos.MotocicletaDAO;
import ec.edu.ups.eva62Astudillo.modelo.Motocicleta;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionMotocicleta {
	
	@Inject
	private MotocicletaDAO motocicletaDAO;
	
	
	
	public void guardarMotocicleta(Motocicleta motocicleta) throws Exception  {
		
		if(motocicletaDAO.getById(motocicleta.getPlaca())== null) {
			
			try {
				motocicletaDAO.insert(motocicleta);
				
			} catch (Exception e) {
				
				throw new Exception("Error al insertar"+ e.getMessage());
			}
			
		}else {
			
			try {
				
				motocicletaDAO.update(motocicleta);
			} catch (Exception e) {
				throw new Exception("Error al actualizar"+ e.getMessage());
			}
			
			
			
			
		}
	
	}
	
	
	
	//meto para listar
	
	public List<Motocicleta> listar(){
		
		return motocicletaDAO.getAll();
	}
	
	

}
