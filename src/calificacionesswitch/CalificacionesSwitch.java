/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesswitch;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CalificacionesSwitch {

    Scanner entrada = new Scanner(System.in);
    static int nota;

    public void Datos() {
        System.out.print("¿Cual ea la calificacion que obtuviste del 1 a 10?\t"); 
        nota= entrada.nextInt(); 
        
        switch (nota) {
            case 10:
                System.out.println("Eres un genio");
                break;
            case 9:
                System.out.println("Exelente");
                break;
            case 8:
                System.out.println("Regular");
                break;
            case 7:
                System.out.println("Hechale mas ganas");
                break;
            case 6:
                System.out.println("Aprobado");
                break;
            case 5:
                System.out.println("Reprobado");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Necesitas esforzarte demasiado");
            default:
                System.out.println("Esta nota no es posible");
        }
    }

    public static void main(String[] args) {
       CalificacionesSwitch mostrar= new CalificacionesSwitch();
       mostrar.Datos();
    }

}
