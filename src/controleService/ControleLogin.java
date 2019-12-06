/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleService;

import controle.SharedP_Control;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.FuncionarioBEAN;
import modelo.local.SharedPreferencesBEAN;
import modelo.local.SharedPreferencesDAO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sync.RestauranteAPI;
import sync.SyncDefault;

/**
 *
 * @author Daniel
 */
public class ControleLogin {

    public void logIN(SharedPreferencesBEAN f) {

        SharedP_Control.inserir(f);
    }

    public DefaultComboBoxModel buscar(String email) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> pe = SharedP_Control.buscar(email);
        for (String p : pe) {
            modelo.addElement(p);

        }
        return modelo;

    }
}
