package application.main.services

import java.security.MessageDigest
import kotlin.random.Random

object Encoder {
    fun encodePassword(pass: String, salt: String) = encode(encode(pass) + salt)

    fun saltGen(): String = Random.nextBytes(32).toHex()

    private fun encode(source: String): String {
        return MessageDigest
            .getInstance("MD5")
            .digest(source.toByteArray()).toHex()
    }

    private fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }
}