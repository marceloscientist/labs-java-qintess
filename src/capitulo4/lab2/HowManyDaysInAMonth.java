package capitulo4.lab2;

import java.time.Year;

public
class HowManyDaysInAMonth {

    private String month;

    public
    String getMonth( ) {
        return month;
    }

    public
    void setMonth (String month) {
        this.month = month;
    }

    public
    HowManyDaysInAMonth (String month) {
        this.setMonth(month);
    }

    private int FindQuantityOfDays() {

        switch (getMonth()) {
            case "Janeiro":
            case "Marco":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                return 31;
            case "Fevereiro":
                if(isYearLeap()) {
                    return 29;
                } else {
                    return 28;
                }
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                return 30;
            default:
                return -1;
        }
    }

    private
    boolean isYearLeap ( ) {
        return Year.now().isLeap();
    }

    @Override
    public
    String toString ( ) {
        int daysInTheChosenMonth = FindQuantityOfDays();
        return (daysInTheChosenMonth >= 28 && daysInTheChosenMonth <= 31) ? "O mês escolhido tem " + daysInTheChosenMonth + " dias" : "Certeza que escreveu o nome do mês corretamente?";
    }
}
