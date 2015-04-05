/**
 * Created by Leslie on 25/02/14.
 */
import sun.tools.jar.resources.jar;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class JuegoDeMem_201314808{

    Scanner sc= new Scanner(System.in);
    String Nombre = sc.next();


    public static void main(String[] args) {


        System.out.println("Juego de Memoria");
        System.out.println("Bienvenido jugador, ingresa tu nombre");
        Scanner sc= new Scanner(System.in);
        String Nombre = sc.next();
        System.out.println("*********************************************");

        System.out.println("---------------------------------");
        System.out.println("Jugador: "+ Nombre);
        System.out.println("---------------------------------");

             Parejas_201314808 ca;
        ca= new Parejas_201314808();
        ca.Comenzar();

        System.out.println("*********************************************");

        }
    }

