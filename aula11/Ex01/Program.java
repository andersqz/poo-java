
public class Program {
    public static void main(String[] args) {
        
        try {

            Voo v = new Voo("45451", "Porto Alegre");
            v.reservarAssento(55);
            v.reservarAssento(55);

            System.out.println(v);
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (AssentoOcupadoException e) {
            System.out.println(e.getMessage());
        }

    }
}