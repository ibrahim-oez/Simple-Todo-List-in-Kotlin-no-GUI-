open class Task(val titel:String, val beschreibung:String, val status:Boolean)

class TaskList(){
    private val taskList = mutableListOf<Task>()
    private val checked = mutableListOf<String>()
    private val unchecked = mutableListOf<String>()



    fun add(vararg task: Task){
        taskList.addAll(task)
    }

    fun showTask(index:Int){
        if (index >= 0 && index < taskList.size){
            val task = taskList[index]
            println("TASK MIT DEM INDEX $index:")
            println("Titel: ${task.titel} \nBeschreibung: ${task.beschreibung}")
        }else{
            println("Ungültiger Index !")
        }
    }

    fun showAllTasks(){
        var j = 0
        println("UEBERSICHT:")
        for (i in taskList){
                println("$j. Titel: ${i.titel} \nBeschreibung: ${i.beschreibung}")
            j++
        }
    }

    fun showUnchecked(){
        println("UNCHECKED:")
        for (i in taskList){
            if (!i.status){
                unchecked.add(i.titel)
                println("Titel: ${i.titel} \nBeschreibung: ${i.beschreibung}")
            }
        }
    }

    fun showChecked(){
        println("CHECKED:")
        for (i in taskList){
            if (i.status){
                checked.add(i.titel)
                println("Titel: ${i.titel} \nBeschreibung: ${i.beschreibung}")
            }
        }
    }

    fun deleteTask(task: Task){
        taskList.remove(task)
        println("Task ${task.titel} wurde gelöscht")
    }

}

