/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticarUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;
import modelo.Usuario;
import modelo.Sistema;
import pantallas.pantallaLogin;


/**
 *
 * @author Juan
 */
public class AutenticarUsuarioController implements ActionListener {
    private Sistema sistema;
    private pantallaLogin login;
    
    public AutenticarUsuarioController(Sistema sistema){
        this.sistema = sistema;
        this.login = new pantallaLogin();
        this.login.botonAutenticar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        autenticarUsuario();
    }    
    
    public void iniciarPantalla(){
        login.setTitle("Login");
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
    
    public void autenticarUsuario(){
        String username = login.jTextField1.getText().toString();
        String password = login.jPasswordField1.getText().toString();
        Usuario usuario;
        usuario = sistema.getUsuario(username);
        if (usuario == null){
            login.mostrarDialogo(false);
        }
        else{
            boolean validez = sistema.validarUsuario(password, usuario);
            if (validez == true){
                login.mostrarDialogo(true);
            }
            else{
                login.mostrarDialogo(false);
            }
        }
    }
}
