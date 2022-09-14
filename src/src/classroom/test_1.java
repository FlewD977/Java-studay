package src.classroom;

public class test_1 {
    public static void main(String[] args) {
//        自动类型转换
        int i1=10;
        short s1=2;
        int i2=i1+s1;

        float f1=12.5F;
        float f2=f1+i2;

        long l=12L;
        float f3=l;

        char c1 ='a';
        char c2 ='A';

        int i3=c1+1;
        int i4=c2+1;

        short ssl=12;
        byte bb1=1;

        char cc1='a';
        int ii1=ssl+bb1+cc1;



//      强制类型转换
        long l1=100L;
        String str1="abc";
        int i1_1=123;
        String str2=str1+i1_1;
        System.out.println(str2);











    }
}
