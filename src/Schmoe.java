public class Schmoe extends Player {

    //Schmoe always chooses ROCK
    Roshambo roshambo;

    public Schmoe(String name){
        super(name);
    }



    @Override
    public Roshambo generateRoshambo() {
        return roshambo.ROCK.toString();
    }
}
