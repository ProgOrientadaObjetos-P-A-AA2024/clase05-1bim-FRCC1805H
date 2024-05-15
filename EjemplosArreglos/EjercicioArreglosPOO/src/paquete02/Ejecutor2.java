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
        // No se presenta la calificacion y sale oooo pero si sepresenta las notas
        // y el codigo es como si nunca lo llama al metodo del problema.
        L2.establecerPromedioCualitativo();
        // saldria nul por que en ningun momento esta llamando al metodo de 
        // promedio cualitativo saldria nuul 
        System.out.printf(" %s\n ",L2);
    }
}
