package archivos_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lectura {

    public static void main(String[] args) {
        //Lectura de un archivo 
        File f; //Convertir el archivo fisico en objeto
        FileReader fr; //Abrir una canaleta de comunicación(origen)
        BufferedReader br; //Leer

        String fila = ""; //aqui guardamos lo que el programa lee
        int[] n1 = new int[17];
        int[] n2 = new int[17];
        int[] n3 = new int[17];
        int[] n4 = new int[17];

        try {
            f = new File("data/notas.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            int i = 0;
            int row = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] p = fila.split(";");
                    n1[row] = Integer.parseInt(p[0]);
                    n2[row] = Integer.parseInt(p[1]);
                    n3[row] = Integer.parseInt(p[2]);
                    n4[row] = Integer.parseInt(p[3]);
                    row++;
                                                        /*String[] p = fila.split(";");           //Eliminamos ";" que separa los numeros y guardamos la variable en el vector "p"
                                                        for (int j = 0; j < p.length; j++) {    //Recoremos el "p" y imprimimos lo que contiene
                                                            System.out.print(p[j] + " ");       //la impresion sale en una fila con un espacio entre los numeros
                                                            if(j == 3){                         //Quieremos que los numeros salgan en grupos de 4 para cada alumno
                                                                System.out.println();           //Despues de un grupo de 4 numeros cambia de linea
                                                            }
                                                        }*/
                }
                i++;
            }
            //La impresion cambia de dirrecion: va por columna las notas del A1-A6 y los alumnos for filas
            System.out.printf("%7s %2s %2s %2s %2s %2s","A1","A2","A3","A4","A5","A6");
            System.out.println();
            System.out.println("N1: " + Arrays.toString(n1));
            System.out.println("N2: " + Arrays.toString(n2));
            System.out.println("N3: " + Arrays.toString(n3));
            System.out.println("N4: " + Arrays.toString(n4));
            
        } catch (IOException e) {
            //System.out.println("Eror:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "404", JOptionPane.ERROR_MESSAGE);
        }
    }

}
