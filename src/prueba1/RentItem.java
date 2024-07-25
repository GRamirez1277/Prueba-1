package prueba1;

public class RentItem {
    protected int codigo;
    protected String nombre;
    protected double precioRenta;
    protected int cantidadCopias;

    public RentItem(int codigo,String nombre,double precioRenta) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioRenta=precioRenta;
        this.cantidadCopias=0;
    }
    
    public String toString(){
        return "Código del Item: "+codigo+"\nItem: "+nombre+"\nPrecio de Renta del Item: "+precioRenta+"\nCopias en existencia: "+cantidadCopias;
    }
    
    public double pagoRenta(int dias){
        return 0;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precioRenta;
    }
    
    public int getCantidadCopias() {
        return cantidadCopias;
    }
    
    public String submenu(){
        return "1-Imprimir";
    }
    
    public void ejecutarOpcion(int opcion){
        if(opcion==1)
            System.out.println(toString());
        System.out.println("Opcion No Valida");
    }

}
