package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite du skaičius");
        Scanner sc = new Scanner(System.in);
        float psk = sc.nextFloat();
        float ask = sc.nextFloat();


        System.out.println("Skirtumas :" + skirtumas(psk,ask));
        System.out.println("Suma : " + suma(psk,ask));
    }
    public static float suma(float psk,float ask){
        return psk+ask;

    }
    public static float skirtumas(float psk,float ask){
       return psk-ask;

    }
}