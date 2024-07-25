package prueba1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<RentItem> items=new ArrayList<>();
        Scanner leer=new Scanner(System.in);

            System.out.println("Menú:");
            System.out.println("1. Agregar Item");
            System.out.println("2. Ejecutar Sub Menú");
            System.out.println("3. Imprimir Todo");
            System.out.println("4. Salir");
            System.out.print("Escoja Opción: ");
            int opcion = leer.nextInt();

}
}
