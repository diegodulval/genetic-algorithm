/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetic.teritory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Mapa {

    private static Long SEQUENCE = 0L;

    private Long id;
    private List<Territorio> territorios;

    public Mapa() {
        this.id = ++SEQUENCE;
        this.territorios = new ArrayList<>();
    }

    public List<Territorio> getTerritorios() {
        return territorios;
    }

    public void setTerritorios(List<Territorio> territorios) {
        this.territorios = territorios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addTerritorio(Territorio e) {
        this.territorios.add(e);
    }
}
