import java.util.Stack;

/**
 * Created by Leslie on 26/02/14.
 */
import java.util.Random;
import java.util.Scanner;
import sun.tools.jar.resources.jar;
public class Parejas_201314808 {

    String volteada[][]=new String[4][5];
    int mostrada[][]=new int[4][5];
    Scanner sc = new Scanner(System.in);
    Random num = new Random();
    int contd = 3;
    int conti = 0;
    int continte = 0;

     void Comenzar(){

         int Op = num.nextInt(4);

         if(Op == 0){
             mostrada[0][0] = 1;
             mostrada[0][1] = 10;
             mostrada[0][2] = 8;
             mostrada[0][3] = 5;
             mostrada[0][4] = 2;
             mostrada[1][0] = 9;
             mostrada[1][1] = 6;
             mostrada[1][2] = 3;
             mostrada[1][3] = 7;
             mostrada[1][4] = 4;
             mostrada[2][0] = 1;
             mostrada[2][1] = 10;
             mostrada[2][2] = 4;
             mostrada[2][3] = 7;
             mostrada[2][4] = 2;
             mostrada[3][0] = 5;
             mostrada[3][1] = 8;
             mostrada[3][2] = 3;
             mostrada[3][3] = 6;
             mostrada[3][4] = 9;
         }

         if(Op == 1){
             mostrada[0][0] = 1;
             mostrada[0][1] = 9;
             mostrada[0][2] = 8;
             mostrada[0][3] = 3;
             mostrada[0][4] = 2;
             mostrada[1][0] = 9;
             mostrada[1][1] = 6;
             mostrada[1][2] = 6;
             mostrada[1][3] = 7;
             mostrada[1][4] = 4;
             mostrada[2][0] = 10;
             mostrada[2][1] = 10;
             mostrada[2][2] = 4;
             mostrada[2][3] = 7;
             mostrada[2][4] = 2;
             mostrada[3][0] = 5;
             mostrada[3][1] = 8;
             mostrada[3][2] = 3;
             mostrada[3][3] = 5;
             mostrada[3][4] = 1;
         }

         if(Op == 2){
             mostrada[0][0] = 6;
             mostrada[0][1] = 2;
             mostrada[0][2] = 8;
             mostrada[0][3] = 5;
             mostrada[0][4] = 10;
             mostrada[1][0] = 10;
             mostrada[1][1] = 7;
             mostrada[1][2] = 3;
             mostrada[1][3] = 5;
             mostrada[1][4] = 1;
             mostrada[2][0] = 1;
             mostrada[2][1] = 9;
             mostrada[2][2] = 4;
             mostrada[2][3] = 7;
             mostrada[2][4] = 2;
             mostrada[3][0] = 4;
             mostrada[3][1] = 8;
             mostrada[3][2] = 3;
             mostrada[3][3] = 6;
             mostrada[3][4] = 9;
         }

         if(Op == 3){
             mostrada[0][0] = 2;
             mostrada[0][1] = 1;
             mostrada[0][2] = 2;
             mostrada[0][3] = 7;
             mostrada[0][4] = 3;
             mostrada[1][0] = 9;
             mostrada[1][1] = 6;
             mostrada[1][2] = 8;
             mostrada[1][3] = 7;
             mostrada[1][4] = 4;
             mostrada[2][0] = 1;
             mostrada[2][1] = 10;
             mostrada[2][2] = 5;
             mostrada[2][3] = 4;
             mostrada[2][4] = 9;
             mostrada[3][0] = 5;
             mostrada[3][1] = 8;
             mostrada[3][2] = 3;
             mostrada[3][3] = 6;
             mostrada[3][4] = 10;
         }

         if(Op == 4){
             mostrada[0][0] = 5;
             mostrada[0][1] = 9;
             mostrada[0][2] = 8;
             mostrada[0][3] = 1;
             mostrada[0][4] = 2;
             mostrada[1][0] = 9;
             mostrada[1][1] = 3;
             mostrada[1][2] = 6;
             mostrada[1][3] = 7;
             mostrada[1][4] = 4;
             mostrada[2][0] = 1;
             mostrada[2][1] = 10;
             mostrada[2][2] = 4;
             mostrada[2][3] = 7;
             mostrada[2][4] = 2;
             mostrada[3][0] = 5;
             mostrada[3][1] = 8;
             mostrada[3][2] = 3;
             mostrada[3][3] = 6;
             mostrada[3][4] = 10;
         }
         for(int x=0; x<4; x++){
             for(int y=0; y<5; y++){
                 Op = mostrada[x][y];
                 System.out.print("\t"+ mostrada[x][y]);
             }
             System.out.println();
         }



         System.out.println("*********************************************** ");

         for(int x=0; x<4; x++){
             for(int y=0; y<5; y++){
                 volteada[x][y]="$";
                 System.out.print("\t"+ volteada[x][y]);
             }
             System.out.println();
         }

         System.out.println("Para Voltear \"v\"\nPara Reiniciar \"r\" ");
         char empezar=sc.next().charAt(0);

         while(empezar!='v'&&empezar!='r'){
             System.out.println("Debes itroducir v o r");
             empezar=sc.next().charAt(0);
         }
         // si desea salir manda a llamar al metodo voltear

         if(empezar=='v'){
             Comparar();
         }
         else{
             Comenzar();
         }




    }


    public void Comparar(){
        int a,s,d,f;
        int aa,ss,dd,ff;

        System.out.println("Carta no.1 Fila:");
        a=sc.nextInt();
        System.out.println("Carta no.1 Columna:");
        s=sc.nextInt();
        if(a>4||a<1||s>5||s<1){
            System.out.println("Coordenada inválida, Ingrese de nuevo\nCarta no.1 Fila:");
            a=sc.nextInt();
            System.out.println("Coordenada inválida, Ingrese de nuevo\nCarta no.1 Columna:");
            s=sc.nextInt();
        }
        aa=a-1;
        ss=s-1;
        //matriz logica  a la matriz de pantalla

        volteada[aa][ss]=Integer.toString(mostrada[aa][ss]);
        // imprime
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("\t"+volteada[i][j]);
            }
            System.out.println(" ");
        }

        // pide ingreso de coordenadas de la segunda carta
        System.out.println("Carta no.2 Fila:");
        d=sc.nextInt();
        System.out.println("Carta no.2 Columna:");
        f=sc.nextInt();
        if(d>4||d<1||f>5||f<1){
            System.out.println("Coordenada inválida, Ingrese de nuevo\nCarta no.2 Fila:");
            d=sc.nextInt();
            System.out.println("Coordenada inválida, Ingrese de nuevo\nCarta no.2 Columna:");
            f=sc.nextInt();
        }

        dd=d-1;
        ff=f-1;

        // pasa el dato de la matriz logica a la matriz en pantalla
        volteada[dd][ff]=Integer.toString(mostrada[dd][ff]);

        //despliega la matriz en pantalla con ambas cartas abiertas
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("\t"+volteada[i][j]);
            }
            System.out.println();
        }
        System.out.println("*********************************************** ");

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
    if(mostrada[dd][ff]==mostrada[aa][ss]){
        volteada[dd][ff]= " ";
        volteada[aa][ss]= " "; }
    else{
        volteada[dd][ff]= "$";
        volteada[aa][ss]= "$";

    }
                System.out.print("\t" + volteada[i][j]);
   } 
            System.out.println();
    }


        if(mostrada[dd][ff]==mostrada[aa][ss]) {
            conti= conti+1;}else{contd= contd-1;}
      continte= contd + conti;

        if (contd<=0){
            System.out.println("Lo sentimos,Perdiste!!\nGracias por Jugar vuelvue cuando quieras");
            System.exit(0);
        }
        if(conti>=10){
            System.out.println("Felicidades Ganaste!!! vuelve cuando quieras");
            System.exit(0);
        }
        continuar();
    }


    void continuar(){
        System.out.println("Parejas:"+ conti);
        System.out.println("Vidas:"+contd);
        System.out.println("¿Deseas continuar?");
        System.out.println("Para voltear presiona \"v\"\nPara reiniciar presiona \"r\" ");
        char empezar=sc.next().charAt(0);
        while(empezar!='v'&&empezar!='r'){
            System.out.println("Debes introducir v o r");
            empezar=sc.next().charAt(0);
        }
        // si desea salir manda a llamar al metodo voltear

        if(empezar=='v'){
            Comparar();
        }
        else{
            Comenzar();
        }
        System.out.println("*********************************************");
    }


    }







