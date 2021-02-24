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
public class UjiBus4 {
  private double penumpang;
  private double maxPenumpang;
  private double penumpangBaru;
  private double counter;
  
    //konstruksi class Bus4
    public UjiBus4(int maxPenumpang){
      this.maxPenumpang = maxPenumpang;
      penumpang = 0;
  }
  
    //method mutator untuk menambahkan penumpang 
    public void addPenumpang(double penumpang){
      double temp;
      temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang=temp;
            counter++;
        }
    }
  
    //minta password
    public void getPenumpang(double password){
      if (password==24){
     System.out.print("Password Benar");
                addPenumpang(15);
    } else
     System.out.print("Password Salah");
    }
    
   public void cetak() {
        System.out.println("Penumpang bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);

    }
  }

