
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaPersistence {
    public void createPersona(Persona persona);
    public List<Persona> findAll();    
    public void savePersona(Persona persona);
    public void updatePersona(Persona persona);
    public Optional<Persona> findPersonaByCC(Integer cc);
    public List<Persona> findPersonaByNombre(String nombre);
    public List<Persona> findPersonaByApellido(String apellido);
    public List<Persona> findPersonaByGenero(String genero);
    public List<Persona> findPersonaByEdad(Integer edad);
}
