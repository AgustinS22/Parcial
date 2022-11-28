package Interfaz;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Logica.*;


public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cafe latte = new Cafe(1, "Cafe Latte", 1.5);
		Cafe capuccino = new Cafe(2, "Cafe Flat White", 2.5);
		Cafe expresso = new Cafe(3, "Cafe Lagrima", 1.3);
		Cafe doble = new Cafe(4, "Cafe Expresso", 1);
		LinkedList<Cafe> cafes = new LinkedList<>();
		cafes.add(latte);
		cafes.add(capuccino);
		cafes.add(expresso);
		cafes.add(doble);
		
		Tarjeta tarjeta1 = new Tarjeta(111, false);
		Tarjeta tarjeta2 = new Tarjeta(112, true);
		Tarjeta tarjeta3 = new Tarjeta(113, false);
		Tarjeta tarjeta4 = new Tarjeta(114, true);
		Tarjeta tarjeta5 = new Tarjeta(115, true);
		Tarjeta tarjeta6 = new Tarjeta(116, false);
		
		
		Encargado encargado = new Encargado(123,"Agustin", "1567");
		LinkedList<Venta> ventas = new LinkedList<>();
		int dato;
		boolean verd;
		String op;
		verd= encargado.validarEncargado(encargado);
		if (verd) {
		do  {
			dato = menu();
			if (dato == 1) {
				menuVenta(ventas, cafes);
			} else if (dato == 2) {
				menuConsulta(ventas);
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.");
			}	
		op = JOptionPane.showInputDialog("Desea volver a realizar una consulta? \nSI o NO");
		} while (op.equalsIgnoreCase("si"));
		}
		
		
		
		
		
	}

	
	
	public static int menu() {
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar? \n 1 - Ingresar una nueva venta \n 2 - Finalizar el dia"));
		return op;		
	}
	
	public static void menuVenta(LinkedList<Venta> ventas, LinkedList<Cafe> cafes) {
		int id = 0;
		JOptionPane.showMessageDialog(null, "Que tipo de cafe desea cargar? \n Las opciones son las siguientes: \n" + cafes.get(0).getTipo_cafe() + "\n" + cafes.get(1).getTipo_cafe() + "\n" + cafes.get(2).getTipo_cafe() + "\n" + cafes.get(3).getTipo_cafe());
				
	}
	
	public static void menuConsulta(LinkedList<Venta> ventas) {
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar? \n 1 - Mostrar todas las ventas \n 2 - Mostrar que tipo de cafe se vendio mas \n 3 - Mostrar recaudacion total \n 4 - Mostrar las ventas con descuento \n 5 - Quiero eliminar una venta"));
		switch (op) {
		case 1:
			for (int i = 0; i < ventas.size(); i++) {
				JOptionPane.showMessageDialog(null, ventas);
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
			
		}
	
	}
}


