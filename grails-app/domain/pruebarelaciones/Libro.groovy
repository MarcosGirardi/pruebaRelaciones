package pruebarelaciones

class Libro {
  String titulo

  static belongsTo = [autor: Autor]

    static constraints = {
    }
}
