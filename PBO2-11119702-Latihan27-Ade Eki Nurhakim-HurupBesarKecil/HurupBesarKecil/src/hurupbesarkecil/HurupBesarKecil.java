/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurupbesarkecil;


/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class HurupBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        String asli;
        System.out.println("Masukkan Kalimat : ");
        asli = masukan.next();
        
        String hurufBesar = asli.toUpperCase();
        String hurufKecil = asli.toLowerCase();

        System.out.println("======= Hasil Formating =======");
        System.out.println("String awal: " + asli);
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
    
}
