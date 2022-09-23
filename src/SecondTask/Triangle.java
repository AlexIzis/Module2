package SecondTask;

/* Решение задания III из ClassesBlock */
public class Triangle {
    int sideA;
    int sideB;
    int sideC;
    int[] pointA;
    int[] pointB;
    int[] pointC;

    public Triangle(int sideA, int sideB, int sideC, int[] pointA, int[] pointB, int[] pointC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int[] getPointA() {
        return pointA;
    }

    public int[] getPointB() {
        return pointB;
    }

    public int[] getPointC() {
        return pointC;
    }

    public void countTheArea() {
        int p = (this.sideA + this.sideB + this.sideC) / 2;
        double S = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        System.out.println("Площадь треугольника: " + S);
    }

    public void countThePerimeter() {
        int P = this.sideA + this.sideB + this.sideC;
        System.out.println("Периметр треугольника " + P);
    }

    public void findTheIntersection() {
        int x = (this.pointA[0] + this.pointB[0] + this.pointC[0]) / 3;
        int y = (this.pointA[1] + this.pointB[1] + this.pointC[1]) / 3;
        System.out.println("Точка пересечения медиан (" + x + ":" + y + ")");
    }
}
