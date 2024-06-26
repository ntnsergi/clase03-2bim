
package paquete06;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        System.out.print("Ingrese la cantidad de estudiantes a ingresar: ");
        int numestudiantes = entrada.nextInt();
        System.out.print("\nIngrese la cantidad de Estudiantes Presenciales "
                + "a ingresar: ");
        int numestudianteP = entrada.nextInt();
        System.out.print("\nIngrese la cantidad de Estudiantes Distancia a "
                + "ingresar: ");
        int numestudianteD = entrada.nextInt();
        entrada.nextLine();
        
        if (numestudianteP > 0) {
            for (int i = 0; i < numestudianteP; i++) {
                System.out.print("Ingrese los nombres del estudiante: ");
                nombresEst = entrada.nextLine();
                System.out.print("Ingrese los apellidos del estudiante: ");
                apellidosEst = entrada.nextLine();
                System.out.print("Ingrese la identificación del estudiante: ");
                identificacionEst = entrada.nextLine();
                System.out.print("Ingrese la edad del estudiante: ");
                edadEst = entrada.nextInt();
                System.out.print("Ingrese el número de créditos: ");
                numeroCreds = entrada.nextInt();
                System.out.print("Ingrese el costo de cada crédito: ");
                costoCred = entrada.nextDouble();
                entrada.nextLine(); // Limpiar el buffer
                EstudiantePresencial estudianteP = new EstudiantePresencial(
                        numeroCreds, costoCred,
                        nombresEst, apellidosEst,
                        identificacionEst, edadEst);
                estudiantes.add(estudianteP); 
            }
        }
        
        if (numestudianteD > 0) {
            for (int i = 0; i < numestudianteD; i++) {
                System.out.print("Ingrese los nombres del estudiante: ");
                nombresEst = entrada.nextLine();
                System.out.print("Ingrese los apellidos del estudiante: ");
                apellidosEst = entrada.nextLine();
                System.out.print("Ingrese la identificación del estudiante: ");
                identificacionEst = entrada.nextLine();
                System.out.print("Ingrese la edad del estudiante: ");
                edadEst = entrada.nextInt();
                System.out.print("Ingrese el número de asignaturas: ");
                numeroAsigs = entrada.nextInt();
                System.out.print("Ingrese el costo de cada asignatura: ");
                costoAsig = entrada.nextDouble();
                entrada.nextLine(); // Limpiar el buffer
                
                EstudianteDistancia estudianteD = new EstudianteDistancia(
                        numeroAsigs, costoAsig,
                        nombresEst, apellidosEst,
                        identificacionEst, edadEst);
                estudiantes.add(estudianteD); 
            }
        }
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}