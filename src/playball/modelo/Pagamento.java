
package playball.modelo;

/**
 *
 * @author Heitor Sales
 */
public class Pagamento {
    
    /**
     * Metodos para os metodos de pagamento
     */
    
    public static void boleto(){
        System.out.println("Pagamento no Boleto");
    }
    public static void dinheiro(){
        System.out.println("Pagamento no Dinheiro");
    }
    public static void cartao(){
        System.out.println("Pagamento no Cartão");
    }
    
    
    
    public static void PagamentoBoleto(String[]args){
        Pagamento eu = new Pagamento();
         eu.boleto();
         
}
    public static void PagamentoDinheiro(String[]args){
        Pagamento eu = new Pagamento();
        
         eu.dinheiro();
         
}
    public static void PagamentoCartao(String[]args){
        Pagamento eu = new Pagamento();
         
         eu.cartao();
    }
}