/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gourmet;

import View.PresentationPage;

/**
 *
 * @author re_hs
 */
public class Gourmet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PresentationPage page = new PresentationPage();
        page.pack();
        page.setLocationRelativeTo(null);
        page.setVisible(true);
    }   
}
