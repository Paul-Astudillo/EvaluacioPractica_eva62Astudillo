package ec.edu.ups.eva62Astudillo.servicios;

import java.util.List;

import ec.edu.ups.eva62Astudillo.modelo.Motocicleta;
import ec.edu.ups.eva62Astudillo.negocio.GestionMotocicleta;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("motocicletas")
public class GMotocicletaService {
	
	@Inject
	private GestionMotocicleta gestionMotocicleta;
	
	@GET
	@Path("saludo")
	public String saludo() {
		
		return "Hola Mundo Motocicletas Paul";
	}
	
	@GET
	@Path("misdatos")
	@Produces("application/json")
	public Motocicleta getDatos() {
		
		
		return new Motocicleta("123-ABC", "Kawasaki", "Rx-8", 12500);
	}
	
	//crearMotocilceta
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarMotocicleta(Motocicleta motocicleta) {
		
		
		try {
			gestionMotocicleta.guardarMotocicleta(motocicleta);
			return Response.status(Response.Status.OK).entity(motocicleta).build();
			
			
		} catch (Exception e) {
	
            Error error= new Error();
			
			error.setCodigo(99);
			error.setMensaje(e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}
		
		
	}
	
	//listar
	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Motocicleta> listaMotocilceta(){
		return gestionMotocicleta.listar();
	}

	
	
	

	
	
	
	
}
