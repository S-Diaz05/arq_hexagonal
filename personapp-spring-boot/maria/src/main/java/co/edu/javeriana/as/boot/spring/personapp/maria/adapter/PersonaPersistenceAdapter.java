/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.PersonaPersistence;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonaPersistenceAdapter implements PersonaPersistence{
    @GetMapping(value = "/persona")
    @Override
    public List<Persona> findAll() {
        return null;
    }
    @PostMapping(value = "/persona")
    @Override
    public void createPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @PostMapping(value = "/persona")
    @Override
    public void savePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @PostMapping(value = "/persona")
    @Override
    public void updatePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @GetMapping(value = "/persona/{cc}")
    @Override
    public Optional<Persona> findPersonaByCC(Integer cc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @GetMapping(value = "/persona/{nombre}")
    @Override
    public List<Persona> findPersonaByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @GetMapping(value = "/persona/{apellido}")
    @Override
    public List<Persona> findPersonaByApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @GetMapping(value = "/persona/{genero}")
    @Override
    public List<Persona> findPersonaByGenero(String genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @GetMapping(value = "/persona/{edad}")
    @Override
    public List<Persona> findPersonaByEdad(Integer edad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
