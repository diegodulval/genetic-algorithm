/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetic.teritory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Diego Dulval
 */
public class Main {

    private final static Long POPULATION_SIZE = 4L;
    private final static Double MORTALITY_RATE = 0.6;
    private final static int MAX_GENERATIONS = 100;
    private final static int MUTATION_CHANCE = 20;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main obj = new Main();
        obj.execute();
    }

    private void execute() {
        Mapa map = iniciaDados();
        //TODO LOGIC FOR ALTER COLOR
        saida(map);
    }

    public void saida(Mapa map) {
        System.out.println("Mapa: " + map.getId());
        map.getTerritorios()
                .stream()
                .forEach((item) -> {
                    System.out.println("Teritorio: " + item.getId());
                    System.out.println("Cor: " + item.getCor());
                });
    }

    private Mapa iniciaDados() {
        Territorio srs = new Territorio();
        Territorio pa = new Territorio();
        Territorio cm = new Territorio();
        Territorio itj = new Territorio();

        srs.addAdj(cm);
        srs.addAdj(itj);
        srs.addAdj(pa);

        pa.addAdj(cm);
        pa.addAdj(srs);

        itj.addAdj(srs);

        Mapa map = new Mapa();
        map.addTerritorio(cm);
        map.addTerritorio(pa);
        map.addTerritorio(srs);
        map.addTerritorio(itj);
        return map;
    }

}
