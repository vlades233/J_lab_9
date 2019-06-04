/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j_lab_9;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Vlad
 */
public class PrimeCheck {
    public PrimeCheck(int[]n) {
        
this.WriteInFIle(this.Check(n));
}
    public int[] n;

    public int[] Check(int[] n) {
        int[] arrp = new int[10];
        int k = 0;
        for (int j = 0; j < n.length; j++) {
            for (int i = 2; i <= n[j] / 2; i++) {
                int temp;
                temp = n[j] % i;
                      System.out.println(n[j]);
                if (temp != 0) {
                    arrp[k] = n[i];
              
                    k++;

                    
                }
            }

        }
     return arrp;
    }

    private void WriteInFIle(int[] n) {
        try (FileWriter writer = new FileWriter("C:\\Users\\Vlad\\Documents\\NetBeansProjects\\PNum.txt", false)) {
            for (int i = 0; i < n.length ; i++) {
            writer.write(n[i] + ",");
            }

            writer.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
