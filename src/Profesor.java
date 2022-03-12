import java.util.ArrayList;

/*Amalia 9Marzo*/
public class Profesor extends Personal
{
	/*Este nivel es el mas bajo ya que se podria crear otra clase secretario con otras consiciones pero con las mismas 
	 * caracteristicas genericas de personal y pass*/
	private String titulacion, asignatura1, asignatura2, tutor;
	private int anyosExperiencia;
	
	
	
	public Profesor (final String Dni, String nombre,final String apellido,String telefono, String email,
			char genero, int edad, double salario,String titulacion, String asignatura1, String asignatura2, 
			String tutor, int anyosExperiencia)
	{
		super(Dni, nombre,apellido,telefono, email,genero, edad, salario);
		
		this.titulacion=titulacion;
		this.asignatura1=asignatura1;
		this.asignatura2=asignatura2;
		this.tutor=tutor;
		this.anyosExperiencia=anyosExperiencia;
		
	}

/*BLOQUE GET Y SET*/
	public String getTitulacion() {
		return titulacion;
	}


	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}


	public String getAsignatura1() {
		return asignatura1;
	}


	public void setAsignatura1(String asignatura1) {
		this.asignatura1 = asignatura1;
	}


	public String getAsignatura2() {
		return asignatura2;
	}


	public void setAsignatura2(String asignatura2) {
		this.asignatura2 = asignatura2;
	}


	public String getTutor() {
		return tutor;
	}


	public void setTutor(String tutor) {
		this.tutor = tutor;
	}


	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}


	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}
	
	
/*METODOS EJERCICIO*/
	
	/**
	 * Almacenamiento de la informacion contenida en personal y profesor  para mostrar
	 */
	public String toString()
	{
		String informacion;
		
		informacion = super.toString() + "\nTitulacion: " +  getTitulacion() + "\nAsignatura1: " +  getAsignatura1() +
				"\nAsignatura2: " +  getAsignatura2() + "\nTutor: " +  getTutor() + "\nAños de experiencia: " +  getAnyosExperiencia();
		return informacion;
	}
	
	
	/*>=5-->5%, >=3-->2%, >=1-->1%, con respecto a los años de experiencia */
	/**
	 * Calacula el aumento de salario con respecto a los intervalos 1 y 5 
	 */
	public void aumentoSalario()
	{
		double salarioActual, aumento;
		
		/*igual o menor de 1*/
		if (getAnyosExperiencia()>=1 && getAnyosExperiencia()<=2)
		{
			aumento= super.getSalario()*0.01;
			salarioActual= super.getSalario() + aumento;
			super.setSalario(salarioActual);
		}
		
		/*el intervalo entre igual o menor de 3 y 4 */
		else if (getAnyosExperiencia()>=3 && getAnyosExperiencia()<5 ) 
		{
			aumento= super.getSalario()*0.02;
			salarioActual= super.getSalario() + aumento;
			super.setSalario(salarioActual);
		}
		
		/*igual o mayor que 5*/
		else
		{
			aumento= super.getSalario()*0.05;
			salarioActual= super.getSalario() + aumento;
			super.setSalario(salarioActual);
		}
	}
}
