
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in.ports;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;

public interface GetPersona {
    Persona getPersona(Integer cc);
}
