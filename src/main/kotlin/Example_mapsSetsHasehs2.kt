
fun main() {

// Eine MutableMap erstellen
    // MutableMap ist eine Map die veränderbar ist was die länge und den inhalt angeht.
    // <key, value> = <String, Int>
    val map1: MutableMap<String, Int> = mutableMapOf()

    // Werte zur MutableMap hinzufügen
    // (<Alice, 30>, <Bob, 25>, <Charlie, 35>)
    map1["Alice"] = 30
    map1["Bob"] = 25
    map1["Charlie"] = 35
    map1["Alice"] = 40 // Alice wird überschrieben

    // Werte aus der MutableMap abrufen
    val aliceAlter1 = map1["Alice"]
    println("Alice ist $aliceAlter1 Jahre alt.") // Alice ist 30 Jahre alt.
    println("")

    // Durch die MutableMap iterieren
    for ((name, alter) in map1) {
        println("$name ist $alter Jahre alt.")
    }
    println("")
    // Alice ist 30 Jahre alt.
    // Bob ist 25 Jahre alt.
    // Charlie ist 35 Jahre alt.

    // Einen Wert aktualisieren
    map1["Alice"] = 31
    println("Alice ist jetzt ${map1["Alice"]} Jahre alt.") // Alice ist jetzt 31 Jahre alt.
    println("")

    // Einen Wert entfernen
    map1.remove("Charlie")
    for ((name, alter) in map1) {
        println("$name ist $alter Jahre alt.")
    }
    println("")
    // Alice ist 31 Jahre alt.
    // Bob ist 25 Jahre alt.

    // Einen Wert hinzufügen
    map1["Eva"] = 28
    print("Eva ist ${map1["Eva"]} Jahre alt.") // Eva ist 28 Jahre alt.
    println("")
    println("")
    println("")



// Ein MutableSet erstellen
    println("Ein MutableSet erstellen: ")
    println("")
    val set1: MutableSet<String> = mutableSetOf()

    // Werte zum MutableSet hinzufügen
    // Ausprägungen können sein z.B: (<Alice>, <Bob>, <Charlie>), (<"Bob">, <"Alice">, <"Charlie">), ...
    set1.add("Alice")
    set1.add("Bob")
    set1.add("Charlie")
    set1.add("Alice")

    // Prüfen, ob ein Wert im MutableSet enthalten ist
    val containsAlice = set1.contains("Alice")
    println("Enthält das Set Alice? $containsAlice") // Enthält das Set Alice? true
    println("")

    // Durch das MutableSet iterieren
    for (name in set1) {
        println(name)
    }
    println("")
    // Alice
    // Bob
    // Charlie

    // Einen Wert entfernen
    set1.remove("Charlie")
    for (name in set1) {
        println(name)
    }
    println("")
    // Alice
    // Bob

    // Ein unveränderliches Set erstellen
    val unveraenderlichesSet: Set<String> = setOf("Anna", "Eva", "Frank")
    // unveraenderlichesSet.add("Bob") // Fehler: Das Set ist unveränderlich

    for (name in unveraenderlichesSet) {
        println(name)
    }
    // Anna
    // Eva
    // Frank
    println("")
    println("")
    println("")


    // Eine HashMap erstellen
    // (<Alice, 30>, <Bob, 25>, <Charlie, 35>)   --> klassische Map / MutableMap
    // (<fdbnjNJKFVDSNFGIJ, 30>, <DUIWGHDIWAEBRDFjkesc, 25>, <HFOIUESNfujoaesrdfvndfijk, 35>)   --> HashMap / MutableMap

    // User: <Alice, 30> --> System mit Hashmap: Alice = "fdbnjNJKFVDSNFGIJ" --> Transfer: <"fdbnjNJKFVDSNFGIJ", 30> --> Speichern <"fdbnjNJKFVDSNFGIJ", 30>
    // Datenbank: <"fdbnjNJKFVDSNFGIJ", 30> --> Transfer: <"fdbnjNJKFVDSNFGIJ", 30> --> System mit Hashmap: Alice = "fdbnjNJKFVDSNFGIJ", --> User: <Alice, 30>

    val map2 = hashMapOf<String, Int>()

    // Werte zur HashMap hinzufügen
    map2["Alice"] = 30
    map2["Bob"] = 25
    map2["Charlie"] = 35

    // Werte aus der HashMap abrufen
    val aliceAlter2 = map2["Alice"]
    println("Alice ist $aliceAlter2 Jahre alt.") // Alice ist 30 Jahre alt.
    println("")

    // Durch die HashMap iterieren
    for ((name, alter) in map2) {
        println("$name ist $alter Jahre alt.")
    }
    println("")
    // Alice ist 30 Jahre alt.
    // Bob ist 25 Jahre alt.
    // Charlie ist 35 Jahre alt.

    // Einen Wert aktualisieren
    map2["Alice"] = 31
    println("Alice ist jetzt ${map2["Alice"]} Jahre alt.") // Alice ist jetzt 31 Jahre alt.
    println("")

    // Einen Wert entfernen
    map2.remove("Charlie")
    for ((name, alter) in map2) {
        println("$name ist $alter Jahre alt.")
    }
    println("")
    // Alice ist 31 Jahre alt.
    // Bob ist 25 Jahre alt.
}