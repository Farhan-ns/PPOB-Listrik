/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppob.state;

/**
 *
 * @author SMKN4
 */
public class AdminState {
    private static String username;
    private static String namaAdmin;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AdminState.username = username;
    }

    public static String getNamaAdmin() {
        return namaAdmin;
    }

    public static void setNamaAdmin(String namaAdmin) {
        AdminState.namaAdmin = namaAdmin;
    }
    
    
}
