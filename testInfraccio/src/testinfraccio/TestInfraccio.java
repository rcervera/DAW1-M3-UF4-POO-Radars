/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testinfraccio;

/**
 *
 * @author jose
 */
public class TestInfraccio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Codi a implementar per l'alumne
    }

    private static void registrarTotesLesInfraccions(RegistreInfraccions registre) {
        // TODO code application logic here
        int [][] velMin = {{31,41,51,61,71,81,91,101,111,121},{51,61,71,91,101,111,121,131,141,151},{61,71,81,111,121,131,141,151,161,171},{71,81,91,121,131,141,151,161,171,181},{81,91,101,131,141,151,161,171,181,191}};
        int [][] velMax = {{50,60,70,90,100,110,120,130,140,150},{60,70,80,110,120,130,140,150,160,170},{70,80,90,120,130,140,150,160,170,180},{80,90,100,130,140,150,160,170,180,190}};
        int [] sancions = {100,300,400,500,600};
        int [] punts = {0,2,4,6,6};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                Infraccio infraccio = new Infraccio(10*j+30,velMin[i][j],velMax[i][j],sancions[i],punts[i]);
                registre.afegirInfraccio(infraccio);
            }
        }
        for (int j = 0; j < 10; j++) {
            Infraccio infraccio = new Infraccio(10*j+30,velMin[4][j],sancions[4],punts[4]);
            registre.afegirInfraccio(infraccio);
        }
    }
    
}
