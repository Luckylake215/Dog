package Dog;

public class Breed extends Dog {
    private int height;

    public Breed(String nm, String gen, int cm) {
        super(nm, gen);
        this.height=cm;
    }
    @Override
    public void size() {
        if(height == 30){
            System.out.println("Yorkshire Terrier, Papillon, Chihuahua, Pekingese, Russian Toy");
        }else if(height == 60){
            System.out.println("St. Bernard, Moscow Watchdog, Caucasian Shepherd Dog, Alabai, Great Dane, English Mastiff");
        }
    }
    public static void main(String args[]){

        Dog small = new Breed("Snowball","Male", 30);
        Dog large = new Breed("Lucy","Female", 60);

        // вызываем переопределенные методы
        small.size();
        large.size();

    }

}
