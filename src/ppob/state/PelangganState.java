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
public class PelangganState {
    private static int idPelanggan;
    
    private static String username;
    private static String namaPelanggan;
    private static String alamat;
    private static String daya;
    private static int tarifPerKwh;

    
    public static int getIdPelanggan() {
        return idPelanggan;
    }

    public static void setIdPelanggan(int idPelanggan) {
        PelangganState.idPelanggan = idPelanggan;
    }
    
    public static String getDaya() {
        return daya;
    }

    public static void setDaya(String daya) {
        PelangganState.daya = daya;
    }

    public static int getTarifPerKwh() {
        return tarifPerKwh;
    }

    public static void setTarifPerKwh(int tarifPerKwh) {
        PelangganState.tarifPerKwh = tarifPerKwh;
    }
    private static int nomorKwh;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        PelangganState.username = username;
    }

    public static String getNamaPelanggan() {
        return namaPelanggan;
    }

    public static void setNamaPelanggan(String namaPelanggan) {
        PelangganState.namaPelanggan = namaPelanggan;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        PelangganState.alamat = alamat;
    }

    public static int getNomorKwh() {
        return nomorKwh;
    }

    public static void setNomorKwh(int nomorKwh) {
        PelangganState.nomorKwh = nomorKwh;
    }
    
    
}
