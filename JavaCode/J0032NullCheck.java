class Test {
    public void meth(Object obj) {
        System.out.println("Goes with Object");
    }

    //public void meth(String str) {
      //  System.out.println("Goes with String");
    //}

}    public class J0032NullCheck {
        public static void main(String[] args) {
            Test test = new Test();
            test.meth(null);
        }
    }
