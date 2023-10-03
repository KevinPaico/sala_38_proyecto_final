/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23;

import vacunar23.acceso_a_datos.CiudadanoData;
import vacunar23.entidades.Ciudadano;

/**
 *
 * @author Equipo
 */
public class VacunAR23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CiudadanoData cd = new CiudadanoData();
        Ciudadano k = new Ciudadano(45829173, "Kanye L", "kawiest@hotmail.com", "3581930582", null, "Singer", true);
        cd.modificarCiudadano(k);
    }
    
}
