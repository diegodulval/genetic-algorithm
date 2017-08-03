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
public class Territorio {

    private static Long SEQUENCE = 0L;
    public static Long NUM_TERRITORIO_MAXIMO = 4L;

    private Long id;
    private Integer cor;
    private List<Territorio> adjacentes;

    public Territorio() {
        this.adjacentes = new ArrayList<>();
        this.id = ++SEQUENCE;
        this.cor = -1;
    }

    public List<Territorio> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(List<Territorio> adjacentes) {
        this.adjacentes = adjacentes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCor() {
        return cor;
    }

    public void setCor(Integer cor) {
        this.cor = cor;
    }

    public void addAdj(Territorio e) {
        this.adjacentes.add(e);
    }

    public List<Territorio> getAdj() {
        return this.adjacentes;
    }

}
