public class JSUT {

    class Inner {
        void g() {
            System.out.println("here gThis");
            JSUT.this.h();
        }
    }

    public void f() {
        System.out.println("here f");
    }

    public void g() {
        System.out.println("here gThis");
        new Inner().g();
    }

    private void h() {
        System.out.println("here h");
    }
}
