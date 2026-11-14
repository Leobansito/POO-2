public class Puerta {
    boolean abierta = false;
    public void abrir(){
        this.abierta = true;
    }
    public void cerrar(){
        this.abierta = false;
    }
    public void estado(){
        if(this.abierta){
            System.out.println("La puerta esta abierta bro");
        }
        else{
            System.out.println("La puerta esta cerrada bro");
        }
    }
    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        puerta.estado();
        puerta.abrir();
        puerta.estado();
    }
}
