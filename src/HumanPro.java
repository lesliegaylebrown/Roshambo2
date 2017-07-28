public class HumanPro extends Player {

   public HumanPro(String name){
       super(name);

   }

   Roshambo r1;



    @Override
    public Roshambo generateRoshambo() {
        if (s.equalsIgnoreCase("ROCK")){
            r1 = Roshambo.ROCK;
        }
        if (s.equalsIgnoreCase("PAPER")){
            r1 = Roshambo.PAPER;

        }
        if (s.equalsIgnoreCase("SCISSORS")) {
            r1 = Roshambo.SCISSORS;
        }
        return r1;
    }
}
