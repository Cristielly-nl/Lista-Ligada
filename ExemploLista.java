package src;

import java.util.LinkedList;

public class ExemploLista {
    public static void main(String[] args) {
        // Cria um LinkedList de Inteiros
        LinkedList<Integer> numeros = new LinkedList<>();

        // Adiciona elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(30);
        numeros.add(40);

        // Imprime a lista
        System.out.println(numeros); // Saída: [10, 20, 30]

        // Acessa o primeiro elemento
        System.out.println(numeros.getFirst()); // Saída: 10

        // Remove o último elemento
        numeros.removeLast();

        // Imprime a lista novamente
        System.out.println(numeros); // Saída: [10, 20]
    }
}