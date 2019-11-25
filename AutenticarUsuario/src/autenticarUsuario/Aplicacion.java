/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticarUsuario;
import modelo.Usuario;
import modelo.Sistema;
import pantallas.pantallaLogin;
/**
 *
 * @author Juan
 */
public class Aplicacion {
    
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        Usuario tecnico = new Usuario("tecnico","12345");
        Usuario empleadoPostventa = new Usuario("postventa","maxElec");
        Usuario gerente = new Usuario("Victor","2019");        
        sistema.agregarUsuario(tecnico);
        sistema.agregarUsuario(empleadoPostventa);
        sistema.agregarUsuario(gerente);
        AutenticarUsuarioController ctrl = new AutenticarUsuarioController(sistema);
        ctrl.iniciarPantalla();
    }
}
