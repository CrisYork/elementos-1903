package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner {

    @Autowired
    RepoCliente repoCliente;
    
	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
    
        //Te crea el primer registro en mongobd
   //   repoCliente.save(new Cliente(1,"CrisYork", "crisyork@gmail.com"));
   
   repoCliente.save(new Cliente(4, "Jar","jababy@baby.com"));
  
   //Buscar a todos
   for(Cliente c: repoCliente.findAll()){
       
        System.out.println(c);
        
   }
   
   //Buscar por id
        System.out.println(repoCliente.findById(1));
        
    
    //Borramos el primero y lo volvemos a crear
    //repoCliente.deleteById(1);
    }

}
