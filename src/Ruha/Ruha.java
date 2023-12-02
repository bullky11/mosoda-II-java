/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruha;

public class Ruha {
    private String tulajdonos;
    private boolean tiszta;

    public Ruha(String tulajdonos) {
        this.tulajdonos = tulajdonos;
        this.tiszta = false; // alapból a ruhák koszosak
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }
}
