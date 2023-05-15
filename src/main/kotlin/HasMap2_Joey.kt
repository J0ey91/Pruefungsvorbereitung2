fun main() {
    // Erstellen einer Hash Map für Benutzer und deren Alter
    val userAgeMap = hashMapOf<String, Int>()

    // Benutzer hinzufügen
    userAgeMap["Alice"] = 25
    userAgeMap["Bob"] = 30
    userAgeMap["Charlie"] = 35

    // Wert abrufen
    val aliceAge = userAgeMap["Alice"]
    println("Alice ist $aliceAge Jahre alt.")

    // Wert aktualisieren
    userAgeMap["Bob"] = 32

    // Überprüfen, ob ein Schlüssel vorhanden ist
    val isCharlieExists = userAgeMap.containsKey("Charlie")
    println("Charlie existiert: $isCharlieExists")

    // Iteration über die Hash Map
    for ((user, age) in userAgeMap) {
        println("$user ist $age Jahre alt.")
    }

    // Entfernen eines Elements
    userAgeMap.remove("Charlie")

    // Ausgabe der aktualisierten Hash Map
    for ((user, age) in userAgeMap) {
        println("$user ist $age Jahre alt.")
    }
}
