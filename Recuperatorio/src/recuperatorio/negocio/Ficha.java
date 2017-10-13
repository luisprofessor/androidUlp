/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio.negocio;

import recuperatorio.entidades.Aula;
import recuperatorio.entidades.Hora;
import recuperatorio.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class Ficha {
    
    private Aula aula;
    private Materia materia;
    private Hora horaDesde;
    private Hora horaHasta;
    private String dia;

    public Ficha(Aula aula, Materia materia, Hora horaDesde, Hora horaHasta, String dia) {
        this.aula = aula;
        this.materia = materia;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.dia = dia;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Hora getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(Hora horaDesde) {
        this.horaDesde = horaDesde;
    }

    public Hora getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(Hora horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    
    
    
    
    
    
}
