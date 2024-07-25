package prueba1;

import java.util.Calendar;
import java.util.Scanner;

public class PS3Game extends RentItem{
    
    Scanner leer=new Scanner(System.in);
    protected Calendar publicacion;
    public static final double rentaPS3=30;
    
    public PS3Game(int codigo,String nombre){
        super(codigo,nombre,rentaPS3);
        publicacion=Calendar.getInstance();
    }
    
    @Override
    public String toString(){
        int year=publicacion.get(Calendar.YEAR);
        int mes=publicacion.get(Calendar.MONTH)+1;
        int dia=publicacion.get(Calendar.DAY_OF_MONTH);
        return super.toString()+"Fecha de Publicación: "+year+" - "+mes+" - "+dia+" - PS3 Game";
    }
    
    public void setFechaPublicacion(int year,int mes,int dia){
        publicacion.set(year,mes-1,dia);
        
    }
    
    @Override
    public double pagoRenta(int dias){
        return rentaPS3*dias;
    }
    
    @Override
    public String submenu(){
        return super.submenu()+"\n2-Actualizar Fecha de Publicacion";
    }
    
    @Override
    public void ejecutarOpcion(int opcion){
        if(opcion==1){
            System.out.println(toString());
        }else if(opcion==2){
            System.out.println("Ingrese el año de publicación:");
            int year=leer.nextInt();
            System.out.println("Ingrese el mes de publicación:");
            int mes=leer.nextInt();
            System.out.println("Ingrese el día de publicación:");
            int dia=leer.nextInt();
            setFechaPublicacion(year, mes, dia);
        }else{
            System.out.println("OPCION NO VALIDA");
        }
    }
}
