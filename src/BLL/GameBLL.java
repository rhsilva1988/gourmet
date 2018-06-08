/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Model.MealModel;
import java.util.ArrayList;

/**
 *
 * @author re_hs
 */
public class GameBLL {
    private final MealModel pasta;
    private final MealModel notPasta;
    
    public final ArrayList<MealModel> pastas;
    public final ArrayList<MealModel> notPastas;

    private static final GameBLL INSTANCE = new GameBLL();
 
    private GameBLL() {
        this.notPasta = new MealModel("Bolo de Chocolate", "");
        this.pasta = new MealModel("Lasanha", "");
        
        this.notPastas = new ArrayList();
        this.pastas = new ArrayList();
        
        this.pastas.add(pasta);
        this.notPastas.add(notPasta);
    }
 
    public static GameBLL getInstance() {
        return INSTANCE;
    }
}
