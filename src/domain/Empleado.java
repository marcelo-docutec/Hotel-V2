package domain;

public class Empleado extends Usuario 
{
	//constructores
	
	
	public Empleado() 
	{
		super();
	
	}

	public Empleado(Integer idUsuarioRecib, String usuarioRecib, String passwordRecib) 
	{
		super(idUsuarioRecib, usuarioRecib, passwordRecib);	
	}

	// metodos
	
	
	public boolean pedirComida(String comida)
	{
		boolean comidaEntregada = false;
		
		return comidaEntregada;
	}
	
	public boolean pedirBebida(String bebida)
	{
		boolean bebidaEntregada = false;
		
		return bebidaEntregada;		
	}
	
	public boolean pedirPostres(String postre)
	{
		boolean postreEntregado = false;
		
		return postreEntregado;
	}

}
