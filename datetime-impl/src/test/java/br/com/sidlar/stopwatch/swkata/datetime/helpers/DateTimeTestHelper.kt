package br.com.sidlar.stopwatch.swkata.datetime.helpers

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DateTimeTestHelper {

    fun newLocalDate(localDateString: String): LocalDate {
        return LocalDate.parse(localDateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    }

}