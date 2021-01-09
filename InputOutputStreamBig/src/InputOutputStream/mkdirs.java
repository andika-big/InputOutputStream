/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputStream;

import java.io.File;

public class mkdirs {
     public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;
        try {
            
            file = new File(dirname);
            
            paths = file.list();
            
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
