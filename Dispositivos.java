public class Dispositivos extends Productos implements Dispo{

    private int tamanio;//Tamaño del dispositivo
    
    
    public Dispositivos(int tamanio) {//Constructor del dispositivo
        this.tamanio = tamanio;
    }

    public Dispositivos(String nombre, int precio, String modelo, int capacidad, int tamanio,String descripcion) {// constructor con todos los atributos heredados
        super(nombre, precio, modelo, capacidad,descripcion);
        this.tamanio = tamanio;
        this.categoria="Dispositivo";
    }


    public int getTamanio() {//Metodo para obtener el tamaño
        return tamanio;
    }

    public void setTamanio(int tamanio) {//Metodo para modificar el tamaño
        this.tamanio = tamanio;
    }
    
    @Override
    protected void obtenerDescripcion() {//Metodo para obtener la
        System.out.println("El dispositivo : "+this.nombre+" tiene este precio "+this.precio+" esta capacidad "+this.capacidad+" gb "+" el modelo es "+ this.modelo);
        
    }



}