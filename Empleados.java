public class Empleados extends Tienda implements DatosTrabajador {

    private int edad;   //Edad del Empleado
    private double sueldo; //Sueldo  del Empleado
    private  String apellidos;//Apellidos del empleado

    public Productos[][] array;


    Empleados(){//Constructor vacio

    }

    public Empleados(int edad, double sueldo, String apellidos) { //Constructor sin nombre
        this.edad = edad;
        this.sueldo = sueldo;
        this.apellidos = apellidos;
        array= new Productos [10][10];
    }
    public Empleados(String nombre, int edad, double sueldo, String apellidos) {//Constructor general de todos los atributos super se usa para la herencia del padre
        super(nombre);
        this.edad = edad;
        this.sueldo = sueldo;
        this.apellidos = apellidos;
        array= new Productos [2][3];
    }


    public int getEdad() {//Método que nos devuelve la edad
        return edad;
    }
    
    public double getSueldo() {//Método que nos devuelve el sueldo
        return sueldo;
    }
    
    public String getApellidos() {//Método que nos devuelve los apellidos
        return apellidos;
    }
    
    public void setEdad(int edad) {//Método para modificar la edad
        this.edad = edad;
    }
    
    public void setSueldo(double sueldo) {//Método para modificar el sueldo
        this.sueldo = sueldo;
    }
    
    public void setApellidos(String apellidos) {//Método para modificar los apellidos
        this.apellidos = apellidos;
    }
    
    @Override
    protected String consultaPrecio(Object producto) {//Método abstracto heredado de Tienda muestra el precio de los productos que pasa por parámetro de la clase Object y con casting accedemos y convertios a sus atributos
        Productos resultado= (Productos) producto;
        return "Buenas tardes el precio del producto "+resultado.nombre+" es de "+resultado.precio;
    }

    @Override
    public void saludo() {//Método para saludar para cada objeto diferente
        System.out.println("Un placer soy "+this.nombre);
        
    }

    @Override
    public void subeSueldo(int subida) {//Método para subir el sueldo a cada objeto
        this.sueldo+=subida;
        System.out.println("Me han subido el sueldo y ahora cobro: "+this.sueldo);
        
    }

    @Override
    public void vendeProducto(Object producto) {//Método para vender los productos
        Productos resultado= (Productos) producto;
        System.out.println("He vendido el producto "+resultado.nombre+" por este precio "+resultado.precio);
        
    }
    @Override
    public String toString() {//Método toString para cuando pogamos por pantalla los objetos recibamos todos los datos en vez de la posicion en memoria
        return "Hola soy "+this.nombre+" "+this.apellidos+ " tengo esta edad "+this.edad+" y mi sueldo es de "+this.sueldo;
    }
    public void registraProducto(Object producto){//método para hacer un registro de un solo producto 
            Productos resultado=(Productos) producto;
            System.out.println("Registrando el producto "+resultado.nombre+" el precio  "+resultado.precio+" la categoria es "+resultado.categoria);
    }
    public void mostrarProductos(){//método paramostrar los productos
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
        
                System.out.println(
                "El producto "+array[i][j].nombre+" tiene la siguiente descripcion "+array[i][j].descripcion+" tiene el siguiente precio "+array[i][j].precio+" y su categoria es "+array[i][j].categoria 
                );
                
            }
            System.out.println(" ");
        }
    }
    public void guardaProductos(Object producto){//Método para guardar los productos
        int contador1=0;
        int contador=0;
        Productos productos= (Productos) producto;
        for(int i=0;i<3;i++){
                if(productos.categoria=="Dispositivo" ){
                    array[0][contador1]=productos;
                    contador1++;
                }
                if(productos.categoria=="Accesorio" ) {
                    array[1][contador]=productos;
                    contador++;
                }
            }
        }
    }
