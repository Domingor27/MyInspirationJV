package Parcial03;
/**
 * @author DR
 */
public class Jefe extends Empleado 
{
	private double Bono1;

        // CONSTRUCTOR
	public Jefe( String Nombre, int NumeroEmpleado, double Salario, double Bono1 ) 
	{
	    super(Nombre, NumeroEmpleado, Salario);
	    this.Bono1 = Bono1;
	}

        // METODO
	public String Procesar_Salario() 
	{
	    Bono1 = Bono1 + Salario;
	    return " -> Su Salario Mensual mas bono extra es de B/: " + Bono1;
	}

}

