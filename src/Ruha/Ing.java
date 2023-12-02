/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruha;

public class Ing extends Ruha {
    private int szinIntenzitas;

    public Ing(String tulajdonos, int szinIntenzitas) {
        super(tulajdonos);
        this.szinIntenzitas = szinIntenzitas;
    }

    public int getSzinIntenzitas() {
        return szinIntenzitas;
    }

    public void mosas() {
        szinIntenzitas -= (szinIntenzitas * 0.03); //csökkenti a szinintenzitást 3%al
    }

    @Override
    public String toString() {
        return "Ing tulajdonosa: " + getTulajdonos() + ", Színintenzitás: " + szinIntenzitas + "%";
    }
}
