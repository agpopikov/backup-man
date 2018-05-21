package org.backup.man

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class App

internal val log = loggerFor(App::class.java)

fun main(args: Array<String>) {
    log.info("Application has been started!")
}

inline fun <reified T> loggerFor(clazz: Class<T>): Logger {
    return LoggerFactory.getLogger(clazz)
}
