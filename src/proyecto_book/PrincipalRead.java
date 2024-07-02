package proyecto_book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrincipalRead {

    public static void main(String[] args) {
        // Lectura de un archivo 
        File f; // Convertir el archivo físico en objeto
        FileReader fr; // Abrir una canaleta de comunicación (origen)
        BufferedReader br; // Leer

        String fila = ""; // Aquí guardamos lo que el programa lee
        List<String> filas = new ArrayList<>(); // Lista para almacenar las filas

        try {
            f = new File("data/Book.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) { // Saltar la primera fila (cabecera)
                    filas.add(fila);
                }
                i++;
            }

            // Cerrar el BufferedReader
            br.close();

            // Imprimir el contenido leído
            System.out.println("Contenido del archivo:");
            for (int row = 0; row < filas.size(); row++) {
                System.out.println(row + " " + filas.get(row));
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "404", JOptionPane.ERROR_MESSAGE);
        }
    }
}
