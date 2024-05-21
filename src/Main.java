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
        System.out.println(mass(1,10,5));
        System.out.println("--------------7--------------");

        System.out.println("--------------11--------------");
        System.out.println(atbulas("Giedrys"));
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
        for(int i = 0; i <length; i++){
            int res = (int) Math.round(Math.random()* (max-min)+ min);
            rezultatas[i]= res;
        }
        return rezultatas;
    }

    public static String atbulas(String text){
        String reversas="";
        for (int i = text.length()-1; i >= 0; i--){
            reversas+=text.charAt(i);
        }
        return reversas;
    }
}


