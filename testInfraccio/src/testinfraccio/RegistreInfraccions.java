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
public class RegistreInfraccions {
    
    private static final int MAXIM_INFRACCIONS = 50;

    private int totalInfraccions;
    private final Infraccio [] infraccions;

    public RegistreInfraccions() {
        //Codi a implementar pels alumnes
    }
    
    public void afegirInfraccio(Infraccio infraccio) {
        //Codi a implementar pels alumnes
    }
    
    //Implementació dels mètodes importSancionarVehicle i puntsSancionarVehicle
    
    //Els mètodes getLimitVelocitat, getVelocitatMinima i getVelocitatMaxima de la classe Infracció són mètodes get d'alguns atributs de la classe Infracció
    private boolean infraccioRegistrada(Infraccio infraccio) {
        boolean esta = false;
        int i = 0;
        while (i < totalInfraccions && !esta) {
            if (infraccions[i].getLimitVelocitat() == infraccio.getLimitVelocitat()) {
                esta = true;
                if (infraccio.getVelocitatMinima() > infraccions[i].getVelocitatMaxima() || infraccio.getVelocitatMaxima() < infraccions[i].getVelocitatMinima())
                    esta = false;
            }
            i = i + 1;
        }
        //Alternativa al codi anterior amb el for enriquit
        /* for (Infraccio infraccio2:infraccions) {
            if (infraccio2.getLimitVelocitat() == infraccio.getLimitVelocitat()) {
                esta = true;
                if (infraccio.getVelocitatMinima() > infraccio2.getVelocitatMaxima() || infraccio.getVelocitatMaxima() < infraccio2.getVelocitatMinima()) {
                    esta = false;
                    break;
                }
            }
            i = i + 1;
        }*/
        return esta;
    }
}
