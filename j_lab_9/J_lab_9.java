/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j_lab_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Vlad
 */
public class J_lab_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Vlad\\Documents\\NetBeansProjects\\AllNum.txt"));
           
            int[] num = new int[10];
            int i = 0;
            while (scanner.hasNextInt()) {
                num[i++] = scanner.nextInt();
           
                    
            }
             PrimeCheck pc = new PrimeCheck(num);
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
