                                              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus4;

/**
 *
 * @author MOKLET-2
 */
public class Bus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int password;
        
        //membuat objek busy dari class UjiBus4
        UjiBus4 busy = new UjiBus4(50);
        //memanggil method cetak pada class Bus4
        busy.cetak();
        
        //penambahan penumpang 
        busy.addPenumpang(3); //tambah 3 penumpang
        //memanggil method cetak pada class Bus4
        busy.cetak();
        
        //penambahan penumpang 
        busy.addPenumpang(5); //tambah 5 penumpang
        //memanggil method cetak pada class Bus4
        busy.cetak(); 
        
        //penambahan penumpang
        busy.addPenumpang(10); // tambah 10 penumpang
        //memanggil method cetak pada class Bus4
        busy.cetak();
        
    }
    
}
