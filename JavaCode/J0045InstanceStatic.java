public class J0045InstanceStatic{
    static int staticVar = 10;
    int instVAr = 20;

    void meth1(){
        System.out.println(instVAr);
    }
    public static void main(String[] args) {
        J0045InstanceStatic j0045InstanceStatic = new J0045InstanceStatic();
        j0045InstanceStatic.meth1();
    }
}