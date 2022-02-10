/**  Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche. El programa  pide por teclado los datos de los coches y los guarda en el array. A continuación, utilizará el ArrayList para mostrar por pantalla lo siguiente:
a. Todos los coches introducidos.
b. Todos los coches de una marca determinada.
c. Todos los coches con menos de un número determinado de Kilómetros.
d. El coche con mayor número de Kilómetros.
e. Todos los coches ordenados por número de kilómetros de menor a mayor
 */

package coches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        
        Scanner leer = new Scanner(System.in);
        Listado c = new Listado();
        c.Agregar(c);
        do{
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1. Imprimir");
            System.out.println("2. Imprimir Coches de una marca determinada");
            System.out.println("3. Imprimir coches con menos de un numero determinado de kilometros");
            System.out.println("4. Imprimir coche con mayor numero de kilometro");
            System.out.println("5. Imprimir todos los coches ordenados por número de kilómetros de menor a mayor");
            System.out.println("6. Salir");
            System.out.println("Elija una opcion");
            opc = leer.nextInt();
            switch(opc)
            {
                case 1: c.Imprimir();
                        break;
                case 2: c.ImprimirMarca();
                        break;
                case 3: c.ImprimirMenorKm();
                        break;
                case 4: c.ImprimirMaxKm();
                        break;
                case 5: c.ImprimirOrdenados();
                        break;
                case 6: break;
                default: System.out.println("Opcion erronea - Intente de nuevo");
            }            


        }while(opc !=6);
    }
    
}
