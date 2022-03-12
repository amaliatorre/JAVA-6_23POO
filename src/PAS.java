
import java.util.*;

/*Amalia 9Marzo*/
public class PAS extends Personal
{
	
	private boolean aleman, chino, ingles;
	private String areaAtencion;
	
	public PAS (final String Dni, String nombre,final String apellido,String telefono, String email,
			char genero, int edad, double salario, boolean aleman, boolean chino, boolean ingles, String areaAtencion)
	{
		super(Dni, nombre,apellido,telefono, email,genero, edad, salario);
		this.aleman=aleman;
		this.chino=chino;
		this.ingles=ingles;
		this.areaAtencion=areaAtencion;
	}
/*BLOQUE GET SET*/
	public boolean getAleman() {
		return aleman;
	}

	public void setAleman(boolean aleman) {
		this.aleman = aleman;
	}

	public boolean getChino() {
		return chino;
	}

	public void setChino(boolean chino) {
		this.chino = chino;
	}

	public boolean getIngles() {
		return ingles;
	}

	public void setIngles(boolean ingles) {
		this.ingles = ingles;
	}

	public String getAreaAtencion() {
		return areaAtencion;
	}

	public void setAreaAtencion(String areaAtencion) {
		this.areaAtencion = areaAtencion;
	}
	
	
/*METODOS EJERCICIO*/
	
	/**
	 * Almacenamiento de la informacion contenida en personal y profesor  para mostrar
	 */
	public String toString()
	{
		String informacion, resultadoChino, resultadoAlem, resultadoIngl;
		
			if (!getChino())
			{
				resultadoChino="NO";	
			}
			else
			{
				resultadoChino="SI";
			}
			if (!getAleman())
			{
				resultadoAlem="NO";	
			}
			else
			{
				resultadoAlem="SI";
			}
			if (!getIngles())
			{
				resultadoIngl="NO";	
			}
			else
			{
				resultadoIngl="SI";
			}
		
		informacion = super.toString() + "\n*IDIOMAS*\nAleman: " +  resultadoAlem + "\nChino: " +  resultadoChino +
				"\nIngles: " + resultadoIngl  + "\nArea de atención: " + getAreaAtencion();
		
		return informacion;
	}
	
	/**
	 * Devuelve el numero de idiomas que habla
	 * @return
	 */
	public int numIdiomas()
	{
		int numero=0;
		if (getChino())
		{
			numero++;
		}
		
		if (getAleman())
		{
			numero++;	
		}
		
		if (getIngles())
		{
			numero++;
		}
		
		System.out.println("Números de idiomas que habla:");
		return numero;
	}
	
	public void cambioIdiomas()
	{
		Scanner ent = new Scanner (System.in);
		boolean validacion=false, validacion2=false;
		int opcion=0;
		char siOno, S='S', N='N';
		
		do
			{
				
				System.out.println("Que idioma quiere modificar");
				System.out.println("1. Aleman	2.Chino		3.Ingles	4.Salir");
				opcion= ent.nextInt();
				
			
				switch (opcion)
				{
					case 1: 
						do
						{
							
								System.out.println("Tiene conocimiento de Aleman: S/N");
								siOno=ent.next().charAt(0);
								siOno=Character.toUpperCase(siOno);
								
							
							
							
							if (Character.compare(siOno,S)==0)
							{
								setAleman(true);
								System.out.println( getAleman() + " Alemán se ha colocado en la opcion SI");
								validacion2=true;
							}
							
							else if (Character.compare(siOno,N)==0) 
							{
								setAleman(false);
								System.out.println( getAleman() + " Alemán se ha colocado en la opcion NO");
								validacion2=true;
							}
							else
							{
								System.out.println( siOno + " No es una opcion correcta.");
							}
						}
						while(!validacion2);
						//para que me sirva pra usarlo si cambia mas de un idioma
						validacion2=false;
						break;	
						
					case 2:
						
						do
						{
							System.out.println("Tiene conocimiento de Chino: S/N");
							siOno=ent.next().charAt(0);
							siOno=Character.toUpperCase(siOno);
								
							if (Character.compare(siOno,S)==0)
							{
								setChino(true);
								System.out.println( getChino() + " Chino se ha colocado en la opcion SI");
								validacion2=true;
							}
							
							else if (Character.compare(siOno,N)==0) 
							{
								setChino(false);
								System.out.println( getChino() + " Chino se ha colocado en la opcion NO");
								validacion2=true;
							}
							else
							{
								System.out.println( siOno + " No es una opcion correcta.");
							}
						}
						while(!validacion2);
						//para que me sirva pra usarlo si cambia mas de un idioma
						validacion2=false;
						break;	
						
					case 3:
						do
						{
							System.out.println("Tiene conocimiento de Ingles: S/N");
							siOno=ent.next().charAt(0);
							siOno=Character.toUpperCase(siOno);
								
							if (Character.compare(siOno,S)==0)
							{
								setIngles(true);
								System.out.println( getIngles() + " Ingles se ha colocado en la opcion SI");
								validacion2=true;
							}
							
							else if (Character.compare(siOno,N)==0) 
							{
								setIngles(false);
								System.out.println( getIngles() + " Ingles se ha colocado en la opcion NO");
								validacion2=true;
							}
							else
							{
								System.out.println( siOno + " No es una opcion correcta.");
							}
						}
						while(!validacion2);
						//para que me sirva pra usarlo si cambia mas de un idioma
						validacion2=false;
						break;	
						
					case 4: validacion=true;
						break;	
					
					
					default: System.out.println(opcion + " no es valido. Seleccione una opcion correcta");
			
				}	
			}
			while(!validacion);
		
		}
	}

		
		
		

