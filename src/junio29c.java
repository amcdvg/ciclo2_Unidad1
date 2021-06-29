public class junio29c {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = calcularDigitos(numero);
        System.out.println(resultado);
    
    }

    public static int calcularDigitos(int numero){
        int cifras=0;
        while (numero!=0){
            numero /=10.0;
            cifras++;
        }
        return cifras;
    }
   
}
