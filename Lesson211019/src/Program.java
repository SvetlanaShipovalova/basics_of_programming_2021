public class Program {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(0, 0, 0);
        Vector3D b = new Vector3D(1, 0, 0);
        Vector3D c = new Vector3D(0, 1, 0);

        Triangle t = new Triangle(a, b, c);

        System.out.println(t.perimeter());
//        Vector3D v1 = new Vector3D();
//        Vector3D v2 = new Vector3D(1, 2, 3);
//
//        v1.print();
//        v2.print();
//
//        v1.setX(10);
//
//        v1.print();
//        v2.print();

//        Vector3D.maxValue = 200;
//        Vector3D.changeMaxValue(200);
    }
}
