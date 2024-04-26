/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,gancomp,ganusu,empate,veces;
        double compu;
        gancomp=0;
        ganusu=0;
        empate=0;
        
        Scanner captu=new Scanner(System.in);
        System.out.println("Cuantas veses quires jugar");
        veces=captu.nextInt();
                
        for (int i = 0; i < veces; i++) {
        compu=Math.random();
        System.out.println("piedra=1,papel=2,tijera=3,termier juego=4");
        
        numero=captu.nextInt();
        if(numero==4)
            break;
        else if(compu<=.33){
                System.out.println("piedra");}
            else if(compu>=.34&&compu<=.66){
                System.out.println("papel");}
            else if(compu>=.67&&compu<=.99){
                System.out.println("tijeras");}
               
            if(compu<=.33&&numero==1){
                System.out.println("empate");
                empate++;
            }
            else if((compu>=.34&&compu<=.66)&&numero==2){ 
                empate++;
                System.out.println("empate");}
                else if((compu>=.67&&compu<=.99&&numero==3)){
                System.out.println("empate");
            empate++;}
            
            if(compu<=.33&&numero==2)
                System.out.println("gansate");
            if(compu<=.33&&numero==3)
                System.out.println("perdiste");
            else if((compu>=.34&&compu<=.66)&&numero==1)
                System.out.println("perdiste");
            else if((compu>=.34&&compu<=.66)&&numero==3)
                System.out.println("ganste");
            else if((compu>=.67&&compu<=.99)&&numero==1)
                System.out.println("ganste");
            else if((compu>=.67&&compu<=.99)&&numero==2)
                System.out.println("perdiste");
            
            if(compu<=.33&&numero==2){
                  ganusu++;}
            if(compu<=.33&&numero==3){
                
            gancomp++;}
            if((compu>=.34&&compu<=.66)&&numero==1){
                    gancomp++;}
            if((compu>=.34&&compu<=.66)&&numero==3){
            ganusu++;}
            if((compu>=.67&&compu<=.99)&&numero==1){
            ganusu++;}
            if((compu>=.67&&compu<=.99)&&numero==2){
            gancomp++;}
            System.out.println("Ganados por la computadora:"+gancomp);
            System.out.println("Ganados por el usuario:"+ganusu);
            System.out.println("Empates:"+empate);
            
        }
        
        
        
        
    }
    
}
