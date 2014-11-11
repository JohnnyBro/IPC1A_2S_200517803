import java.util.Scanner;


public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.println("Verifique si un numero es Par o Impar ");
		System.out.println("Ingrese 99 para salir de la aplicacion");

		do{
			System.out.print("Ingrese un numero :");
			numero= s.nextInt();
			if (numero%2==0){
				System.out.println("El numero es PAR ");
				System.out.println("");
			}else{
				System.out.println("El numero es IMPAR ");
				System.out.println("");
			}
		}while(numero!=99);
		System.out.println("Ha salido del sistema ");
		s.close();
	}

}
