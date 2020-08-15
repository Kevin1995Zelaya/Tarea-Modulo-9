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
public class Alumno {
    private String nombre;
    private String apellido;
    private String carrera;
    
    public Alumno(){
    
    }
    public Alumno(String _nombre,String _apellido,String _carrera){
        this.setNombre(_nombre);
        this.setApellido(_apellido);
        this.setCarrera(_carrera);
        
    }
    public void setNombre(String _nombre){
    this.nombre= _nombre;
    }
    public void setApellido(String _apellido){
    this.apellido= _apellido;
    }
    public void setCarrera(String _carrera){
    this.carrera= _carrera;
    }
    public String getNombre(){
    return this.nombre;
    }
    public String getApellido(){
    return this.apellido;
    }
    public String getCarrera(){
    return this.carrera;
    }
}
