package examen1_dannacasco;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1_DannaCasco {

    public static void main(String[] args) {
        ArrayList<Object> lista =  new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--Menu--\n"
                    + "1-Probar el método Recursivo\n"
                    + "2-Agregar al arrayList un nuevo conjunto de complejos y n elementos a dicho conjunto\n"
                    + "3-Simplificar el racional de un imaginario de algún complejo de uno de los conjuntos \n"
                    + "4-Unir dos conjuntos del arraylist y guardar dicho conjunto en el mismo arrayList\n"
                    + "5-Sumar dos números complejos de cualquier conjunto del arraylist\n"
                    + "6-Imprimir todos los conjuntos del arrayList\n"
                    + "7-salir");
            System.out.println("");
                    System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            System.out.println("");
            

            switch (opcion) {
                case 1:
                    
                    int[][] matriz = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}};
                         
                    break;
                case 2:                   
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("");
                  System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
            
        } while (opcion != 7);

    }
    
    public Conjunto conjunto(){
       
    }
    
   

    static NumComplejo complejo(){
     
    }
    
    static NumImaginarios imaginario(){
        NumImaginarios i = new NumImaginarios();
        Object r = real()+i.getValorConstante();
        return (NumImaginarios) r;
    }
    
    static NumReal real(){
        double num1;
        double num2;
        Scanner entrada = new Scanner(System.in);
        NumRacional r = (NumRacional) new NumReal();
        NumExponencial e = (NumExponencial) new NumReal();

        System.out.println("Ingrese numero 1: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = entrada.nextInt();
        
        System.out.println("1.Racional");
        System.out.println("2.Exponencial");
        System.out.println("Que tipo de numero desea: ");
        int op = entrada.nextInt();
        
        if(op==1){
            e.expo(num1, num2);
            return e;
        }else if(op==2){
            r.racional(num1, num2);
            return r;
        }else{
            System.out.println("OPCION INVALIDA");
        }
        
        return 0;
    }

    public static int[] recursivo(int[][] matriz, int fila, int columna) {
        int[] min = new int[columna];
        for (int i = 0; i < columna; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        EncontraNum(matriz, fila, columna, 0, min);
        return min;
    }

    private static void EncontraNum(int[][] matriz, int fila, int columna, int Col, int[] min) {
        if (Col == Col) {
            return;
        }

        for (int i = 0; i < fila; i++) {
            min[Col] = Math.min(min[Col], matriz[i][Col]);
        }
        EncontraNum(matriz, fila, columna, Col + 1, min);
    }

    static NumExponencial division(NumExponencial expo1 , NumExponencial expo2){
        NumExponencial r = (NumExponencial) new NumReal();
       
        if(expo1.getNum1()==expo2.getNum1()){
           r.setNum1(expo1.getNum1()/expo2.getNum1());
           r.setNum2(expo1.getNum2());
        }
        if(expo1.getNum1()!=expo2.getNum1()){
            r.setNum1(expo1.getNum1());
            r.setNum2(expo1.getNum2()-expo1.getNum2());
        }
            return r;
        }
    
     static NumExponencial multiplicacion(NumExponencial expo1 , NumExponencial expo2){
        NumExponencial r = (NumExponencial) new NumReal();
       
        if(expo1.getNum1()==expo2.getNum1()){
           r.setNum1(expo1.getNum1()*expo2.getNum1());
           r.setNum2(expo1.getNum2());
        }
        if(expo1.getNum1()!=expo2.getNum1()){
            r.setNum1(expo1.getNum1());
            r.setNum2(expo1.getNum2()+expo1.getNum2());
        }
            return r;
        }
     
     
    
    
        
    }

    

