package collection.set.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
