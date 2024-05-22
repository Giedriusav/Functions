public class Main {
    public static void main(String[] args) {
        System.out.println("--------------1--------------");
        Skaiciuojam1(4, 5);
        System.out.println("--------------2--------------");
        System.out.println(PISq());
        System.out.println("--------------3--------------");
        Skaiciuojam3(2, 3);
        System.out.println("--------------4--------------");
        int[] numbers = {1, 5, 8, 3};
        Ciklas(numbers);
        System.out.println();
        System.out.println("--------------5--------------");
        Skaiciuojam5(0, 25);
        System.out.println("--------------6--------------");
        int[] mass2 = mass(1, 10, 6);
        System.out.println("--------------7--------------");
        System.out.println(sumArray(mass2));
        System.out.println("--------------8--------------");
        System.out.println(avgArray(mass2));
        System.out.println("--------------9--------------");
        stac(10, 5);
        System.out.println("--------------10--------------");
        System.out.println(sksymbol("Šiandien labai graži diena"));
        System.out.println("--------------11--------------");
        System.out.println(atbulas("Giedrys"));
        System.out.println("--------------1s--------------");
        System.out.println(labas("labas"));
        System.out.println("--------------2s--------------");
        generateRndStr(10);
        System.out.println(generateRndStr(10));
        System.out.println("--------------3s--------------");
        int[] numbers2 = {44, 55, 66, 77};
        int divisor = findDivisor(numbers2);
        System.out.println("Divisor: " + divisor);  // Output: Divisor: 11



    }

    public static void Skaiciuojam1(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static void Skaiciuojam3(int num3, int num4) {
        System.out.println(num3 * num4);
    }

    public static void Ciklas(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void Skaiciuojam5(int min, int max) {
        int random = (int) (Math.random() * (max - min) + min);
        System.out.println(random);
    }

    public static int[] mass(int min, int max, int length) {
        int[] rezultatas = new int[length];
        for (int i = 0; i < length; i++) {
            rezultatas[i] = (int) Math.round(Math.random() * (max - min) + min);
            System.out.println(rezultatas[i] + " ");
        }
        return rezultatas;
    }

    public static int sumArray(int[] rezultatas) {
        int sum = 0;
        for (int element : rezultatas) {
            sum += element;
        }
        return sum;
    }

    public static double avgArray(int[] rezultatas) {
        double suma = 0;
        for (int element : rezultatas) {
            suma += element;
        }
        double vidurkis = suma / rezultatas.length;
        return vidurkis;
    }


    public static void stac(int num5, int num6) {
        for (int i = 0; i < num5; i++) {
            for (int j = 0; j < num6; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static String sksymbol(String text) {
        int letterCount = 0;
        int spaceCount = 0;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (c == ' ') {
                spaceCount++;
            }
        }

        return "raides : " + letterCount + " tarpai : " + spaceCount;
    }

    public static String atbulas(String text) {
        String reversas = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversas += text.charAt(i);
        }
        return reversas;
    }

    public static String labas(String text) {

        return "---" + text + "---";
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public static String fixStr(int length) {
        for
        return;
    }


    public static int findDivisor(int[] numbers) {
        int result = numbers[0];
        for (int num : numbers) {
            while (num != 0) {
                int temp = result % num;
                result = num;
                num = temp;
            }
        }
        return result;
    }
}


