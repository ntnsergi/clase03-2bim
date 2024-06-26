/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Usuario iTC
 */
public class EjecutaDos3 {
    public static void main(String[] args) {
        
        String nombre = "Sergi";
        String apellido = "Montaño";
        EstudianteDistancia e = new EstudianteDistancia(nombre,apellido,
                5,150);
        e.establecerIdentificacionEstudiante("51536131");
        e.establecerEdadEstudiante(19);
        e.calcularMatricula();
        
        System.out.printf("%s\n" , e);
    }
}
