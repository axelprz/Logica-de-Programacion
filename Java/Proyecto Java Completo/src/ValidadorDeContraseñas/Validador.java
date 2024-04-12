/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorDeContraseñas;

/**
 *
 * @author axelp
 */
public class Validador {

    private String password;

    public void setPassword(String p) {
        password = p;
    }
    
    public String validarPassword(){
        if(password.length() >= 8){
            if(password.matches(".*[a-z].*")){
                if(password.matches(".*[A-Z].*")){
                    if(password.matches(".*\\d.*")){
                        return "Contraseña válida";
                    }else{
                        return "Debe ingresar al menos un digito";
                    }
                }else{
                    return "Debe ingresar al menos una letra mayuscula";
                }
            }else{
                return "Debe ingresar al menos una letra minuscula";
            }
        }else{
            return "Debe ingresar al menos 8 caracteres";
        }
    }
}
