package ru.barabo.observer.config.skad.plastic

import ru.barabo.observer.config.AbstractConfig
import ru.barabo.observer.config.barabo.crypto.task.*
import ru.barabo.observer.config.barabo.plastic.release.task.*
import ru.barabo.observer.config.barabo.plastic.turn.task.OutRegisterAquiring
import ru.barabo.observer.config.barabo.plastic.turn.task.OutRest
import ru.barabo.observer.config.barabo.plastic.turn.task.OutRestCheck

object PlasticOutSide  : AbstractConfig() {

    override fun name(): String = "Пластик: Извещения"

    override fun timeOut(): Long  = 20_000

    override fun configRun() {
        OutRegisterAquiring.findAll()

        OutRegisterAquiringMonth.findAll()
        OutRegisterAquiringWeek.findAll()
        OutRest.findAll()

        OutSalaryResponseFile.findAll()

        CreateAccount311p.findAll()
        RecreateAfterError311p.findAll()

        LoadRateThb.findAll()
        FixedExchangeCb.findAll()
        ExecuteExchangeCb.findAll()

        AutoUpdatePlasticJarCritical.findAll()
        AutoUpdatePlasticJarSoft.findAll()

        this.executeTasks()
    }
}