/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac2_client;

import com.zstar.ws.GiaiPT_Service;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GiaiPtBac2_client {

    /**
     * @param args the command line arguments
     */
    public class Main {
        public void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double a, b, c;

            System.out.println("Nhập a");
            a = scan.nextDouble();

            System.out.println("Nhập b");
            b = scan.nextDouble();

            System.out.println("Nhập c");
            c = scan.nextDouble();

    //        GiaiPT_Service service = new GiaiPT_Service();
    //        GiaiPT ptbh = service.getGiaiPTPort();
            String s = giaiPTB2(a, b, c);

            System.out.println(s);
        }
    }

    private static String giaiPTB2(double a, double b, double c) {
        com.zstar.ws.GiaiPT_Service service = new com.zstar.ws.GiaiPT_Service();
        com.zstar.ws.GiaiPT port = service.getGiaiPTPort();
        return port.giaiPTB2(a, b, c);
    }

   
    
}
