public class Animal extends Veterinaria{

    String comida;
    String sonido;

    public Animal(String nombre, int edad, String comida, String sonido){

        super(nombre, edad);
        this.comida = comida;
        this.sonido = sonido;
    }

    @Override
    public void MostrarEdad(){

        System.out.println(nombre+" tiene "+edad+" anos de edad");

    }

    @Override
    public void MostrarComida(){

        System.out.println(nombre+" come "+comida);

    }
    @Override
    public void MostrarSonido(){


        System.out.println(nombre+" emite un sonido de "+sonido);
    }
    
}
