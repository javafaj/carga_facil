/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author pepag
 */
@ManagedBean
public class teste {
    
    
    public void save() {
        addMessage("Success", "Data saved");
    }

    private void addMessage(String success, String data_saved) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
