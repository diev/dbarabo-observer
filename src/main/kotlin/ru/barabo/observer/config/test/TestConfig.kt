package ru.barabo.observer.config.test

import ru.barabo.observer.config.AbstractConfig

object TestConfig : AbstractConfig() {

    override fun name(): String = "TEST!!!"

    override fun timeOut(): Long = 20_000

    override fun configRun() {

        //LoadCtlMtl.findAll()
        //ExecuteCtlMtl.findAll()

        //OutRegisterAquiringWeek.findAll()


        //OutRegisterAquiringMonth.findAll()

        //SendBlockUnblockAccountPC.findAll()

        //LoadAcq.findAll()

        this.executeTasks()
    }
}