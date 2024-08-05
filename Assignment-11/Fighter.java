class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
     boolean isVulnerable() {
        return false;
    }
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()) return 10;
        return 6;
    }
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean f = false;
    void prepareSpell(){
        f=true;
    }
    boolean isVulnerable() {
        return f==false;
    }
    int getDamagePoints(Fighter fighter) {
        if(f) return 12;
        return 3;
    }
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}