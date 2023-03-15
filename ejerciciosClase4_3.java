import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ejerciciosClase4_3 {

    public static void main(String[] args) {

        // EJERCICIOS 3
        System.out.println("\n");
        System.out.println("EJERCICIO 3" + "\n");
        //////////////////
        // PARÁMETROS A SETEAR
        String operacion = "code"; // code o decode
        int desplazo = 2;
        String rutaArchivoEntrada = "src/main/java/archivos/archivoEntrada.txt";
        String rutaArchivoSalida = "src/main/java/archivos/archivoSalida.txt";
        ///////////////////

        Path pathArchivoEntrada = Paths.get(rutaArchivoEntrada); // necesito tipo Path
        Path pathArchivoSalida = Paths.get(rutaArchivoSalida); // necesito tipo Path

        String temp = "";

        try {
            String textoEntrada = Files.readString(pathArchivoEntrada);
            //// CODE
            if (operacion.equals("code")) {

                int vector2[] = new int[textoEntrada.length()]; //armo un vector con la cantidad de elementos que necesito
                char vector3[] = new char[textoEntrada.length()];

                for(int j=0; j < vector2.length; j++){
                    vector2[j] = (int) textoEntrada.charAt(j); // hago el casting de char a int para obtener el código ascii
                    vector2[j] += desplazo;
                    vector3[j] = (char) vector2[j]; //casteo cada ascii desplazado a char nuevamente
                }
                String nuevoString = new String(vector3); //casteo un array de char a String

                System.out.println("El string original es: " + textoEntrada);
                System.out.println("El string desplazado:  " + nuevoString);

                Files.writeString(pathArchivoSalida, nuevoString);

                //Files.createFile(pathArchivoSalida);
                if (Files.exists(pathArchivoSalida)) {
                    System.out.println("El archivo se creo correctamente.");
                }else{
                    System.out.println("El archivo no pudo crearse correctamente.");
                }
            }
            //// DECODE
            if (operacion.equals("decode")) {
                /// NO COMPRENDÍ DEL ENUNCIADO DEL EJERCICIO LO QUE DEBE HACER EN LA OPCIÓN "DECODE"
                System.out.println("NO COMPRENDÍ DEL ENUNCIADO DEL EJERCICIO LO QUE DEBE HACER EN LA OPCIÓN 'DECODE'.");
            }

        }  // termina el TRY
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
