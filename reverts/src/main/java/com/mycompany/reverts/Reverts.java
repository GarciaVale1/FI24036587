/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reverts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Vale García
 */
public class Reverts {

    private ArrayList<Character> stack = new ArrayList<>();
    private int CAPACITY = 11;

    public void push(char c) {
        if (stack.size() < CAPACITY) {
            stack.add(c);
        }
    }

    public char pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return '\0';
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        Reverts pila = new Reverts();

        File archivoEntrada = new File("entrada.txt");
        if (!archivoEntrada.exists()) {
            FileWriter creador = new FileWriter("entrada.txt");
            creador.write("zil ef eviv"); // mensaje invertido
            creador.close();
            System.out.println("Se creó 'entrada.txt' con el mensaje invertido.");
        }

        FileReader reader = new FileReader("entrada.txt");
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        pila.push((char) reader.read());
        reader.close();

        FileWriter writer = new FileWriter("salida.txt");
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.write(pila.pop());
        writer.close();

        System.out.println("vive feliz");

    }
}
