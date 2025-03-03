class calculator{
    public int sum(int a,int b){
        return a+b;
    }
}
public class classAndObject{
    public static void main(String []argv){
        calculator object=new calculator();
        int a=5;
        int b=4;
        int sum=object.sum(a,b);
        System.out.println(sum);
    }
}