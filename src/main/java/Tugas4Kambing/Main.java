/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4Kambing;

/**
 *
 * @author Aris Prabowo
 * IF10K
 * 10119914
 */
public class Main {
    
    public void tambahKambing()
    {
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main kambingJantan = new Main();
        kambingJantan.tambahKambing();
    }
    
}
