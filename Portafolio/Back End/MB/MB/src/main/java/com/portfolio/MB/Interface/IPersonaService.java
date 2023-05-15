
package com.portfolio.MB.Interface;

import com.portfolio.MB.Entity.Persona;
import java.util.ArrayList;
import java.util.List;


public interface IPersonaService {
    //traer  lista persona
    public List<Persona> getPersona();
    
    //guardar obj tipo persona
    public void savePersona(Persona persona);
    
    //eliminar obj x id
    public void deletePersona(Long id);
    
    //buscar obj x id
    
    public Persona findPersona(Long id);
    
    List<Persona> listaPersonas = new ArrayList<>();
}
