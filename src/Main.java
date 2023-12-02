/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Ruha.Ing;
import Ruha.Ruha;

public class Main {

    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        Ruha ruha1 = new Ruha("Marci");
        Ing ruha2 = new Ing("Etelka", 100);
        mosoda.ruhaBevetel(ruha1);
        mosoda.ruhaBevetel(ruha2);

// ruha mosás szimulálás
        mosoda.mosas("Marci");
        mosoda.mosas("Etelka");

// tisztaság csekkolása
        System.out.println(ruha1.isTiszta()); // igaznak kéne lenni ha minden igaz(:3)

        // Példa használat
        mosoda.ruhaBevetel(new Ruha("Juli"));
        mosoda.ruhaBevetel(new Ruha("Gizi"));
        mosoda.ruhaBevetel(new Ruha("Gyula"));
        mosoda.ruhaBevetel(ruha2);

        mosoda.ruhaKivetel("Juli");
        mosoda.ruhaKivetel("Gizi");
        mosoda.ruhaKivetel("Gyula");
        mosoda.ruhaKivetel("Etelka");
        System.out.println(ruha2.getTulajdonos()+" Inge "+ruha2.getSzinIntenzitas()+" % színintenzitású");
    }
}
