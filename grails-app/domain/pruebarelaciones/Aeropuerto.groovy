package pruebarelaciones

class Aeropuerto {
  String nombre

  static hasMany = [vuelosEntrantes: Vuelo, vuelosSalientes: Vuelo]
  static mappedBy = [vuelosEntrantes: "aeropuertoOrigen",
                     vuelosSalientes: "aeropuertoDestino"]

    static constraints = {
    }
}
