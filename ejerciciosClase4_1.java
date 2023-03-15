
import java.util.Scanner; // para poder usar Scanner

public class ejerciciosClase4_1 {
         public static void main(String args[]) {

             // EJERCICIOS 1.a / 1.b / 1.c
             System.out.println("\n");
             System.out.println("EJERCICIOS 1.a / 1.b / 1.c " + "\n");
             //
             if (args.length == 4) { //si hay parámetros

                 // parámetro ponga 3 números y una letra que represente ascendente o descendente y los muestre ordenados por tal criterio
                 int num1 = Integer.parseInt(args[0]);
                 int num2 = Integer.parseInt(args[1]);
                 int num3 = Integer.parseInt(args[2]);
                 String letra = args[3];
                 boolean ascendente = true;

                 if (letra.equalsIgnoreCase("D")) {
                     ascendente = false;
                 }
                 System.out.println("Parámetros pasados: ");
                 for(String s: args) {
                     System.out.print(s + " ");
                 }
                 System.out.println("");

                 int[] miarray = new int[3];

                 miarray = funcionOrdenar(num1, num2, num3, ascendente);

                for (int e : miarray) {
                    System.out.print(e + " ");
                }

             } else if (args.length == 0) { //si no hay parámetros
                 // lo mismo, pero solicitando los parámetros de a uno por consola

                 Scanner entrada = new Scanner(System.in); //el origen es la consola System.in
                 System.out.println("Introduzca nro1:");
                 int num1 = Integer.parseInt(entrada.nextLine());
                 System.out.println("Introduzca nro2:");
                 int num2 = Integer.parseInt(entrada.nextLine());
                 System.out.println("Introduzca nro3:");
                 int num3 = Integer.parseInt(entrada.nextLine());
                 System.out.println("Introduzca 'A' o 'D' (ascendente o descendente):");
                 String letra = entrada.nextLine();

                 boolean ascendente = true;

                 if (letra.equalsIgnoreCase("D")) {
                     ascendente = false;
                 }

                 int[] miarray = new int[3];

                 miarray = funcionOrdenar(num1, num2, num3, ascendente);

                 for (int e : miarray) {
                     System.out.print(e + " ");
                 }
                 System.out.println("\n");

             } else if (args.length > 0 || args.length < 4 ){
                  System.out.println("Hay pocos parámetros.");
             } else if (args.length > 4 ){
                  System.out.println("Hay demasiados parámetros.");
             }
         }



   public static int[] funcionOrdenar(int num1, int num2, int num3, boolean asc) {

            int miarray[] = new int[3];
            boolean ascendente = asc;
            int nro1 = num1;
            int nro2 = num2;
            int nro3 = num3;

            int primero;
            int segundo;
            int tercero;

            primero = nro1;
            if (nro2 >= primero) {
                primero = nro2;
            }
            ;
            if (nro3 >= primero) {
                primero = nro3;
            }

            tercero = nro1;
            if (nro2 <= tercero) {
                tercero = nro2;
            }
            ;
            if (nro3 <= tercero) {
                tercero = nro3;
            }

            segundo = nro1;
            if ((nro2 < primero) && (nro2 > tercero)) {
                segundo = nro2;
            }
            if ((nro3 < primero) && (nro3 > tercero)) {
                segundo = nro3;
            }

            miarray[0] = primero;
            miarray[1] = segundo;
            miarray[2] = tercero;


            if (ascendente == true) {
                System.out.println("Orden ASCENDENTE");
                miarray[0] = tercero;
                miarray[2] = primero;
                return miarray;

            } else {
                System.out.println("Orden DESCENDENTE");
            }

            return miarray;
    }


}
