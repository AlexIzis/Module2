package SecondTask;

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
            System.out.println(2 * this.length);
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
            System.out.println(this.diameter * 2 * (0.25 * Math.PI));
        }
    }

    public static void repeatTask(int times, Printable task) {
        for (int i = 0; i < times; i++) {
            task.print();
        }
    }

    public static void start() {
        Printable myClosure = () -> System.out.println("I love Java");
        PracticeTask.repeatTask(10, myClosure);
    }
}
