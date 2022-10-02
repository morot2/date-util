package com.solshar.util.date

import org.springframework.stereotype.Component
import java.time.LocalDate
import java.time.LocalDateTime

@Component
class DateService {

    fun getBaseDate(): LocalDate {
        return LocalDate.now()
    }

    fun getBaseDateTime(): LocalDateTime {
        return LocalDateTime.now()
    }
}