package prueba1;
import java.util.Scanner;

public class Movie extends RentItem{
    
    Scanner leer=new Scanner(System.in);
    protected String estado;
    
    public Movie(int codigo,String nombre,double precioRenta) {
        super(codigo,nombre,precioRenta);
        estado="ESTRENO";
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nEstado: "+estado+" - Movie";
    }
    
    @Override
    public double pagoRenta(int dias){
        double pago=super.precioRenta;
        if(estado.equalsIgnoreCase("ESTRENO")&&dias>2){
            pago+=(dias-2)*50;
        }else if(estado.equalsIgnoreCase("NORMAL")&&dias>5){
            pago+=(dias-5)*30;
        }
        return pago;
    }
    
    @Override
    public String submenu(){
        return super.submenu()+"\n2-Cambiar Estado";
    }
    
    @Override
    public void ejecutarOpcion(int opcion){
        if(opcion==2){
            System.out.println("Ingrese el nuevo estado de la pelicula:");
            estado=leer.nextLine();
        }else if(opcion==3){
            System.out.println("Opcion No Valida");
        }else{
            super.ejecutarOpcion(opcion);
        }
    }
    
}
