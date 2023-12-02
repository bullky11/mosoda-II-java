/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
Mosoda program I.
egy mosoda ruhákat vesz be. Ha kimossa őket tiszták lesznek.
a ruhákat tulajdonosuk után nevével azonosítja a mosoda,
ki is lehet venni a ruhát a mosodából név alapján.

Technikai specifikáció . 
-A mosoda tömbben tárolja a ruhákat!
-a mosoda alapértelmezetten 5 ruha befogadására alkalmas
-de ettől eltérőt is megadhatunk nem kell optimalizálni
-hogy a kiaott ruha helyére vegyünk be új ruhát,
-folyamatosan rakjuk tömbbe a ruhákat
-a kiadásnál is csak annyit kell megcsinálni,hogy ne legyen  a mosodában már ruha
-Jelezzük ,hogy megtel a mosoda,de máshogy nem kell foglalkozni ezzel az esettel


Mosoda II:
a mosoda fejlődött mostmár ingeket is tud bevenni
az ingeknek van  színintenzitáuk,ami minden mosás után 3%al csökken.
TEchnikai specifikáció:
legyen toString a termék osztályokban!

*/
// Importing the Ruha class
import Ruha.Ruha;
import Ruha.Ing;

public class Mosoda {
    private Ruha[] ruhak;
    private int kapacitas;
    private int jelenlegiRuhaSzam;

    public Mosoda() {
        this.kapacitas = 5; // alapértelmezett kapacitás
        this.ruhak = new Ruha[kapacitas];
        this.jelenlegiRuhaSzam = 0;
    }

    public Mosoda(int kapacitas) {
        this.kapacitas = kapacitas;
        this.ruhak = new Ruha[kapacitas];
        this.jelenlegiRuhaSzam = 0;
    }

    //methodok ide
      public void mosas(String tulajdonos) {
        for (int i = 0; i < jelenlegiRuhaSzam; i++) {
            if (ruhak[i].getTulajdonos().equals(tulajdonos)) {
                ruhak[i].setTiszta(true);
                System.out.println(tulajdonos + " ruhája kimosva, most már tiszta.");
                break;
            }
        }
    }
      public void ruhaBevetel(Ruha ruha) {
    if (ruha instanceof Ing) {
        if (jelenlegiRuhaSzam < kapacitas) {
            ruhak[jelenlegiRuhaSzam] = ruha;
            jelenlegiRuhaSzam++;
            System.out.println(((Ing) ruha).getTulajdonos() + " inge befogadva a mosodába.");
        } else {
            System.out.println("A mosoda megtelt, nem fogadunk be újabb ruhákat!");
        }
    } else {
        if (jelenlegiRuhaSzam < kapacitas) {
            ruhak[jelenlegiRuhaSzam] = ruha;
            jelenlegiRuhaSzam++;
            System.out.println(ruha.getTulajdonos() + " ruhája befogadva a mosodába.");
        } else {
            System.out.println("A mosoda megtelt, nem fogadunk be újabb ruhákat!");
        }
    }
}

    public void ruhaKivetel(String tulajdonos) {
    boolean ruhaKivett = false;
    for (int i = 0; i < jelenlegiRuhaSzam; i++) {
        if (ruhak[i].getTulajdonos().equals(tulajdonos)) {
            if (ruhak[i] instanceof Ing) {
                ((Ing) ruhak[i]).mosas(); // Simulate washing the shirt
            }
            ruhak[i] = ruhak[jelenlegiRuhaSzam - 1];
            ruhak[jelenlegiRuhaSzam - 1] = null;
            jelenlegiRuhaSzam--;
            ruhaKivett = true;
            System.out.println(tulajdonos + " ruhája kiadva a mosodából.");
            break;
        }
    }
    if (!ruhaKivett) {
        System.out.println("Nincs " + tulajdonos + " nevű ruha a mosodában.");
    }
}
}


