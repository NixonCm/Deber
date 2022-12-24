/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.PaisServiceImpl;
import Modelo.Pais;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class PaisControl {
    
    private PaisServiceImpl paisServiceImpl;

    public PaisControl(){
        paisServiceImpl = new PaisServiceImpl();
    }

    public void crear(String [] data){
        var nroProvincia=Integer.valueOf(data[0]).intValue();
        var capital=Integer.valueOf(data[1]).intValue();
        var presidente=data[2];
        var continente=data[3];
        var nombre=data[4];
        var pais=new Pais(nroProvincia, capital, presidente, continente, nombre);
        this.paisServiceImpl.crear(pais);
    }
    public List<Object> listar(){
        return this.paisServiceImpl.listar();

    }
    
}
