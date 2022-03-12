/*Amalia 9Marzo*/
import java.util.*;
public class Colegio 
{
	/*BLOQUE FUNCIONES*/
	/*VALIDACION ATRIBUTOS DE CONSTRUCTOR PROFESOR*/
	
	/*
	 *    
	 *    
	 *    
	 *    SALARIO - Controlar no menor de 425€/mes*/
	
	/*BLOQUE DNI*/
	public static String preguntaDni()
	{
		Scanner ent = new Scanner (System.in);
		String dni;
		
		do
		{
			System.out.println("Digame su dni:");
			dni= ent.nextLine();
			
			if(!validacionDni(dni)) 
			{
				System.out.println("El DNI es erroneo. Introduzcalo otra vez");
				System.out.println("****************************************");
			}
		}
		while (!validacionDni(dni));
		
		return dni;
	
	}
	
	public static boolean validacionDni(String x) 
	{
		boolean correcto=false;
		
		String soloLetraDni=x.substring(x.length() - 1);
	    char validacionLetra = soloLetraDni.charAt(0);
	    validacionLetra=Character.toUpperCase(validacionLetra);
	    
		String soloNumerosDni=x.substring(0, x.length() - 1);
		int validacionNumero=Integer.parseInt(soloNumerosDni);
		
		char letra=' ';
		int resultado=validacionNumero%23;
			
			switch(resultado)
			{
			case 0: letra='T';
				break;
				
			case 1: letra='R';
			break;
			
			case 2: letra='W';
			break;
			
			case 3: letra='A';
			break;
			
			case 4: letra='G';
			break;
			
			case 5: letra='M';
			break;
			
			case 6: letra='Y';
			break;
			
			case 7: letra='F';
			break;
			
			case 8: letra='P';
			break;
			
			case 9: letra='D';
			break;
			
			case 10: letra='X';
			break;
			
			case 11: letra='B';
			break;
			
			case 12: letra='N';
			break;
			
			case 13: letra='J';
			break;
			
			case 14: letra='Z';
			break;
			
			case 15: letra='S';
			break;
			
			case 16: letra='Q';
			break;
			
			case 17: letra='V';
			break; 
			
			case 18: letra='H';
			break;
			
			case 19: letra='L';
			break;
			
			case 20: letra='C';
			break;
			
			case 21: letra='K';
			break;
			
			case 22: letra='E';
			break;
			
			default: letra = '-';
	        break;
			}
	
		if (letra==validacionLetra)
		{
			correcto=true;
		}
		return correcto;	
	}
	

	/*BLOQUE EMAIL*/
	public static String preguntaEmail()
	{
		Scanner ent = new Scanner (System.in);
		String email;
		
		do
		{
			System.out.println("Digame su email:");
			email= ent.nextLine();
		}
		while(!validacionEmail(email));
		return email;
	}
	
	public static boolean validacionEmail(String email)
	{
		boolean correcto=false;
		
		/*Comprobar que contenga @ y .*/
		if (email.contains("@"))
		{
			if(email.contains("."))
			{
				correcto=true;
			}	
		}
		else
		{
			System.out.println("El correo no es valido porfavor introduzcalo otra vez");
			System.out.println("*****************************************************");
		}
		return correcto;
	}
	
	/*BLOQUE SEXO*/
	public static char preguntaSexo()
	{
		Scanner ent = new Scanner (System.in);
		char sexo;
		
		do
		{
			System.out.println("Digame su sexo:'H-Hombre / 'M'-Mujer");
			sexo=ent.next().charAt(0);
			sexo=Character.toUpperCase(sexo);
		}
		while(!validacionSexo(sexo));
		return sexo;
	}
	
	public static boolean validacionSexo(char sexo)
	{
		boolean correcto=false;
		
		if (Character.compare(sexo,'H')==0 || Character.compare(sexo,'M')==0)
		{
			correcto=true;
		}
		else
		{
			System.out.println("Hay un ERROR. Las opcion son H y M : 'H-Hombre / 'M'-Mujer \nIntentelo de Nuevo");
		}
		
		return correcto;
	}
	
	/*BLOQUE EDAD*/
	public static int preguntaEdad()
	{
		Scanner ent = new Scanner (System.in);
		int edad;
		do
		{
			System.out.println("Digame su edad:");
			edad=ent.nextInt();
		}
		while(!validacionSexo(edad));
		
		return edad;
	}
	/*Control de edad de mayor de edad a menor de 80*/
	public static boolean validacionSexo(int edad)
	{
		boolean correcto=false;
		
		if (edad>=18 && edad<=80)
		{
			correcto=true;
		}
		else
		{
			System.out.println("La edad intoducida no es correcta.\n Intentelo de nuevo");
			System.out.println("*******************************************************");
		}
		
		return correcto;
	}
	
	/*BLOQUE SALARIO*/
	public static double preguntaSalario()
	{
		Scanner ent = new Scanner (System.in);
		double salario;
		do
		{
			System.out.println("Digame su Salario:");
			salario=ent.nextDouble();
		}
		while(!validacionSalario(salario));
		
		return salario;
	}
	
	/*No puede ser menor de 425€*/
	public static boolean validacionSalario(double salario)
	{
		boolean correcto=false;
		if (salario>=425)
		{
			correcto=true;
		}
		else
		{
			System.out.println("Ha habido algun error!\nEl salario minimo por media jornada es de 425€-mes.\n Intentelo de nuevo");
			System.out.println("************************************************************************************************");
		}
		return correcto;
	}

	public static void preguntaYlistaIdiomas(boolean list[])
	{
		Scanner ent = new Scanner (System.in);
		String idioma, Respuesta;
		boolean  respuestaB=false, validacion=false; 
		
		
		for(int i=0; i<list.length; i++)
		{
			if (i==0)
			{
				idioma="Aleman";
			}
			else if(i==1)
			{
				idioma="Chino";	
			}
			else 
			{
				idioma="Ingles";	
			}
			do
			{	
				System.out.println("Habla usted " + idioma);
				System.out.println("S/N");
				Respuesta= ent.nextLine();
				
				if (Respuesta.equalsIgnoreCase("S"))
				{
					respuestaB=true;
					System.out.println("Se ha colocado en " + idioma + ", que  SI sabe");
					validacion=true;
				}
				else if (Respuesta.equalsIgnoreCase("N")) 
				{
					respuestaB=false;
					System.out.println("Se ha colocado en " + idioma + ", que NO sabe");
					validacion=true;
				}
				else
				{
					System.out.println("La opcion no es correcta, vuelva a contestar! Gracias");
				}
			}
			while(!validacion);	
			
			list[i]=respuestaB;
		}		
	}
	public static int  preguntaAnyosExperiencia()
	{
		Scanner ent = new Scanner (System.in);
		boolean validacion=false;
		int experiencia;
		
		do
		{
			System.out.println("Cuantos años de experiencia tiene:");
			experiencia= ent.nextInt();
			if (experiencia<0)
			{
				validacion=true;
			}
			else
			{
				System.out.println("Vuelva a intentarlo no puede tener un valor negativo");
			}
		}
		while(!validacion);
		
		return experiencia;	
	}
	
	
	
	/*PRINCIPAL*/
	public static void main (String args[]) 
	{
		Scanner ent = new Scanner (System.in);
		String nombre, apellido, telefono, areaAtencion, titulacion, asignatura1, asignatura2, tutor;
		boolean aleman, chino, ingles; 
		double salario;
		int anyosExperiencia;
		boolean listaIdiomas[]= new boolean [3];
	
		
		/*PAS*/
		/*Preguntas para constructor Pas*/
		System.out.println("Digame su nombre:");
		nombre= ent.nextLine();
		System.out.println("Digame su apellido:");
		apellido= ent.nextLine();
		System.out.println("Digame su telefono:");
		telefono= ent.nextLine();
	
		preguntaYlistaIdiomas(listaIdiomas);
		aleman=listaIdiomas[0];
		chino=listaIdiomas[1];
		ingles=listaIdiomas[2];
		
		System.out.println("Digame su Area de atención:");
		areaAtencion= ent.nextLine();
		
		PAS p1 = new PAS(preguntaDni(), nombre, apellido, telefono, preguntaEmail(),preguntaSexo(), preguntaEdad(), preguntaSalario(),aleman, chino, ingles, areaAtencion);
		System.out.println(p1.toString());
		System.out.println(p1.numIdiomas());
		System.out.println("AÑOS JUBILACION FALTAN:");
		System.out.println(p1.anyosJubilacion());
		p1.cambioIdiomas();
		System.out.println(p1.toString());

		System.out.println("------------------------------------------------------------------------");
		/*PROFESOR*/
		/*BLOQUE PREGUNTAS CONSTRUCTOR Profesor*/
		/*titulacion, asignatura 1 2 tutor años de experiencia*/
		System.out.println("Escriba su titulación:");
		titulacion= ent.nextLine();
		System.out.println("Escriba su asignatura 1:");
		asignatura1= ent.nextLine();
		System.out.println("Escriba su asignatura 2:");
		asignatura2= ent.nextLine();
		System.out.println("Escriba tutor:");
		tutor= ent.nextLine();

		anyosExperiencia=preguntaAnyosExperiencia();
		
		Profesor pR1 = new Profesor(preguntaDni(), nombre, apellido, telefono, preguntaEmail(),preguntaSexo(), preguntaEdad(), preguntaSalario(),titulacion, asignatura2, asignatura2, 
				tutor, anyosExperiencia);
		System.out.println(pR1.toString());
		System.out.println("AÑOS JUBILACION FALTAN:");
		System.out.println(pR1.anyosJubilacion());
		System.out.println("Aumento de salario por años de experiencia");
		System.out.println("Sus años de experiencia son: " + pR1.getAnyosExperiencia());
		System.out.println("Su salario actural es: " + pR1.getSalario());
		System.out.println("El aumento queda en: ");
		pR1.aumentoSalario();
		System.out.println(pR1.toString());
		
	
	}
}
