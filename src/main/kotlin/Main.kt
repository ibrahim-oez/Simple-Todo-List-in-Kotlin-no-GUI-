/*
* Projekt Fortschritt ist genug, sollte nur eine Übung sein.
* Eventuelle feature wären, eine GUI, weitere funktionen wie
* das Löschen von Tasks etc.
*
* Insgesamt könnte man die funktionalitäten der Tasklist Klasse ergänzen.
* Und das Programm erweitern
*
* @wk_main
* */

fun main(args: Array<String>) {

    var cont = true
    val listSpeicher =  ArrayList<TaskList>()
    val taskSpeicher =  ArrayList<Task>()
   while (cont){
       println("""
           1. Erzeuge eine Task-Liste
           2. Erzeuge eine Task
           3. Tasks Ansicht
           4. Beenden
       """.trimIndent())
       val eingabe = readln().toInt()
       when(eingabe){
           1 -> {
               print("Willst du eine neue Liste Erstellen : ")
               val ans = readln()
               if (ans.equals("ja", ignoreCase = true)){
                   val newList = TaskList()
                   listSpeicher.add(newList)
                   println("Liste wurde erfolgreich erstellt ")
               }
           }
           2 -> {
               print("Titel eingeben:")
               val title =  readln()
               print("Beschreibung eingeben:")
               val beschreibung = readln()
               val newTask = Task(title,beschreibung,false)
               println("Task $title wurde erstellt")
               taskSpeicher.add(newTask)
           }
           3 ->{
               println("Deine Task-Liste enthält folgende objekte")
               for (i in taskSpeicher){
                   println(i.titel)
               }
           }
           4 -> {
               println("Willst du wirklich raus ? " +
                       "Hast du schon all deine Aufgaben erledigt")
               println("Ja/Nein ? ")
               val ans = readln()
               if (ans.equals("ja", ignoreCase = true)){
                   cont = false
               }else{
                   continue
               }
           }
       }
    }
}

