package exercicios;

public class TesteIgualdade {
    public static void main(String[] args) {
        String x,y;
        x="JAVA";
        y="JAVA";
        if (x==y){
            System.out.println("x=y ||"+x+"="+y);
        }else{
            System.out.println("x<>y ||"+x+"<>"+y);
        }
        if (x.equals(y)){
            System.out.println("x.equals(y) ||"+x+"="+y);
        }else{
            System.out.println("not x.equals(y) ||"+x+"<>"+y);
        }
        
        String x1,y1,z1;
        x1 = new String("JAVA");
        y1 = new String("JAVA");
        if (x1==y1){
            System.out.println("x1=y1 ||"+x1+"="+y1);
        }else{
            System.out.println("x1<>y1 ||"+x1+"<>"+y1);
        }
        if (x1.equals(y1)){
            System.out.println("x1.equals(y1) ||"+x1+"="+y1);
        }else{
            System.out.println("not x1.equals(y1) ||"+x1+"<>"+y1);
        }
    }
}
