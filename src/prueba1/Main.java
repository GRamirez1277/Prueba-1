package prueba1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static RentItem buscarItem(ArrayList<RentItem> items,int codigo){
        for(RentItem item:items){
            if(item.getCodigo()==codigo){
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        ArrayList<RentItem> items = new ArrayList<>();
        int opcion=0;

        while (opcion!=5) {
            System.out.println("*****Bienvenido/a*****");
            System.out.println("1. Agregar Item");
            System.out.println("2. Consultar y Rentar Item");
            System.out.println("3. Ejecutar Sub Menú");
            System.out.println("4. Imprimir Todo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion=leer.nextInt();
            leer.nextLine();

            if(opcion==1){
                System.out.println("Ingrese el tipo de item (MOVIE/PS3): ");
                String tipo=leer.next().toUpperCase();
                System.out.println("Ingrese el código del item: ");
                int codigo=leer.nextInt();
                System.out.println("Ingrese el nombre del item: ");
                String nombre=leer.next();

                if(tipo.equals("MOVIE")){
                    System.out.println("Ingrese el precio de renta: ");
                    double precioRenta=leer.nextDouble();
                    items.add(new Movie(codigo, nombre, precioRenta));
                } else if (tipo.equals("PS3")) {
                    items.add(new PS3Game(codigo, nombre));
                } else {
                    System.out.println("TIPO INCORRECTO");
                }
            } else if(opcion == 2){
                System.out.println("Ingrese el código del item: ");
                int codigo=leer.nextInt();
                RentItem item=buscarItem(items, codigo);
                if(item!=null){
                    System.out.println(item.toString());
                    System.out.println("Ingrese los días a rentar: ");
                    int dias=leer.nextInt();
                    System.out.println("Monto a pagar: "+item.pagoRenta(dias));
                }else{
                    System.out.println("El item no existe");
                }
            }else if(opcion==3){
                System.out.println("Ingrese el código del item: ");
                int codigo=leer.nextInt();
                RentItem item=buscarItem(items,codigo);
                if(item!=null){
                    System.out.println(item.submenu());
                    System.out.println("Escoja una opción: ");
                    int subOpcion=leer.nextInt();
                    item.ejecutarOpcion(subOpcion);
                }else{
                    System.out.println("Item No Existe");
                }
            }else if(opcion==4){
                for(RentItem i:items){
                    System.out.println(i.toString());
                }
            }else if(opcion==5){
                leer.close();
                break;
            }else{
                System.out.println("Opción no válida");
            }
        }
    }

    
}

