package pruebarelaciones

import grails.transaction.Transactional

@Transactional
class InitService {

    def init() {
      log.println("entra init")

      if (!Author.findAll()){
        log.println("no hay autores")
        log.println("--------------------------------")
        new Author(name:"Stephen King")
          .addToBooks(new Book(title:"The Stand"))
          .addToBooks(new Book(title:"The Shining"))
          .save()

        /*new Book(name:"Groovy in Action")
          .addToAuthors(new Author(name:"Dierk Koenig"))
          .addToAuthors(new Author(name:"Guillaume Laforge"))
          .save()*/
      } else {
        def a = Author.findAll()

        for (autor in a){
          log.println ("${autor.name}")

          for (libro in autor.books){
            log.println libro.title
          }
          log.println("--------------------------------")
        }
      }

    }
}
