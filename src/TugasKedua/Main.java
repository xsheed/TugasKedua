/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKedua;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Main {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int pilih, panjang, lebar, tinggi;
       float r,t;
       boolean menu = true;
       do{
            System.out.println("INPUT");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("Panjang = ");
                    panjang = input.nextInt();
                    System.out.print("Lebar = ");
                    lebar = input.nextInt();
                    System.out.print("Tinggi = ");
                    tinggi = input.nextInt();
                    Balok balok = new Balok(tinggi, panjang, lebar);
                    System.out.println("Luas Persegi Panjang = " + balok.Luas());
                    System.out.println("Keliling Persegi Panjang = " + balok.Keliling());
                    System.out.println("Volume Balok = " + balok.Volume());
                    System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());
                    break;
                case 2 :
                    System.out.print("Jari-jari = ");
                    r = input.nextFloat();
                    System.out.print("Tinggi = ");
                    t = input.nextFloat();
                    Kerucut kerucut = new Kerucut(t, r);
                    System.out.println("Luas Lingkaran = " + kerucut.Luas());
                    System.out.println("Keliling Lingkaran = " + kerucut.Keliling());
                    System.out.println("Volume Kerucut = " + kerucut.Volume());
                    System.out.println("Luas Permukaan Kerucut = " + kerucut.luasPermukaan());
                    break;
                case 3 :
                    menu = false;
            }
       }while(menu);
   }
}
