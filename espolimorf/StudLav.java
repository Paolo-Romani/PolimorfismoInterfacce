/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espolimorf;

/**
 *
 * @author romani.paolo
 */
public class StudLav extends Persona implements Studente, Lavoratore{
    private String scuola, lavoro;
    public StudLav(String nome, String scuola, String lavoro) {
        super(nome);
        this.scuola = scuola;
        this.lavoro = lavoro;
    }

    public static String getTipo() {
        return Lavoratore.tipo + " " + Studente.tipo;
    }

    @Override
    public String getScuola() {
        return scuola;
    }

    @Override
    public String getLavoro() {
        return lavoro;
    }
 
}
