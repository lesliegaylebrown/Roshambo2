public abstract class Player {

    private String name;

    public Player() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {

        this.name = name;
    }

    //an abstract method

    public abstract Roshambo generateRoshambo();
}
