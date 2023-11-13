package io.jcurtis.kotlinexample

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class KotlinPaper: JavaPlugin() {
    override fun onEnable() {
        // Pair is part of the Kotlin standard library
        // this is a test to see if it works properly on the server
        val testPair = Pair("Hello", "World")

        logger.info("KotlinPaper has been enabled!")

        // these lines test to make sure that the Kotlin standard library is working
        logger.info("${testPair.first} From KotlinPaper")
        logger.info("${testPair.second} From KotlinPaper")
    }
}