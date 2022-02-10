package coches;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Listado {
    List<RegCoches> lista = new ArrayList<RegCoches>();
    Scanner leer = new Scanner(System.in); //Creamos el objeto leer tipo Scanner
    
    //Constructor de la clase Listado
    public Listado() {
    }
    
    public void Agregar(Listado c) {
        
        
        String tipo, marca, resp;
        double km;
        do
        {
           System.out.print("Introduzca el tipo del vehiculo: ");
           tipo = leer.next(); 
           System.out.print("Introduzca marca del vehiculo: ");
           marca = leer.next(); 
           System.out.print("Introduzca el kilometraje del vehiculo: ");
           km = leer.nextDouble(); 
           RegCoches ch = new RegCoches(tipo, marca, km);
           c.lista.add(ch);
           System.out.print("Continuar Si o No: ");
           resp = leer.next();
        }        
        while(resp.equalsIgnoreCase("si"));        
    }
    
    public void Imprimir(){
        System.out.print("Tipo\t\t Marca\t\t Km\n");
        for(RegCoches co: lista){
            System.out.print(co.getTipo() + "\t\t" + co.getMarca() + "\t\t" + co.getKm() + "\n");
        }
    }
    public void ImprimirMarca(){
        String marc;
        System.out.print("Introduzca la marca del vehiculo a buscar: ");
        marc = leer.nextLine(); 
        System.out.println("Coches de la marca" + marc);
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Tipo\t\t Marca\t\t Km\n");
        for(RegCoches co: lista){
            if(co.getMarca().equalsIgnoreCase(marc))
                System.out.print(co.getTipo() + "\t\t" + co.getMarca() + "\t\t" + co.getKm() + "\n");
        }
    }
    public void ImprimirMenorKm(){
        Double kb;
        System.out.print("Introduzca el kilometraje a buscar: ");
        kb = leer.nextDouble(); 
        System.out.println("Coches con menos de un numero determinado de kilometros");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Tipo\t\t Marca\t\t Km\n");
        for(RegCoches co: lista){
            if(co.getKm()< kb)
                System.out.print(co.getTipo() + "\t\t" + co.getMarca() + "\t\t" + co.getKm() + "\n");
        }
    }
    public void ImprimirMaxKm(){
        Double max = 0.0;
        String sal = "";
        System.out.println("Coches con el mayor de un numero de kilometros");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Tipo\t\t Marca\t\t Km\n");
        for(RegCoches co: lista){
            if(co.getKm()> max)
            {
                max = co.getKm();
                sal = co.getTipo() + "\t" + co.getMarca() + "\t" + co.getKm() + "\n";
            } 
        }
        System.out.print(sal);
    }
    public void ImprimirOrdenados(){
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < (lista.size()- 1); j++) {
                if(lista.get(j).getKm() > lista.get(j+1).getKm()) {
                    RegCoches aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
        System.out.println("Coches ordenados por número de kilómetros de menor a mayor");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Tipo\t\t Marca\t\t Km\n");
        for(RegCoches co: lista){
            System.out.print(co.getTipo() + "\t\t" + co.getMarca() + "\t\t" + co.getKm() + "\n");
        }
    }
}
