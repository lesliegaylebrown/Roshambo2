public class JoeBlow extends Player {

    // JoeBlow randomly selects rock, paper or scissors ( 1 in 3 chance of selecting each
    public JoeBlow(String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }



    @Override
    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
         int i = (int) Math.floor(Math.random() * (3 -1)) +1; //max is exclusive; min inclusive
        if (i == 1.00 ) {
            r1 = Roshambo.ROCK;
        }
        if ( i == 2.00){
            r1 = Roshambo.PAPER;
        }

        if (i == 2.00){
            r1 = Roshambo.SCISSORS;
        }
        return r1.toString();


    }
}
