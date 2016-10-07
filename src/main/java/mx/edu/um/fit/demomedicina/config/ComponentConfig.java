/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Priscila
 */
@Configuration
@ComponentScan(basePackages = "mx.edu.um.fit.demomedicina") //configurar las anotaciones para decirleque son clases especiales ya que son frameworks
@PropertySource("file:${user.home}/.DemoMedicina.properties")
public class ComponentConfig {
    
}
