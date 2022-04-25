package lab2.c;

import org.jetbrains.annotations.Nullable;

import java.time.Year;
import java.util.Optional;
import java.util.OptionalInt;

public
class WorldCupYears {


    private int year;

    public
    WorldCupYears ( ) {
        setYear(getCurrentYear());
    }

    public
    WorldCupYears (int year) {
        setYear(year);
    }

    private int getCurrentYear() {
        return Year.now().getValue();
    }

    public
    int getYear ( ) {
        return year;
    }

    public
    void setYear (int year) {
        this.year = year;
    }

    @Override
    public
    String toString ( ) {
        int chosenYear = getYear();
        StringBuilder display = new StringBuilder("");
        for(int worldCupYear = 1930; worldCupYear <= chosenYear ; worldCupYear += 4) {
            if(!(worldCupYear == 1942 || worldCupYear == 1946)) {
                display.append("Copa do mundo de " + worldCupYear + "\n");
            }
        }
        return display.toString();
    }

}
