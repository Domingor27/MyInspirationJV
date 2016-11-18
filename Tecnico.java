package Parcial03;
/**
 * @author DR
 */
public class Tecnico extends Empleado
{
	private double Bono2;

        // CONSTRUCTOR
	public Tecnico( String Nombre, int NumeroEmpleado, double Salario, double Bono2 ) 
	{
	    super(Nombre, NumeroEmpleado, Salario);
            this.Bono2 = Bono2;
	}

        // METODO
	public String Procesar_Salario() 
	{
	    Bono2 = Bono2 + Salario;
	    return " -> Su Salario Mensual mas bono extra es de B/: " + Bono2;
	}

}