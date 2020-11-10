public class Gato extends Veterinaria{


    public Gato(String nombre, int edad){

        super(nombre, edad);

    }
    @Override
    public void MostrarEdad(){

        System.out.println(nombre+" tiene "+edad+" de edad");

    }

    @Override
    public void MostrarComida(){

        System.out.println(nombre+" come whiskas..");

    }
    @Override
    public void MostrarSonido(){


        System.out.println(nombre+" hace miau");
    }
}
