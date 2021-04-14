package com.company.outsources.servicioProductos;

import com.company.outsources.modelo.Producto;
import javax.ws.rs.core.Response;

//manejo de uris
import javax.ws.rs.Path;// me permits poner los endpoint
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

@Path("/serviciosproducto")
public interface ProductoServicio {
	
	@Path("/productos")
	@GET
	List<Producto> getProductos();//cada vez que llegen a está uri con el metodo GET se ejecuta esté metodo	
	
	@Path("/productos/{referencia}")
	@GET
	Producto getProducto(@PathParam("referencia") Long referencia);
	
	@Path("/productos")
	@POST
	Response crearProducto(Producto producto);
	
	@Path("/productos/{referencia}")
	@PUT
	Response actualizarProducto(Producto producto);
	
	/*
	//@RequestMapping(value = "/productos/{referencia}", method = RequestMethod.DELETE)
	@Path("/productos/{referencia}")
	@DELETE
	Producto eliminarProducto(@PathParam("referencia") Long referencia);
	*/
	@Path("/productos/{referencia}")
	@DELETE
	Response eliminarProducto(@PathParam("referencia") Long referencia);

	

}
