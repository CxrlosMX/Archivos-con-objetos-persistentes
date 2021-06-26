/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Persona;
import com.sun.scenario.effect.impl.state.PerspectiveTransformState;
import java.util.Date;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Date: 26/06/2021
 *
 */
public class Alumno extends Persona { //Heredamos de la clase padre "Persona"
    //Atributos propios de la clase

    private String numControl;
    private Date fIngreso; //Creamos una variable de tipo Date esta sirve para almacenar una fecha

    //Creamos nuestro constructor
    public Alumno(String numControl, Date fIngreso, String nombre, String apellidos) {
        super(nombre, apellidos); //La instruccion super sirve para llamar al constructor de la clase padre
        this.numControl = numControl;
        this.fIngreso = fIngreso;
    }

    //La notacion @Override nos indica que estamos sobreescribiendo un metodo
    @Override
    public void mostrarDatos() { //Polimorfismo
        System.out.println(this.numControl + ":" + this.nombre + " : " + this.apellidos + " : " + this.fIngreso);
    }

}
