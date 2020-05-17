package ChallengeProblems.ArraysAndStrings;

public class OneWay {
    public static void doTheThing() {
//        System.out.println("There is one or less differences " + isDifferent("pale", "elaps"));
        System.out.println("There is one or less differences " + isDifferentForReal("pale", "palss"));
    }

    public static boolean isDifferentForReal(String one, String two) {
        //This doesnt work because pale and elaps end up returning true
        one = one.toLowerCase();
        two = two.toLowerCase();
        //'a' starts at 87
        int differences = 0;

        if (one.length() - two.length() > 1 || two.length() - one.length() > 1) {
            return false;
        }

        if (one.length() - two.length() == 1 || two.length() - one.length() == 1) {
            differences += 1;
        }

        if (one.length() == two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    differences += 1;
                }
            }
        }

        int oneIterator = 0;
        int twoIterator = 0;

        if (one.length() > two.length()) {
            while (twoIterator < two.length()) {
                if (one.charAt(oneIterator) != two.charAt(twoIterator)) {
                    oneIterator += 1;
                    if (one.charAt(oneIterator) != two.charAt(twoIterator)) {
                        differences += 1;
                    }
                    if (differences == 2) {
                        return false;
                    }
                }
                twoIterator += 1;
            }
        }

        if (two.length() > one.length()) {
            while (oneIterator < one.length()) {
                if (one.charAt(oneIterator) != two.charAt(twoIterator)) {
                    twoIterator += 1;
                    if (one.charAt(oneIterator) != two.charAt(twoIterator)) {
                        differences += 1;
                    }
                    if (differences == 2) {
                        return false;
                    }
                } else {
                    oneIterator += 1;
                }
            }
        }

        return differences <= 1;
    }

    public static boolean isDifferent(String one, String two) {
        //This doesnt work because pale and elaps end up returning true
        one = one.toLowerCase();
        two = two.toLowerCase();
        //'a' starts at 87
        int differences = 0;

        if (one.length() - two.length() > 1 || two.length() - one.length() > 1) {
            return false;
        }

        if (one.length() - two.length() == 1 || two.length() - one.length() == 1) {
            differences += 1;
        }

        int oneNumericValue = 0;
        int twoNumericValue = 0;

        if (one.length() == two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    differences += 1;
                }
            }
        }

        if (one.length() > two.length()) {
            for (int i = 0; i < one.length() - 1; i++) {
                oneNumericValue += Character.getNumericValue(one.charAt(i));
                twoNumericValue += Character.getNumericValue(two.charAt(i));
            }
            oneNumericValue += Character.getNumericValue(one.charAt(one.length() - 1));

            int difference = oneNumericValue - twoNumericValue;
            difference = difference - 10;
            difference = difference + 97;
            String differentChar = String.valueOf((char) difference);
            if (!one.contains(differentChar)) {
                differences += 1;
            }
        }

        if (two.length() > one.length()) {
            for (int i = 0; i < two.length() - 1; i++) {
                oneNumericValue += Character.getNumericValue(one.charAt(i));
                twoNumericValue += Character.getNumericValue(two.charAt(i));
            }
            twoNumericValue += Character.getNumericValue(two.charAt(two.length() - 1));

            int difference = twoNumericValue - oneNumericValue;
            difference = difference - 10;
            difference = difference + 97;
            String differentChar = String.valueOf((char) difference);
            if (!two.contains(differentChar)) {
                differences += 1;
            }
        }

        return differences <= 1;
    }
}
