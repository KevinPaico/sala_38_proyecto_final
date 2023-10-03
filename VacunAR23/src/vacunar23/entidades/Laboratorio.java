/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23.entidades;

/**
 *
 * @author User
 */
public class Laboratorio {
    private int idLaboratorio;
    private int cuit;
    private String nomLaboratorio;
    private String pais;
    private String dirFiscal;

    public Laboratorio(int idLaboratorio, int cuit, String nomLaboratorio, String pais, String dirFiscal) {
        this.idLaboratorio = idLaboratorio;
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.dirFiscal = dirFiscal;
    }

    public Laboratorio(int cuit, String nomLaboratorio, String pais, String dirFiscal) {
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.dirFiscal = dirFiscal;
    }

    public Laboratorio() {
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getNomLaboratorio() {
        return nomLaboratorio;
    }

    public void setNomLaboratorio(String nomLaboratorio) {
        this.nomLaboratorio = nomLaboratorio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDirFiscal() {
        return dirFiscal;
    }

    public void setDirFiscal(String dirFiscal) {
        this.dirFiscal = dirFiscal;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "idLaboratorio=" + idLaboratorio + ", cuit=" + cuit + ", nomLaboratorio=" + nomLaboratorio + ", pais=" + pais + ", dirFiscal=" + dirFiscal + '}';
    }
}
