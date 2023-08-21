public class Format {
    public static String rublFormat(double sum) {
        String rubles;
        int mainPart = (int) sum;
        if (mainPart >= 100) mainPart %= 100;
        if (mainPart >= 20) mainPart %= 10;
        if (mainPart == 1) rubles = "рубль";
        else if (mainPart < 5 && mainPart > 0) rubles = "рубля";
        else rubles = "рублей";
        return rubles;
    }
}
