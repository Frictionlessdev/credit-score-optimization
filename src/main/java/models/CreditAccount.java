package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CreditAccount {

    private LocalDate accountOpeningDate;

    public int getAccountAgeInYears() {
        LocalDate currentDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(accountOpeningDate, currentDate);
        return Math.toIntExact(years);
    }
}
