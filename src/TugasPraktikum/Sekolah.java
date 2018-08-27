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
public class Sekolah {
    protected int id_guru;
    protected String nama_guru;
    
    public Sekolah(int id_guru,String nama_guru){
        this.id_guru=id_guru;
        this.nama_guru=nama_guru;
    }
    
    public void infoguru(){
        System.out.println("Nama Guru: "+this.nama_guru);
        System.out.println("ID Guru  :"+this.id_guru);
}
}
