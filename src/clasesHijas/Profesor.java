/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Persona;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Date: 26/06/2021
 *
 */
public class Profesor extends Persona { //Heredamos de la clase Persona
    //Atributos propios

    private int edad;

    public Profesor(int edad, String nombre, String apellidos) {
        super(nombre, apellidos); //Llamamos al contructor de la clase padre
        this.edad = edad;
    }
    
    
    //La notacion @Override nos indica que estamos sobreescribiendo un metodo
    @Override
    public void mostrarDatos() {//Polimorfismo 
        System.out.println(this.nombre + " : " + this.apellidos + " : " + this.edad);
    }

}
