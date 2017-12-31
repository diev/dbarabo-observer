package ru.barabo.observer.config.cbr.other

import org.slf4j.LoggerFactory
import ru.barabo.observer.config.ConfigTask
import ru.barabo.observer.config.ExitStatus
import ru.barabo.observer.config.cbr.other.task.*

object OtherCbr: ConfigTask {

    override var exitStatus: ExitStatus = ExitStatus.STOP

    val logger = LoggerFactory.getLogger(OtherCbr::class.java)!!

    override fun timeOut(): Long = 30_000

    override fun name() :String = "Прочее"

    override fun configRun() {

        RemartMail.findAll()
        TtsMailFromOtk.findAll()
        SbMailFromCbr.findAll()
        ResponseToOrderCbr.findAll()
        NbkiAllReportsSend.findAll()
        UnlockUsersMonday.findAll()
        CecReportProcess.findAll()

        RemartMail.executeAll()
        TtsMailFromOtk.executeAll()
        SbMailFromCbr.executeAll()
        ResponseToOrderCbr.executeAll()
        NbkiAllReportsSend.executeAll()
        UnlockUsersMonday.executeAll()
        CecReportProcess.executeAll()
    }

}