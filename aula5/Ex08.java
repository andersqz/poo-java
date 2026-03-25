public class Ex08 {
    public static void main(String[] args) {

        Termometro temp = new Termometro(0.0,  0.0);

        System.out.println(temp.getFarenheit(22.2));

        temp.setFarenheit(71.96);

        System.out.println(temp.getCelsius());



        
    }
}

class Termometro {
    private double celsius;
    private double farenheit;

    public Termometro(double celsius, double farenheit) {
        this.celsius = celsius;
        this.farenheit = farenheit;
    }

    public double getFarenheit(double celsius2) {
        this.farenheit = (celsius2 * 9 / 5) + 32;
        return this.farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.celsius = (this.farenheit - 32) * 5 / 9;
    }

    public double getCelsius() {
        return this.celsius;
    }

}
