package pruebarelaciones

import grails.transaction.Transactional

@Transactional
class InitService {

    def init() {
      log.println("321")
      if (!FaceB.findAll()){
        log.println("asd")
        new FaceB(nariz:new NoseB()).save(flush:true)
      }
    }
}
