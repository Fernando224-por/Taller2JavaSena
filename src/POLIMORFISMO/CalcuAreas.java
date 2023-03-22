package POLIMORFISMO;

import java.util.Scanner;

public class CalcuAreas {
        public static void main(String[] args) throws Exception {
            Scanner dates= new Scanner(System.in);
            int opc;
            int antempWhile=6;
            float lado;
            float base;
            float altura;
            float radio;
            while (antempWhile==6) {
                System.out.println("hola, ¿que area quiere calcular?");
            System.out.println("1 para triangulo, 2 para rectangulo, 3 para circulo y 4 para cuadrado");
            opc=dates.nextInt();
            switch (opc) {
                case 1://caso area del TRIANGULO
                Triangulo data1=new Triangulo();
                System.out.println("digite la base y la altura del triangulo");
                base=dates.nextFloat();
                altura=dates.nextFloat();
                data1.setbase(base);
                data1.setaltura(altura);
                data1.calcularArea();
                System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                antempWhile=dates.nextInt();
                break;
                case 2://caso de area del RECTANGULO
                Rectangulo data2=new Rectangulo();
                System.out.println("digite la base y la altura del rectangulo");
                base=dates.nextFloat();
                altura=dates.nextFloat();
                data2.setbase(base);
                data2.setaltura(altura);
                data2.calcularArea();
                System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                antempWhile=dates.nextInt();
                break;
                case 3://caso area del CIRCULO
                Circulo data3=new Circulo();
                System.out.println("digite el radio del circulo");
                radio=dates.nextFloat();
                data3.setradio(radio);
                data3.calcularArea();
                System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                antempWhile=dates.nextInt();
                break;
                case 4://caso areal del CUADRADO
                Cuadrado data4=new Cuadrado();
                System.out.println("digite el lado del cuadrado");
                lado=dates.nextFloat();
                data4.setlado(lado);
                data4.calcularArea();
                System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                antempWhile=dates.nextInt();
                    break;
            
                default:
                System.out.println("su opcion no esta dentro de la lista intente de nuevo");
                System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                antempWhile=dates.nextInt();
                    break;
            }
            }
        dates.close();
        }
}
