/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePadre;

import java.io.Serializable;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Date: 26/06/2021
 *
 */
public abstract class Persona implements Serializable {
    /*Implementamos la Interfaz -Serializable para que java pueda convertir un objeto
     en un montón de bytes y pueda luego recuperarlo, el objeto necesita ser Serializable
     Creamos nuestra clase, en este caso sera abstracta para evitar crear instancias de la clase padre
     */

    //Creamos los atributos de nuestra clase padre
    protected String nombre;
    protected String apellidos;

    //Creamos nuestro constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //Creamos nuestro metodo abstracto, el cual se comportara de diferentes manera en cada clase, a  esto le llamamos "Polimorfismo"
    public abstract void mostrarDatos();

}
