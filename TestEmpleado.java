package Parcial03;
/**
 * @author DR
 */
public class TestEmpleado 
{
	public static void main(String[] args) // METODO MAIN
        {
	    // TODO Auto-generated method stub
	    Jefe Objeto1 = new Jefe("JESUS", 1, 3000.55, 300.75);
	    Tecnico Objeto2 = new Tecnico("DOMINGO", 2, 1000.55, 100.75);

	    System.out.println("\n\t\tPROGRAMA QUE CALCULA EL SALARIO");
		
	    System.out.println(Objeto1.Obtener_Datos());
	    System.out.println(Objeto2.Obtener_Datos());
	    System.out.println("\n....................................................................\n");
	    System.out.println(" Jefe: "+Objeto1.Nombre()+""+Objeto1.Procesar_Salario());
	    System.out.println(" Técnico: "+Objeto2.Nombre()+""+Objeto2.Procesar_Salario());
            System.out.println(" ");
	}
}
