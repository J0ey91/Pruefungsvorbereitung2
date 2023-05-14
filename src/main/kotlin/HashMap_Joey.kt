fun main() {
    // Erstellen einer Hash Map, um Benutzerdaten zu speichern
    val userDataMap = HashMap<String, String>()

    // Benutzerdaten hinzufügen
    userDataMap["Benutzer1"] = "Daten1"
    userDataMap["Benutzer2"] = "Daten2"
    userDataMap["Benutzer3"] = "Daten3"

    // Abrufen von Benutzerdaten
    val user1Data = userDataMap["Benutzer1"]
    println("Benutzer1 Daten: $user1Data")

    // Überprüfen, ob ein bestimmter Benutzer vorhanden ist
    val isUser2Exists = userDataMap.containsKey("Benutzer2")
    println("Benutzer2 vorhanden: $isUser2Exists")

    // Iteration über alle Benutzer und ihre Daten
    for ((benutzer, daten) in userDataMap) {
        println("Benutzer: $benutzer, Daten: $daten")
    }

    // Benutzerdaten aktualisieren
    userDataMap["Benutzer1"] = "Aktualisierte Daten"

    // Benutzerdaten entfernen
    userDataMap.remove("Benutzer3")

    // Ausgabe der aktualisierten Benutzerdaten
    for ((benutzer, daten) in userDataMap) {
        println("Benutzer: $benutzer, Daten: $daten")
    }
}
