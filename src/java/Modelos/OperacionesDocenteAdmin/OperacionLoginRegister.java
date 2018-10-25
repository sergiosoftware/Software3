/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesDocenteAdmin;

import Modelos.CRUDEntidades.CRUDSesiones;
import Modelos.Entidades.Estudiante;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JulianCamilo
 */
public class OperacionLoginRegister {
    private CRUDSesiones session;

    public OperacionLoginRegister() {
    }
    

    public Estudiante iniciarSesion(String username, String password) {
        String newpass=encriptar(password);
        session= new CRUDSesiones();
        Estudiante estudiante=session.consultar(username,newpass);
        System.out.println("");
        return estudiante;
    }

    private String encriptar(String password) {
        String newpass="";
        try {
            MessageDigest encryp= MessageDigest.getInstance("MD5");
            encryp.update(password.getBytes());
            byte[] bytes=encryp.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            newpass=sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(OperacionLoginRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pass encriptada: "+newpass);
        return newpass;
    }
    
}
