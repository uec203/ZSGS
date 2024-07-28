import java.util.ArrayList;

public class QN5 {
    
}
class Team{
    public String name;
    public String city;
    public String division;
    ArrayList<Player> playerList = new ArrayList<Player>();
    static private int playerCount;
    Team(String name,String city,String division){
        this.name = name;
        this.city = city;
        this.division = division;
        playerCount=0;
    }
    public void playGame(){
        System.out.println("Game is Played");
    }
    public void hireCoach(){
        System.out.println("Game is Played");
    }
    public int getPlayerCount(){
        return playerCount;
    }
}
class Player {
    public String name;
    public String position;
    public int jerseyNumber;
    Player(String name,String position,int jerseyNumber){
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }
    public void playGame(){
        System.out.println("Game is Played");
    }
    public void train(){
        System.out.println("training is Started");
        System.out.println("training is Over");
    }
}
