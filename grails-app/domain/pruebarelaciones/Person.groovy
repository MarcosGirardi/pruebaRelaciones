package pruebarelaciones

class Person {
  String name
  Person parent

  static belongsTo = [ supervisor: Person ]

  static mappedBy = [ supervisor: "name", parent: "name" ]

  static constraints = {
    supervisor nullable:true
  }

}
