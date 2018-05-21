package org.backup.man

class Env {

    val BACKUP_PREFIX = env("BACKUP_PREFIX", required = true)
    val BACKUP_PATH = env("BACKUP_PATH", default = "./")
}

internal fun env(name: String, required: Boolean = false, default: String = ""): String {
    val value = System.getenv(name)
    if (required && value.isNullOrEmpty()) {
        throw IllegalArgumentException("Required env $name is not present.")
    }
    return if (value != null) name else default
}
