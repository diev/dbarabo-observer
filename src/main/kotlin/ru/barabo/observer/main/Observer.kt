package ru.barabo.observer.main

import org.slf4j.LoggerFactory
import ru.barabo.observer.gui.startLaunch
import ru.barabo.observer.mail.smtp.InfoSmtp
import ru.barabo.observer.mail.smtp.NbkiSmtp
import ru.barabo.observer.store.TaskMapper
import java.net.InetAddress
import java.util.*

object Observer {
    val logger = LoggerFactory.getLogger(Observer::class.java)!!

    fun startConfigs(args: Array<String>) {

        val comp = InetAddress.getLocalHost().hostName.uppercase(Locale.getDefault())

        val config = when (comp) {
            "BARABO" -> "BARABO"
            "OPERATOR" -> "CBR"
            "JZDO" -> "JZDO"
            "SKAD" -> "SCAD"
            "BARABO_" -> "TEST"
            "DSPO" -> "TEST"
            "POSEIDON" -> "CORRESPOND"
            else -> throw Exception("Неизвестная конфигурация для компа $comp")
        }

        TaskMapper.init(config, "AFINA")

        TaskMapper.runConfigList()

        logger.info("start Launch")
        startLaunch(args)

    }
}

fun main(args:Array<String>) {

   Observer.startConfigs(args)
}
