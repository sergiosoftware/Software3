/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesDocenteAdmin;

import Modelos.Entidades.Asignatura;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author sergioandres
 */
public class ValidacionesAsignatura implements Validator{
    
    /**
     * 
     * @param  o objeto a validar
     * @param errors Clase Errors disponible en el framework Spring
     */    
    @Override
    public void validate(Object o, Errors errors){
        Asignatura asig = (Asignatura) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigo", "required.codigo", "El campo codigo no puede estar vacio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre", "El campo nombre no puede estar vacio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "creditos", "required.creditos", "El campo creditos no puede estar vacio");
        if (asig.getCreditos()<0 || asig.getCreditos()>5){
            errors.rejectValue("creditos", "creditos.incorrect","el numero de creditos es invalido");
        }
    }

    @Override
    public boolean supports(Class<?> type) {
        return Asignatura.class.isAssignableFrom(type);
    }
    
}
