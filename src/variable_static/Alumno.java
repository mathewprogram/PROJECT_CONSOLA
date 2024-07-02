package variable_static;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    //Variable static
    static int contador = 0;
    
    /*
    //Variables de instancia
    private String id;
    private String nombre;

    public Alumno() {
        this.id = generarClave(); //++contador;
        this.nombre = "";
    }

    public Alumno(String nombre) {
        this.id = generarClave(); //++contador;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String generarClave(){
        
        return "A" + ++contador;
    }*/
    
    //Variables de instancia
    private int id;
    private int numero;

    //Default constructor
    public Alumno() {
        this.id = generarNumero(); //generarClave(); //++contador;
        this.numero = 0;
    }

    public Alumno(int numero) {
        this.id = generarNumero(); //generarClave(); //++contador;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Static method to generate a unique number
    public static int generarNumero() {
        return contador++;
    }
    
    public static List<Integer> generarNumeros(int cantidad){
       List<Integer> numeros = new ArrayList<>();
       for (int i=0; i < cantidad; i++){
           numeros.add(generarNumero());
       }
       return numeros;
    }
} 
