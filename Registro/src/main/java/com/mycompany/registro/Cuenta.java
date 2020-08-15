/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.registro;

/**
 *
 * @author KEVIN EDUARDO ZELAYA
 */
public class Cuenta extends Alumno {
    private double cuentas;

    Cuenta(String string, String string0, double d, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public void Cuenta (){
    
}
    
public void Cuenta (double _cuentas){
    this.setCuentas(_cuentas);
   
}
public void Cuenta (String _nombre,String _apellido,String _carrera,double _cuentas){
    this.setNombre(_nombre);
    this.setApellido(_apellido);
    this.setCarrera(_carrera);
    this.setCuentas(_cuentas);
   
}

        
public void setCuentas(double _cuentas){
    this.cuentas= _cuentas;
}
public double getCuentas(){
return this.cuentas;
}


}
