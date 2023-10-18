public class Formatter {

    static String twoPoints(float calc){

        return String.format("%.2f",calc);
    }

    static String ending(float calc){

        int calc1= (int) Math.floor(calc)%10;
        return switch (calc1) {
            case 2, 3, 4 -> "рубля";
            case 5, 6, 7, 8, 9, 0 -> "рублей";
            default -> "рубль";
        };


    }
}
