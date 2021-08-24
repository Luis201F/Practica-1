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
public class Calificaciones {
    //Declaramos un arreglo en el que ingresaremos las calificaciones
    double arregloCalif[]=new double[5];
    public void pedirCalificacion(){
         //Importamos la clase Scanner para poder capturar la opcion del usuario
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre=sc.nextLine();//Captura del nombre del usuario
        System.out.println("Ingrese las 5 calificaciones:");
        for(int i=0;i<arregloCalif.length;i++){
            arregloCalif[i]=sc.nextDouble();//Captura de las calificaciones
        }
        System.out.println(nombre);//Impresion del nombre
    }
    //Metodo de impresion de las calificaciones
    public void mostrarCalificacion(){
        int j=0;//Declaramos la variable para el ciclo
        System.out.println("Las calificaciones son :");
        while(j<5)//Ciclo para imprimir cada valor del arreglo
        {
            System.out.println(arregloCalif[j]);
            j++;
        }    
    }
    //Metodo promedio de las calificaciones
    public void promedioCalficaciones(){
        float suma=0;
        float promedio; //Declaramos las variables
        Scanner sc=new Scanner(System.in); //Importamos la clase Scanner para poder capturar la opcion del usuario
        System.out.println("Ingrese las 5 calificaciones:");
        for(int i=0;i<arregloCalif.length;i++){
        arregloCalif[i]=sc.nextDouble();
        suma+=arregloCalif[i];//Sumamos cada  calificacion que el usuario ingrese
        }
        promedio=(suma/arregloCalif.length);//sacamos el promedio con la suma y el tamaño del arreglo
        System.out.println("El promedio es:"+promedio);
    }
    //Metodo para encontrar el numero mayor
    public void numeroMayor(){
        Scanner sc=new Scanner(System.in); //Importamos la clase Scanner para poder capturar la opcion del usuario
        double mayor=0;//Declaramos la variable 
        System.out.println("Ingrese las 5 calificaciones:");
        for(int i=0;i<arregloCalif.length;i++){
            arregloCalif[i]=sc.nextDouble();
            if(arregloCalif[i]>mayor)
            {
                mayor=arregloCalif[i];//Comparacion de cada calificacion para encotrar la mayor
            }
        }
        System.out.println("La calificacion mayor es:"+mayor);//Imprimimos al numero menor
    }
    public void numeroMenor(){
        Scanner sc=new Scanner(System.in);
        double menor=100;
        System.out.println("Ingrese las 5 calificaciones:");
        for(int i=0;i<arregloCalif.length;i++){
            arregloCalif[i]=sc.nextDouble();
            if(arregloCalif[i]<menor)
            {
                menor=arregloCalif[i];//Comparacion de cada calificacion para encotrar la menor
            }
        }
        System.out.println("La calificacion menor es:"+menor);//Imprimimos el numero menor
    }
}
