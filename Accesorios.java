public class Accesorios extends Productos implements Acce{

    

    public Accesorios(String nombre, int precio, String modelo, String color,String descripcion) {//constructor de accesorios paso directamente su categoria
        super(nombre, precio, modelo, descripcion);
        this.color = color;
        this.categoria="Accesorio";
    }

    private String color;//atributo con el color

    public String getColor() {//metodo para obtener el color
        return color;
    }

    public void setColor(String color) {//Método para modificar el color
        this.color = color;
    }

    @Override
    protected void obtenerDescripcion() {//Método abstracto que muestra la descripcion del accesorio
        System.out.println("El accesorio : "+this.nombre+" tiene este precio "+this.precio+" el modelo del accesorio es "+ this.modelo+" y es de color "+this.color);        
    }

    
}