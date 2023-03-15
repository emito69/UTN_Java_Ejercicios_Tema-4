
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ejerciciosClase4_2 {
    public static void main(String[] args) {
        // EJERCICIOS 2 / 2.a
        System.out.println("\n");
        System.out.println("EJERCICIOS 2 / 2.a " + "\n");
        //
        String rutaAbsoluta = "";
        String operacion = "+";

        if (args.length == 0 || args.length > 2) { //si no hay o si hay muchos
            rutaAbsoluta = "src/main/java/archivos/archivo.txt";
            }

        if (args.length == 1) { // sólo PATH
            rutaAbsoluta = args[0];
        }

        if (args.length == 2) { // sólo PATH
            rutaAbsoluta = args[0];
            operacion = args[1];  // + o *
        }

        Path pathArchivo = Paths.get(rutaAbsoluta); // necesito tipo Path

        int resultado=0;

        try {
            String texto = Files.readString(pathArchivo);
            String[] temp = texto.split(" "); // se crea un array de strings de los splits que conforman ese texto

            if (operacion.equals("+")) {
                resultado=0;
                for (int i = 0; i < temp.length; i++) {
                    resultado += Integer.parseInt(temp[i]); // convierto a integrer y sumo
                }
            }
            if (operacion.equals("*")) {
                resultado=1;
                for (int i = 0; i < temp.length; i++) {
                    resultado *= Integer.parseInt(temp[i]); // convierto a integrer y sumo
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Resultado de la operación seleccionada " + "(" + operacion +")" +" es igual a :" + resultado);

    }
}
