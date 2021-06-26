/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import clasesHijas.Alumno;
import clasesHijas.Profesor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Date: 26/06/2021
 *
 */
public class MenuObjecty {

    public static void main(String[] args) throws ClassNotFoundException {
        String nombre, apellido;
        int op = 0;
        Date ahora = new Date();
        Alumno alum;
        Profesor prof;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU"
                        + "\n1.-Escrbir Datos"
                        + "\n2.-Leer Datos"
                        + "\n3.-Salir"
                        + "\n¿Que desea realizar?", "MENU", 3));
                switch (op) {
                    case 1: {
                        //Datos Alumno
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Alumno", "Introduciendo Nombre Alumno", 1);
                        apellido = JOptionPane.showInputDialog(null, "Introduce el apellido del Alumno", "Introduciendo Apellido Alumno", 1);
                        String nControl = JOptionPane.showInputDialog(null, "Introduce el numero de control del Alumno", "Introduciendo numero de control", 1);
                        alum = new Alumno(nControl, ahora, nombre, apellido);
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Profesor", "Introduciendo Nombre Profesor", 1);
                        apellido = JOptionPane.showInputDialog(null, "Introduce el apellido del Profesor", "Introduciendo Apellido Profesor", 1);
                        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del profesor", "Introduciendo edad del profesor", 1));
                        prof = new Profesor(edad, nombre, apellido);
                        try {
                            FileOutputStream fo = new FileOutputStream("pArchivos.dat");
                            ObjectOutputStream oo = new ObjectOutputStream(fo);
                            oo.writeObject(alum);
                            oo.writeObject(prof);
                            oo.close();
                            JOptionPane.showMessageDialog(null, "Los datos se gurdaron en el archivo", "Tarea Realizada con Exito", 1);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error en la escritura de datos " + e.getMessage(), "Error", 2);
                        }
                        break;
                    }
                    case 2: {
                        try {
                            FileInputStream fi = new FileInputStream("pArchivos.dat");
                            ObjectInputStream oi = new ObjectInputStream(fi);
                            alum = (Alumno) oi.readObject();
                            prof = (Profesor) oi.readObject();
                            alum.mostrarDatos();
                            prof.mostrarDatos();
                            System.out.println();
                            JOptionPane.showMessageDialog(null, "Datos mostrados en consola", "Mostrando en consola", 1);
                            oi.close();
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error en la lectura de Datos" + e.getMessage(), "Error", 2);
                        }
                        break;
                    }
                    case 3: {
                        JOptionPane.showMessageDialog(null, "Cerrando programa", "Saliendo", 1);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce una opcion correcta por favor", "Error de Opcion", 0);
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }
        } while (op != 3);

    }

}
