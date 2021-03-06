/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelo.CargoBEAN;
import modelo.FuncionarioBEAN;

import modelo.local.SharedPreferencesBEAN;
import modelo.local.SharedPreferencesDAO;
import util.Criptografia;

/**
 *
 * @author Daniel
 */
public class SharedP_Control {

    private static SharedPreferencesDAO sha = new SharedPreferencesDAO();

    public static void inserir(SharedPreferencesBEAN sh) {
        logOFF();
        sha.inserir(sh);
    }

    public static SharedPreferencesBEAN listar() {
        SharedPreferencesBEAN sh = sha.listarALl();
        if (sh.getFunCodigo() != 0) {
            String senha = Criptografia.criptografar(sh.getFunSenha());
            sh.setFunSenha(senha);
        }
        return sh;
    }

    public static SharedPreferencesBEAN listarLogin() {
        SharedPreferencesBEAN sh = sha.listarALl();
        return sh;
    }

    public static void logOFF() {
        sha.excluir();
    }

    public static void inserCargo(CargoBEAN u) {
        SharedPreferencesBEAN sh = listar();
        sh.setCargo(u.getNome());
        inserir(sh);
    }

    public static ArrayList<String> buscar(String email) {
        return sha.buscar(email);
    }
}
