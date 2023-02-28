/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamongo501;

/**
 *
 * @author DiegoJC
 */
public class JavaMongo501 {

    public static void main(String[] args) {
        Connection conexion = new Connection();
        
        conexion.Mostrar();
        //conexion.insertar("Nadar");
        System.out.println("Otro");
        //conexion.Mostrar();
        System.out.println("Otro Mas");
        //conexion.Actualizar("Nadar","Brincar");
        conexion.eliminar("Brincar");
        conexion.Mostrar();
        
        
    }
    
}
