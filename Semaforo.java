public class Semaforo {
    String color = "Rojo";
    public void cambiarRojo(){
        this.color = "Rojo";
    }
    public void cambiarAmarillo(){
        this.color = "Amarillo";
    }
    public void cambiarVerde(){
        this.color = "Verde";
    }
    public void mostrarColor(){
        System.out.println("El color del semaforo es: " + this.color);
    }
    
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.mostrarColor();
        semaforo.cambiarAmarillo();
        semaforo.mostrarColor();
        semaforo.cambiarVerde();
        semaforo.mostrarColor();
    }
}
