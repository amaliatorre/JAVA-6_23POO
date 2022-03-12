import java.util.ArrayList;

/*Amalia 9Marzo*/
public class Personal 
{
	private String Dni, nombre, apellido, telefono, email;
	private char genero;
	private int edad;
	private double salario;
	ArrayList <Personal> profesoresLista= new ArrayList <Personal>();
	
	public Personal (final String Dni, String nombre,String apellido,String telefono, String email, char genero, int edad, double salario)
	{
		this.Dni=Dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.email=email;
		this.genero=genero;
		this.edad=edad;
		this.salario=salario;
	}

	/*BLOQUE GET SET*/
	public String getDni() {
		return Dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/*Metodos de Ejercicio*/
	/**
	 * Almacenamiento de la informacion contenida en personal y profesor  para mostrar
	 */
	public String toString ()
	{
		String genero;
		if (getGenero()=='M')
		{
			genero="Mujer";
		}
		else
		{
			genero="Hombre";
		}
		
		
		String informacion="Nombre: " +  getNombre() + "\nApellido: " +  getApellido() + "\nEdad: " +  getEdad() +
				 "\nTelefono: " +  getTelefono() + "\nEmail: " +  getEmail() + "\nGenero: " +  genero
				 + "\nSalario: " +  getSalario() ;
		
		return informacion;
	}


	
	
	/**
	 * Calcula la diferencia entre los 66 años de jubilacion y la edad del objeto
	 * @return
	 */
	public int anyosJubilacion()
	{
		int edadJub;
		
		edadJub= 65 - getEdad();
		
		return edadJub;
	}
	
	
}
