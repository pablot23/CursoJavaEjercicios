package Clase1;

public class ejer2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ingmes   = 10000 ;
		int cantvehic  = 3 ;
		int antigvehic = 1 ;
		int cantinmb   = 1 ;
		boolean emb_aero = false;
		
		if (ingmes >= 489083 || (cantvehic >=3 && antigvehic <=5) || cantinmb >=3 || emb_aero == true)
		{	
			System.out.println("Es de Ingresos AltoS");
		}
		else
		{
			System.out.println("No es de Ingresos ALtos");
		}
		
	}

}
