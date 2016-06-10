package pruebarelaciones

class FaceC {
  String nombre

  static hasOne = [nose:NoseC]

    static constraints = {
      nose (unique:true)
    }
}
