package pruebarelaciones

class Autor {
  String nombre

  static hasMany = [libros: Libro]

    static constraints = {
    }
}
