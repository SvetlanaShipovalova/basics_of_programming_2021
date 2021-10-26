import java.util.Scanner;

public class Lesson211026 {
    public static void main(String[] args) {
        Colors blue = Colors.Blue;
        Colors yellow = Colors.Yellow;
        //Colors color = getColor();

        var colors = Colors.values();

        for(int i = 0; i < colors.length; ++i) {
            colors[i].printInfo();

//            switch (colors[i]) {
//                case Red -> System.out.println("Красный");
//                case Blue -> System.out.println("Синий");
//                case Brown -> System.out.println("Коричневый");
//                case Gray -> System.out.println("Серый");
//                case Green -> System.out.println("Зеленый");
//                case Yellow -> System.out.println("Желтый");
//            }
        }


    }

    private static Colors getColor() {
        Scanner sc = new Scanner(System.in);
        String colorName = sc.nextLine();
        return Colors.valueOf(colorName);
    }
}
