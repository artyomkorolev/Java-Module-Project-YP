public class Formatter {

    static String twoPoints(float calc){

        return String.format("%.2f",calc);
    }

    static String ending(float calc){

        int calc1= (int) Math.floor(calc)%10;
        switch (calc1){
            case 2:
            case 3:
            case 4:
                return "рубля";
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                return "рублей";
            default:
                return "рубль";
        }


    }
}
