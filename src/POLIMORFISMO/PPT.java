package POLIMORFISMO;

import java.util.Scanner;

public class PPT implements Juego {
    Scanner dates =new Scanner (System.in);
    private int opc;
    private int dataCaptured;
    private String name;
    private int antempWhile=6;
    private int valueRandom = (int)Math.floor(Math.random()*3+1);
    private int i;
    public void setopc(int opc){
        this.opc=opc;
    }
    @Override
    public void iniciar() {
        System.out.println("ingrese su nombre");
        name=dates.nextLine();      
    }

    @Override
    public void juagr() {
        switch (this.opc) {
            case 1:
            while(antempWhile==6){
                System.out.println("Bienvenido al simulador de Piedra, Papel o Tijera");
                System.out.println("para jugar debe escojer:");
                System.out.println("1-para jugar con piedra,2-para papel y 3-para jugar con las tijeras");
                dataCaptured=dates.nextInt();
                if (dataCaptured==2 && valueRandom==1) {// casos en donde gana el usuario
                    System.out.println("El papel envuelve a la piedra, el usuario gano");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                else if(dataCaptured==1 && valueRandom==3){
                    System.out.println("La piedra rompe a las tijeras, el usuario gano");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }  
                else if(dataCaptured==3 && valueRandom==2){
                    System.out.println("Las tijeras rompen el papel, el usuario gano");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }//fin de casos usuario
        
                else if(dataCaptured==1 && valueRandom==2){// casos en donde gana la maquina
                    System.out.println("El papel envuelve a la piedra, el usuario perdio");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                else if(dataCaptured==3 && valueRandom==1){
                    System.out.println("La piedra rompe a las tijeras, el usuario perdio");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                else if(dataCaptured==2 && valueRandom==3){
                    System.out.println("Las tijeras rompen el papel, el usuario perdio");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }//fin de casos maquina
        
                else if(dataCaptured==1 && valueRandom==1){//empate
                    System.out.println("ambos han seleccionado piedra, Empate");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                else if(dataCaptured==2 && valueRandom==2){
                    System.out.println("ambos han seleccionado papel, Empate");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }   
                else if(dataCaptured==3 && valueRandom==3){
                    System.out.println("ambos han seleccionado tijeras, Empate");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }//fin casos empate 
        
                else{
                    System.out.println("a ocurrido un error, intente de nuevo");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
            }
                break;
                case 2:
                System.out.println("Bienvenido al simulador carisello");
                System.out.println("Escoga 1 si cree que la moneda caera cara, escoja 2 si cree que la moneda caera sello");
                dataCaptured=dates.nextInt();
                valueRandom = (int)Math.floor(Math.random()*2+1);
                if (dataCaptured==valueRandom){
                    System.out.println("usted gano");
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                else{
                    System.out.println("usted perdio");    
                    System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
                    antempWhile=dates.nextInt();
                    i++;
                }
                break;
        
            default:
            System.out.println("su opcion no esta dentro de la lista intente de nuevo");
            System.out.println("digite 6 para continuar, digite 7 para detener la ejecucion");
            antempWhile=dates.nextInt();
                break;
        }
    }

    @Override
    public void finalizar() {
        System.out.println("usted se llama "+name+" y se jugo "+i+" veces");
    }

    
}
