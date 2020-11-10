public abstract class Veterinaria {

    protected String nombre;
    protected int edad;

    public Veterinaria(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void MostrarEdad();
    public abstract void MostrarComida();
    public abstract void MostrarSonido();

    public String getNombre(){

        return nombre;
    }


}
