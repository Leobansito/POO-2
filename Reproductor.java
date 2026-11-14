public class Reproductor {
    String cancion = "";
    boolean reproduciendo = false;
    public void reproducir(String cancion){
        this.cancion = cancion;
        this.reproduciendo = true;
    }
    public void pausar(){
        this.reproduciendo = false;
    }
    public void estado(){
        if (this.reproduciendo){
            System.out.println("Se esta reproduciendo " +this.cancion);
        }
        else{
            System.out.println("El reproductor esta apagado");
        }
    }
    public static void main(String[] args) {
        Reproductor rep = new Reproductor();
        rep.estado();
        rep.reproducir("Aura");
        rep.estado();
        rep.pausar();
        rep.estado();
    }
}
