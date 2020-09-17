public class typeConversion {

    public static int toIntFromString(String num) {
        return Integer.parseInt(num);
    }

    public static int toArabicFromRoman(String roman) {
        int arabic;
        switch (roman) {
            case "I": arabic = 1;
            break;
            case "II": arabic = 2;
            break;
            case "III": arabic = 3;
            break;
            case "IV": arabic = 4;
            break;
            case "V": arabic = 5;
            break;
            case "VI": arabic = 6;
            break;
            case "VII": arabic = 7;
            break;
            case "VIII": arabic = 8;
            break;
            case "IX": arabic = 9;
            break;
            case "X": arabic = 10;
            break;
            default: arabic = -1;
            break;
        }
        return arabic;
    }

    public static String toRomanFromArabic(int arabic) {
        String dozens;
        String units;
        int doz;
        int unit;

        if (arabic <= 10)
        {
            units = toRomanFromArabicLessTen(arabic);

            return units;
        } else {
            doz = arabic / 10;
            dozens = toRomanFromArabicDozens(doz);

            unit = arabic % 10;
            units = toRomanFromArabicLessTen(unit);
        }

        return dozens + units;
    }

    public static String toRomanFromArabicLessTen(int unit) {
        String units;
        switch (Math.abs(unit)) {
            case 1:
                units = "I";
                break;
            case 2:
                units = "II";
                break;
            case 3:
                units = "III";
                break;
            case 4:
                units = "IV";
                break;
            case 5:
                units = "V";
                break;
            case 6:
                units = "VI";
                break;
            case 7:
                units = "VII";
                break;
            case 8:
                units = "VIII";
                break;
            case 9:
                units = "IX";
                break;
            case 10:
                units = "X";
                break;
            default:
                units = "";
                break;
        }

        if (unit < 0) {
            return "-" + units;
        }

        return units;
    }

    public static String toRomanFromArabicDozens(int doz) {
        String dozens;
        switch (doz) {
            case 1:
                dozens = "X";
                break;
            case 2:
                dozens = "XX";
                break;
            case 3:
                dozens = "XXX";
                break;
            case 4:
                dozens = "XC";
                break;
            case 5:
                dozens = "C";
                break;
            case 6:
                dozens = "CX";
                break;
            case 7:
                dozens = "CXX";
                break;
            case 8:
                dozens = "CXXX";
                break;
            case 9:
                dozens = "XL";
                break;
            case 10:
                dozens = "L";
                break;
            default:
                dozens = "";
                break;
        }

        return dozens;
    }


}
