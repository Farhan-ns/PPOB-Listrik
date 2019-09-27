/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppob;

import ppob.db.DBConnection;

/**
 *
 * @author SMKN4
 */
public class PPOBMain {
    public static void main(String[] args) {
        if (DBConnection.getConnection() != null) {
            System.out.println("NOTNULL");
        }
    }
}
