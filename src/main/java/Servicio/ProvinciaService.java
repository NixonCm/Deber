/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Provincia;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface ProvinciaService {
    
      
    public void crear(Provincia provincia);

    public List<Provincia> listar();
    
}
