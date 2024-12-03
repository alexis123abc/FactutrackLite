/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import DAO.UsuariosDAO;
import java.util.Vector;

/**
 *
 * @author DERICK ALEXIS
 */
public class UsuariosLogica {
    
        public static boolean UsuarioEncontrado(String usuario, String contrasena){
            UsuariosDAO nuevoObjeto = new UsuariosDAO();
            return nuevoObjeto.encontrarUsuario(usuario, contrasena);
    }
}
