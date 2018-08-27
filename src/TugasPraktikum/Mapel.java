/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class Mapel extends Perpustakaan {
 private String pelajaran;
 
 public Mapel(String pelajaran,String buku,int id_guru,String nama_guru){
     super(buku,id_guru,nama_guru);
     this.pelajaran = pelajaran;
 }
 public void output(){
     super.infoguru();
     System.out.println("Mengajar : "+this.pelajaran);
 }
}
