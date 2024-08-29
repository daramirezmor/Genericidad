/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericidad5;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ESTUDIANTE
 */
public class Genericidad5 {

    public static void main(String[] args) {
         // Crear una persona con todos sus datos
        Persona persona1 = new Persona("Juan", 25, "EPS Salud Total", LocalDate.of(1998, 5, 15));
        Persona persona2 = new Persona("Maria", 30, "EPS Sura", LocalDate.of(1993, 8, 22));
        


        // Uso de map para almacenar múltiples personas
        Map<String, Persona> personas = new LinkedHashMap<>();
        personas.put("Persona1", persona1);
        personas.put("Persona2", persona2);

        // Imprimir todas las personas
        for (Map.Entry<String, Persona> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}