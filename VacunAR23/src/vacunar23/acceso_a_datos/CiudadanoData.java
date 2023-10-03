/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23.acceso_a_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import vacunar23.entidades.Ciudadano;

/**
 *
 * @author User
 */
public class CiudadanoData {

    private Connection con = null;
    
    public CiudadanoData() {
        con = Conexion.getConection();
    }
    
    public void guardarCiudadano(Ciudadano c){
        String sql = "insert into ciudadano (dni, nombreCompleto, email, celular, patologia, ambitoTrabajo, activo) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombreCompleto());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getCelular());
            ps.setString(5, c.getPatologia());
            ps.setString(6, c.getAmbitoTrabajo());
            ps.setBoolean(7, c.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                c.setIdCiudadano(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudadano Registrado");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadanoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarCiudadano(Ciudadano c){
        String sql = "update ciudadano set nombreCompleto=?, email=?, celular=?, patologia=?, ambitoTrabajo=? where dni=? AND activo=true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombreCompleto());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getCelular());
            ps.setString(4, c.getPatologia());
            ps.setString(5, c.getAmbitoTrabajo());
            ps.setInt(6, c.getDni());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ciudadano Modificado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CiudadanoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void borrarCiudadano(int dni){
        String sql = "Update ciudadano set activo = false where dni=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ciudadano Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadanoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
