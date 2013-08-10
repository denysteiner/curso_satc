package TesteInterface;

public class TesteInterface {
    public static void main(String[] args) {
        AreaCalculavel retangulo = new Retangulo(2,3);
        AreaCalculavel quadrado = new Quadrado(2);
        AreaCalculavel circulo = new Circulo(2);
        System.out.println("Area retangulo:"+retangulo.calculaArea());
        System.out.println("Area quadrado:"+quadrado.calculaArea());
        System.out.println("Area circulo:"+circulo.calculaArea());
        
    }
}
