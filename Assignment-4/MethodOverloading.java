/*
 * 4. https://exercism.org/tracks/java/exercises/wizards-and-warriors-2
 */
public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character c){
            return "You're a level "+c.getLevel() +" " +c.getCharacterClass()+" with "+c.getHitPoints()+" hit points.";
        }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination d){
            return "You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
        }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod t){
            if(t.equals(TravelMethod.WALKING)) return "You're traveling to your destination by walking.";
            return "You're traveling to your destination on horseback.";
        }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
     public String describe(Character c,Destination d,TravelMethod t){
          if(t.equals(TravelMethod.WALKING))  return "You're a level "+c.getLevel() +" " +c.getCharacterClass()+" with "+c.getHitPoints()+" hit points. "+"You're traveling to your destination by walking. "+"You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
         return "You're a level "+c.getLevel() +" " +c.getCharacterClass()+" with "+c.getHitPoints()+" hit points. "+"You're traveling to your destination on horseback. "+"You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
        }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character c,Destination d){
            return "You're a level "+c.getLevel() +" " +c.getCharacterClass()+" with "+c.getHitPoints()+" hit points. "+"You're traveling to your destination by walking. "+"You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
        }
}
