public class Calculos {

    public static void calculo(double a,double b, int c){
         switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Essa operacao nao podera ser realizada!");
                } else {
                    System.out.println(a / b);
                    break;
                }
            case 5:
                break;
            default:
                System.out.println("selecione uma das opcoes para realizar as operacoes");
                break;
        }
    }
}
