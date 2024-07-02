package crear_banco_datos;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //1. Crear dos archivos: masculino.txt && femenino.txt && personas.txt
        MetodoArchivo.crearArchivo("data/BancoDatos/masculino.txt");
        MetodoArchivo.crearArchivo("data/BancoDatos/femenino.txt");
        MetodoArchivo.crearArchivo("data/BancoDatos/apellido.txt");
        MetodoArchivo.crearArchivo("data/BancoDatos/personas.txt");
        //-----------------------------------------------------------------------------
        
        
        
        //2. Obtener datos para grabar en archivo
        //Masculinos
        String rna = "data/BancoDatos/nombre.txt"; 
        List<String> masculino_al = MetodoArchivo.obtenerListaNombresM(rna);
        MetodoArchivo.escribirArchivo("data/BancoDatos/masculino.txt", masculino_al);
        for(String nombrem: masculino_al){
            System.out.println(nombrem);
        }
        //Femeninos
        List<String> femenino_al = MetodoArchivo.obtenerListaNombresF(rna);
        MetodoArchivo.escribirArchivo("data/BancoDatos/femenino.txt", femenino_al);
        for(String nombref: femenino_al){
            System.out.println(nombref);
        }
        //Apellidos
        String apellidos = "data/BancoDatos/apellido.txt";
        List<String> apellido_al = MetodoArchivo.obtenerListaApellidos(apellidos);
        //-----------------------------------------------------------------------------
      

        
        //3. Crear 1000 personas unicas
        List<String> personas_al = MetodoArchivo.crearPersonasUnicas(masculino_al, femenino_al, apellido_al, 1000);
        MetodoArchivo.escribirArchivo("data/BancoDatos/personas.txt", personas_al);
        for(String apellido: personas_al){
            System.out.println(apellido);
        }
        //-----------------------------------------------------------------------------
        
    }
    
}
