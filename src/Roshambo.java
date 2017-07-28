public enum Roshambo {


    ROCK, PAPER,SCISSORS;

    //you can add a toString to an enum just like to a Class
    public String toString() {
        switch(this) {
            case ROCK:
                return "Rock!";
            case PAPER:
                return "Paper!";
            default:
                return "Scissors!";
        }
    }
}

