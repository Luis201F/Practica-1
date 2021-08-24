/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Menu {
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calificaciones c=new Calificaciones();
        int opcion=0;
        do{
            try{
                System.out.println("-------Menu de opciones-------\n"+
                    "1. Captura de nombre y calificaciones.\n" +
                    "2. Imprimir calificaciones y promedio de calificaciones.\n" +
                    "3. Imprimir calificaciones y calificación más baja.\n" +
                    "4. Imprimir calificaciones y calificación más alta.\n" +
                    "5. Salir.\n");
                System.out.println("ingrese una opcion:");
                opcion= scanner.nextInt();
                switch(opcion){
                    case 1:

                        c.pedirCalificacion();

                        c.mostrarCalificacion();
                        break;
                    case 2:
                        c.promedioCalficaciones();
                        c.mostrarCalificacion();
                        break;
                    case 3:
                        c.numeroMenor();
                        c.mostrarCalificacion();
                        break;
                    case 4:
                        c.numeroMayor();
                        c.mostrarCalificacion();
                        break;

                   case 5:
                       System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Ingreso una opcion invalida.");
                
                }
            }catch(Exception e){
                System.out.println("Error!");
            }
        }while(opcion>=1 && opcion<=4);
    }
    
}

