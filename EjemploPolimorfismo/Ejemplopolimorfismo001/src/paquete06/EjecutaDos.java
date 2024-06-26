/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Usuario iTC
 */
public class EjecutaDos {
    public static void main(String[] args) {
        
        String nombre = "Sergi";
        String apellido = "Montaño";
        EstudianteDistancia e = new EstudianteDistancia(nombre,apellido);
        e.establecerIdentificacionEstudiante("51536131");
        e.establecerEdadEstudiante(19);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        
        System.out.printf("%s\n" , e);
    }
}
