package Parcial03;
/**
 * @author DR
 */
public class Empleado 
{
	// ATRIBUTOS
	public String Nombre;
	public int NumeroEmpleado;
	public double Salario;

	// CONSTRUCTOR
	public Empleado( String Nombre, int NumeroEmpleado, double Salario ) 
	{
	    this.Nombre = Nombre;
	    this.NumeroEmpleado = NumeroEmpleado;
	    this.Salario = Salario;
	}

	// METODOS
	public String Obtener_Datos() //GETTER
	{
	    return "\n N#" + NumeroEmpleado + " -> Nombre: " + Nombre + " -> Su Salario Mensual es de B/: " + Salario;
	}

	public String Nombre() //GETTER
	{
	    return Nombre;
	}

	public int NumeroEmpleado() //GETTER
	{
	    return NumeroEmpleado;
	}

	public double Salario() //GETTER
	{
	    return Salario;
	}

}