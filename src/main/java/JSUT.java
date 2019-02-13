public class JSUT {

    class Inner {
        void g() {
            System.out.println("here Inner.g");
            JSUT.this.h();
        }
    }

    public void f() {
        System.out.println("here f");
        h();
    }

    public void g() {
        System.out.println("here g");
        new Inner().g();
    }

    public void h() {
        System.out.println("here h");
    }
}
