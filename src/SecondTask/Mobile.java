package SecondTask;

/* Решение задания I из ClassesBlock */
public class Mobile {
    int length;
    int width;

    public Mobile(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int sumParams() {
        return this.length + this.width;
    }
}
