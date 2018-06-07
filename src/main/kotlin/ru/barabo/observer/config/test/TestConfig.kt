package ru.barabo.observer.config.test

import ru.barabo.observer.config.ConfigTask
import ru.barabo.observer.config.barabo.plastic.turn.task.LoadCtlMtl
import java.util.*

object TestConfig : ConfigTask {
    override var timer: Timer? = null

    override fun name(): String = "TEST!!!"

    override fun timeOut(): Long = 20_000

    override fun configRun() {

        LoadCtlMtl.findAll()

        //ExecuteCtlMtl.findAll()

        this.executeTasks()
    }
}