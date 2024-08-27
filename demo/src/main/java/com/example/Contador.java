package com.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Um número: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite outro número");
        int parametroDois = scanner.nextInt();

        System.out.println(parametroUm + " " + parametroDois);

        try {
            // chamando metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // imprimindo a mensagem
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }

    
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // validar se paremetro um é maior que o dois
        if (parametroUm >= parametroDois) {
           throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

        }
        int quantidade = parametroDois - parametroUm;
        // for parar imprimir os números entre eles
        for(int i = 1; i <= quantidade; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
    
}