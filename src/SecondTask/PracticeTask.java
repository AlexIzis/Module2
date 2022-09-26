package SecondTask;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTask {
    public interface Printable {
        void print();
    }

    public interface Shape {
        void perimeter();

        void area();
    }

    static class Rectangle implements Shape {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void perimeter() {
            System.out.println(2 * this.length + 2 * this.width);
        }

        @Override
        public void area() {
            System.out.println(this.length * this.width);
        }
    }

    static class Square implements Shape {
        int length;

        public Square(int length) {
            this.length = length;
        }

        @Override
        public void perimeter() {
            System.out.println(4 * this.length);
        }

        @Override
        public void area() {
            System.out.println(this.length * this.length);
        }
    }

    static class Circle implements Shape{
        int diameter;

        public Circle(int diameter) {
            this.diameter = diameter;
        }

        @Override
        public void perimeter() {
            System.out.println(this.diameter * Math.PI);
        }

        @Override
        public void area() {
            System.out.println(this.diameter * this.diameter * Math.PI * 0.25); /* S = (1/4 * pi * D^2) */
        }
    }



    public static void repeatTask(int times, Printable task) {
        for (int i = 0; i < times; i++) {
            task.print();
        }
    }

    public static void lambdaTask(){
        Printable myClosure = () -> System.out.println("I love Java");
        PracticeTask.repeatTask(10, myClosure);
    }

    enum Directions {
        UP,
        LEFT,
        RIGHT,
        DOWN
    }

    static class Coordinate{
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static Coordinate doOneStep(Coordinate coo, Directions direction){
        Coordinate newCoordinate = coo;
        int curX = coo.getX();
        int cutY = coo.getY();
        switch (direction){
            case UP -> newCoordinate.setY(cutY+1);
            case DOWN -> newCoordinate.setY(cutY-1);
            case LEFT -> newCoordinate.setX(curX-1);
            case RIGHT -> newCoordinate.setX(curX+1);
        }
        return newCoordinate;
    }

    public static void doManySteps(Coordinate location, ArrayList<Directions> directionsList){
        Coordinate tmpC = location;
        for (int i = 0; i < directionsList.size(); i++){
            Coordinate c = doOneStep(tmpC, directionsList.get(i));
            System.out.println("[" + c.getX() + ";" + c.getY() + "]");
            tmpC = c;
        }
    }
    public static void traveler(){
        Coordinate startPosition = new Coordinate(1,1);
        ArrayList<Directions> directions = new ArrayList<>();
        directions.add(Directions.UP);
        directions.add(Directions.UP);
        directions.add(Directions.LEFT);
        directions.add(Directions.DOWN);
        directions.add(Directions.LEFT);
        directions.add(Directions.DOWN);
        directions.add(Directions.DOWN);
        directions.add(Directions.RIGHT);
        directions.add(Directions.RIGHT);
        directions.add(Directions.DOWN);
        directions.add(Directions.RIGHT);
        doManySteps(startPosition, directions);
    }

    public static void start() {
        System.out.println("Задание с лямбдой");
        //PracticeTask.lambdaTask();
        System.out.println("Задание на отслеживание координат");
        PracticeTask.traveler();
    }
}
