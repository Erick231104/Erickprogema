import java.util.Scanner;

public class App {
   

 public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }
         
        // Aqui va el metodo inverso
     System.out.println("Mostrar el metodo inverso ");

     int[] arreglo = new int[tamv];
     try {
        for( int i = 0; i < arreglo.length; i++){
            arreglo[i] = a[a.length - i - 1];
        }
     } catch (Exception e) {
        System.out.println("Error: Se produjo una excepción de índice fuera de los límites.");
      }

     for (int i : arreglo){
        System.out.println(i);
     }
    
    }    
    
   
}

//Nombre: Erick Mateo Sequeira Centeno
//NUmero de carnet: 2024-1660U
