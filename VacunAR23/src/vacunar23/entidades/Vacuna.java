/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23.entidades;

import java.util.Date;

/**
 *
 * @author User
 */
public class Vacuna {
    private int idVacuna;
    private int nroSerieDosis;
    private String marca;
    private double medida;
    private Date fechaCaduca;
    private boolean colocada;
    private Laboratorio procedencia;

    public Vacuna(int idVacuna, int nroSerieDosis, String marca, double medida, Date fechaCaduca, boolean colocada, Laboratorio procedencia) {
        this.idVacuna = idVacuna;
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.procedencia = procedencia;
    }

    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaCaduca, boolean colocada, Laboratorio procedencia) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.procedencia = procedencia;
    }

    public Vacuna() {
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public Date getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Date fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public Laboratorio getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Laboratorio procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "idVacuna=" + idVacuna + ", nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + ", procedencia=" + procedencia + '}';
    }
}
