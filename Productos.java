public  abstract class Productos  extends Tienda implements Descuentos{

    protected int precio;//Precio del producto
    protected String modelo;//Modelo del producto
    protected int capacidad;//Capacidad del producto
    protected String categoria;//Categoria del producto
    protected String descripcion;//Descripcion del producto

    
    public Productos() {//Constructor vacío
    }

    public Productos(String nombre, int precio, String modelo, int capacidad,String descripcion) {//Constructor con los atributos del producto
        super(nombre);
        this.precio = precio;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.descripcion=descripcion;
    }
    public Productos(String nombre, int precio, String modelo, String descripcion) {//Constructor con los atributos del producto sin capacidad
        super(nombre);
        this.precio = precio;
        this.modelo = modelo;

        this.descripcion=descripcion;
    }

    @Override
    public void ofreceDescuento(int descuento) {//implementacion de la interfaz de los descuentos
        System.out.println("Ahora vale "+(this.precio-descuento));
        
    }

    @Override
    protected String consultaPrecio(Object producto) {//Método abstracto con su propia implementacion
        Productos resultado = (Productos) producto;
        String precio=Integer.toString(resultado.precio);
        return "El precio es de: "+ precio;
    }
    protected abstract void obtenerDescripcion();//Metodo abstracto para obtener la descripcion
    
    @Override
    public String toString() {//método toString para que cuando lo mostremos por pantalla nos salgan los atributos
        
        return "El dispositivo se llama "+this.nombre+ " y vale "+this.precio;
    }


}

    
