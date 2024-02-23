public abstract class Tienda {

    protected String nombre; //Todas las clases hijas van a tener un nombre 

    Tienda(){//constructor vacio

    }
    Tienda(String nombre){//Constructor con el nombre
        this.nombre=nombre;
    }
    

    protected abstract String consultaPrecio(Object producto);//Método abstracto que segun la clase modificará el comportamiento
    
}