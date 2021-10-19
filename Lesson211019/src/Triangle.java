public class Triangle {
    // поля
    private Vector3D a;
    private Vector3D b;
    private Vector3D c;

    public Triangle(Vector3D a, Vector3D b, Vector3D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        Vector3D ab = new Vector3D( a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
        Vector3D bc = new Vector3D( b.getX() - c.getX(), b.getY() - c.getY(), b.getZ() - c.getZ());
        Vector3D ac = new Vector3D( a.getX() - c.getX(), a.getY() - c.getY(), a.getZ() - c.getZ());

        return ab.length() + ac.length() + bc.length();
    }
}
