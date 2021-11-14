package application.main.providers

import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.regex.Pattern

object Validator {
    private val loginPattern = Pattern.compile("^[a-zA-Z0-9]{1,20}$")
    private val valuePattern = Pattern.compile("^[0-9]+$")
    private val resourcePattern = Pattern.compile("^[a-zA-Z]{1,10}$")

    fun validateLogin(login: String) = loginPattern.matcher(login).find()

    fun validateDates(start: String, end: String): Pair<LocalDate, LocalDate> {
        val dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd")

        val startTime = LocalDate.from(dtf.parse(start))
        val endTime = LocalDate.from(dtf.parse(end))

        if (startTime > endTime)
            throw ParseException("dates don't meet the requirement", 0)

        return Pair<LocalDate, LocalDate>(startTime, endTime)
    }

    fun validateValue(value: String) = valuePattern.matcher(value).find()

    fun validateResource(resource: String) = resource.split(".").all { resourcePattern.matcher(it).find() }
}