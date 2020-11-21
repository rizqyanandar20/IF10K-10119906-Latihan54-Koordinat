/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan54.koordinat;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat("jingga", 10, 4);
       wk.setNamaWarna("Jingga");
       wk.setX(10);
       wk.setY(4);
       System.out.println("Warna Koordinat "+wk.getNamaWarna());
       System.out.println("Kordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
    
}
