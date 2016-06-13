package pruebarelaciones

import grails.transaction.Transactional

@Transactional
class InitService {

    def init() {
      log.println("entra init")

      if(!Autor.findAll()){
        log.println("no hay autores")
      } else{
        log.println("hay autores")
        log.println("-----------------------------")
        def a = Autor.findAll()

        for (autor in a){
          log.println ("${autor.nombre}:")
          //log.println("Autor: ${a}:")
          for(libro in autor.libros){
            log.println libro.titulo
          }
          log.println("-----------------------------")
        }
      }

    }
}
