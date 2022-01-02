package pl.akademia108;

import java.util.Random;

public class GenerateRandom implements Runnable {
    private int random_int;
    private int min;
    private int max;
    private int breakNumber;

    public GenerateRandom(Integer min, Integer max, Integer breakNumber) {
        this.min = min;
        this.max = max;
        this.breakNumber = breakNumber;
    }

    @Override
    public void run() {

        while (this.random_int != this.breakNumber) {
                System.out.println(this.random_int != this.breakNumber);

                System.out.println("Wylosowany " + this.random_int);
                System.out.println("Break " + this.breakNumber);
                this.random_int = (int) Math.floor(Math.random() * (this.max - this.min + 1) + this.min);
                System.out.println(random_int);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}