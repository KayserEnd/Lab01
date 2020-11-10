import java.lang.Math;
public class Carrito_compra {
    public static void main(String[] args) {
        int[]compra=new int[generador()];
        compra=carrito(compra);
        int[]precios=precio(compra);
        mostrarCarrito(compra);
        detalle(compra,precios);


    }
    public static int[] precio(int [] carrito){
        int [] precio=new int[carrito.length];
        for(int i=0;i<carrito.length;i++){
            precio[i]=500+150*i;
        }
        return precio;
    }
    public static int[] carrito(int []n){
        for (int i=0;i<n.length;i++){
            n[i] = ((int) (Math.random() * 16)) ;
        }
        return n;
    }
    public static int generador(){
        int n=(int) ((Math.random() * 20) + 1);
        return n;
    }
    public static void mostrarCarritoDetalle(int [] compra){
        for(int i=0;i< compra.length;i++){
            System.out.println("el carrito tiene "+compra[i]+" del producto "+i);
        }
    }
    public static void mostrarCarrito(int [] compra){
        int a=0;
        for (int i=0;i<compra.length;i++){
            a+=compra[i];
        }
        System.out.println("el carrito tiene "+a+" productos en total");
    }
    public static int precioTotal(int[]compra,int[]precio){
        int total=0;
        for (int i=0;i< compra.length;i++) {
            total += precio[i] * compra[i];
        }
        return total;
    }
    public static void detalle(int[]compra,int[]precio){
        int Stotal=0;
        for(int i=0;i< compra.length;i++){
            Stotal=compra[i]*precio[i];
            System.out.println("Cantidad producto["+i+"]: "+compra[i]+", Subtotal:$"+Stotal);
        }
        int total=precioTotal(compra,precio);
        System.out.println("Total de compra: $"+total);
    }
}
