public class Vector3D {
//    public static double maxValue = 100;

    // поля
    private double x;
    private double y;
    private double z;

    // конструкторы
    public Vector3D() {
        x = y = z = 0;
    }
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // методы
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

//    public void changeMaxValue(double newValue) {
//        maxValue = newValue;
//    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public void print() {
        System.out.printf("(%f, %f, %f)\n", x, y, z);
    }

//    public static void changeMaxValue(double newValue) {
//        maxValue = newValue;
//    }
}
