public class main {
    public static void main(String[] args) {
        Empleados empleado= new Empleados("jose", 20, 1000, "Moreno ramon");
        Dispositivos dispositivo= new Dispositivos("portatil", 1000, "Samsumg", 500, 2,"Es muy bonito");//Creo un objeto Empleado
        Accesorios accesorios= new Accesorios("Funda", 10, "laminar",  "rosa", "muy bonito");//Creo un dispositivo
       System.out.println(dispositivo.categoria);
       //Llmada a metodo guarda para guardar los objetos
       empleado.guardaProductos(dispositivo);
       empleado.guardaProductos(dispositivo);
       empleado.guardaProductos(dispositivo);
       empleado.guardaProductos(accesorios);
       empleado.guardaProductos(accesorios);
       empleado.guardaProductos(accesorios);

        //Metodos de empleado
       empleado.mostrarProductos();
       empleado.subeSueldo(100);
        System.out.println(empleado);
    }
}
