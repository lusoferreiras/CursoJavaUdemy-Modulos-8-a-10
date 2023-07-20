package com.udemy.excecao.personalizadaA;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println(7 / entrada.nextInt());

            entrada.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally...");
        }
        System.out.println("Fim!");
    }
}
