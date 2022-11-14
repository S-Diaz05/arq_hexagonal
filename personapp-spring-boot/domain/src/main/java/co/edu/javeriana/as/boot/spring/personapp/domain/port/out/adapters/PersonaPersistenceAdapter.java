
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out.adapters;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.PersonaPersistence;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class PersonaPersistenceAdapter implements PersonaPersistence{
    private List<Persona> personas = new ArrayList<>();
    @Override
    public void createPersona(Persona persona){}
    @Override
    public List<Persona> findAll(){
        return personas;}
    @Override
    public void savePersona(Persona persona){}
    @Override
    public void updatePersona(Persona persona){}
    @Override
    public Optional<Persona> findPersonaByCC(Integer cc){
        return null;
    }
    @Override
    public List<Persona> findPersonaByNombre(String nombre){
        return personas;
    }
    @Override
    public List<Persona> findPersonaByApellido(String apellido){
        return personas;
    }
    @Override
    public List<Persona> findPersonaByGenero(String genero){
        return personas;}
    @Override
    public List<Persona> findPersonaByEdad(Integer edad){
     return personas;}
    
}
