package prueba1;

import java.util.Scanner;

public class Movie extends RentItem{
    
    Scanner leer=new Scanner(System.in);
    protected String estado;
    
    public Movie(int codigo,String nombre,double precioRenta) {
        super(codigo,nombre,precioRenta);
        estado="ESTRENO";
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado) {
        this.estado=estado;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nEstado: "+estado+" - Movie";
    }
    
    @Override
    public double pagoRenta(int dias){
        double pago=super.getPrecio();
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
        if(opcion==1){
            System.out.println(toString());
        }else if(opcion==2){
            System.out.println("Ingrese el nuevo estado de la pelicula:");
            estado=leer.nextLine();
        } else {
            System.out.println("OPCION NO VALIDA");
        }
    }
    
}
