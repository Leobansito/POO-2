public class Termometro {
    double temperatura = 0.0;
    public void subir(double grados){
        this.temperatura = temperatura + grados;
    }
    public void bajar(double grados){
        this.temperatura = temperatura - grados;
    }
    public void mostrarTemperatura(){
        System.out.println("La temperatura es de: "+temperatura);
    }
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.subir(10);
        termometro.mostrarTemperatura();
    }
}