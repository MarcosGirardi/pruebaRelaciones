package pruebarelaciones

class Book {
  String title

  static belongsTo = Author
  static hasMany = [authors:Author]


    static constraints = {
    }
}
