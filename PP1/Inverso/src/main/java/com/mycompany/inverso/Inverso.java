/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverso;
import javax.swing.JOptionPane;
/**
 *
 * @author Vale García
 */
public class Inverso {

    static int numeroInverso (int n, int resultado) {
        if (n == 0) {
            return resultado;
        } else {
            return numeroInverso(n / 10, resultado * 10 + n % 10);
        }
    }

    public static void main(String[] args) {
        String numero =JOptionPane.showInputDialog("digite un numero:");
        int n = Integer.parseInt(numero);
        int resultado = numeroInverso(n, 0);
        JOptionPane.showMessageDialog(null,n + " = " + resultado);
    }
}


