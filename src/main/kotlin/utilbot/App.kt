/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package utilbot

import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.utils.env
import utilbot.extensions.UtilCommands

private val TOKEN = env("TOKEN")

suspend fun main() {
    val bot = ExtensibleBot(TOKEN) {
        plugins {
            enabled = false
        }
        extensions {
            add(::UtilCommands)
            //add(::MappingCommands)
        }
    }
    bot.start()
}
