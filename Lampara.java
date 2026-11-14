public class Lampara{
    boolean encendida = false;
    public Lampara (boolean encendida){
        this.encendida = encendida;
    }
    public void encender(){
        this.encendida = true;
    }
    public void apagar(){
        this.encendida = false;
    }
    public String estado(){
        if (this.encendida){
            return "Esta encendida";
        }
        else{
            return "Esta apagada";
        }
    }
    public static void main(String[] args) {
        Lampara lampara = new Lampara(false);
        System.out.println(lampara.estado());
        lampara.encender();
        System.out.println(lampara.estado());
        lampara.apagar();
        System.out.println(lampara.estado());
    }
}