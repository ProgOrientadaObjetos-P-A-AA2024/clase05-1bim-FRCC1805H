/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author LENOVO
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreestudiante = "Kristhyn Jimenez";

        LibretaCalificacion L2 = new LibretaCalificacion(nombreestudiante, notas);
        L2.establecerPromedio();
        L2.establecerPromedioCualitativo();
        System.out.printf(" %s\n ",L2);
    }
}
