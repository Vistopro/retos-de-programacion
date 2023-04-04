import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reto12 {
    public static void main(String[] args) {
        System.out.println(friday13(10, 2023));
    }

    static boolean friday13(int month, int year) {

        LocalDate dt = LocalDate.of(year, month, 13);
        DayOfWeek dayOfWeek = dt.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.FRIDAY)
            return true;
        return false;
    }
}
