package variable_static;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        /*Alumno mihai = new Alumno("Mihai");
        Alumno matei = new Alumno("Matei");
        Alumno lavinia = new Alumno("Lavinia");
        
        System.out.printf("%-10s %s\n", "Nombre", "Id");
        System.out.printf("%-10s %s\n", "------", "--");
        System.out.printf("%-10s %s\n", "      ", "  ");
        System.out.printf("%-10s %s\n", mihai.getNombre(), mihai.getId());
        System.out.printf("%-10s %s\n", matei.getNombre(), matei.getId());
        System.out.printf("%-10s %s\n", lavinia.getNombre(), lavinia.getId());
        System.out.printf("%-10s %s\n", matei.getNombre(), matei.getId());*/
        
        List<Integer> uniqueNumbers = Alumno.generarNumeros(1000);
        
        System.out.println(uniqueNumbers);
        
        Alumno numerox = new Alumno();
               
        
    }
    
}

//hacer un contador de numeros utilizando static