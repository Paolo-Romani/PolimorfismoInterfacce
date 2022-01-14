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
public class EsPolimorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudLav sl = new StudLav("PAOLO","SALESIANI","PROFESSORE");
        System.out.println("sl  "+sl.getTipo());
        Studente s = new StudLav("MARCO","PARCO NORD","MECCANICO");
        System.out.println("s - Scuola "+s.getScuola());
        Lavoratore l = new StudLav("GIGI","LEONARDO","INGEGNERE");
        System.out.println("l - Lavoro "+l.getLavoro());
        Studente s2 = (Studente) sl;
        System.out.println("s2 - Scuola "+s2.getScuola());
        Lavoratore l2 = (Lavoratore)sl;
        System.out.println("l2 - LARORO "+l2.getLavoro());
        
    }
    
}
