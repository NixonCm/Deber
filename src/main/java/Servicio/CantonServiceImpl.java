/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Canton;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CantonServiceImpl implements CantonService {
    
    private static List<Canton> cantonList;

    public CantonServiceImpl() {
        cantonList = new ArrayList<>();
    }

    @Override
    public void crear(Canton canton) {
         this.cantonList.add(canton);
        
    }

    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }
    
}
