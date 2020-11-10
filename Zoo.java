import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Veterinaria animal[] = new Veterinaria[11];

            animal[0] = new Gato("Missy", 3);
            animal[1] = new Perro("Sasha",4);


        String nom;
        int tamano = 1;
        char tecla;
        int aux = 0;
        

        System.out.println("\n");


        do{

            
            
                
                System.out.print("\t\tMenu");
                System.out.print("\n\n");
                System.out.println(" [ 1 ] Consultar Animales");
                System.out.println(" [ 2 ] Agregar nuevo animal");
                System.out.println(" [ 3 ] Eliminar animal");
                System.out.println(" [ 4 ] Salir");
                System.out.print("\nIngrese la opcion que desee: ");
    
                tecla = entrada.next().charAt(0);
                System.out.print("\n");
                

                switch(tecla){

                    case '1':
                    
                                for(int i=0; i<=tamano; i++){

                                    animal[i].MostrarEdad();
                                    animal[i].MostrarComida();
                                    animal[i].MostrarSonido();
                                    System.out.println();

                                }
                                break;

                    case '2': 

                                entrada.nextLine();
                                System.out.print("Ingrese el nombre: ");
                                String nombre = entrada.nextLine();
                                System.out.print("Ingrese la edad: ");
                                int edad = entrada.nextInt();
                                entrada.nextLine();
                                System.out.print("Ingrese la comida que come: ");
                                String comida = entrada.nextLine();
                                System.out.print("Ingrese el sonido que emite: ");
                                String sonido = entrada.nextLine();
                                System.out.println();
                                
                                tamano++;
                                animal[tamano] = new Animal(nombre, edad, comida, sonido);
                                break;

                    case '3': 
                                
                                System.out.print("Ingrese el animal que desea eliminar: ");
                                entrada.nextLine();
                                nom = entrada.nextLine();
                        
                                for(int i=0; i<=tamano; i++){
                        
                                    if(animal[i].getNombre().equalsIgnoreCase(nom)){
                                        animal[i] = animal[i+1];
                                        tamano--;
                                        aux = 1;
                                        
                                    }else {
                                        aux = 0;

                                    }

                                }

                                    if(aux == 1){

                                        System.out.println("Eliminacion exitosa");
                                    }else{

                                        System.out.println("Eliminacion fallida, nombre no encontrado");
                                    }
                                    

                                
                                break;

                    case '4': System.exit(0); break;           
                    
                }

                    System.out.println("\nDesea hacer otra operacion? [S / N]");
                    tecla = entrada.next().charAt(0);      

            }while(tecla == 's' || tecla == 'S');        
    }
  

}


