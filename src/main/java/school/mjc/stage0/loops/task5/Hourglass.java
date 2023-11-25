package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j <= height - 1 - i) && j >= i || (j <= i && j >= height - 1 - i))
                    System.out.print(8);
                else System.out.print(" ");
                if (j == height - 1) System.out.println();
            }
        }
    }
}
