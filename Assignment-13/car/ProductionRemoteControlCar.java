class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    private int distance = 0;
    private int numberOfVictories = 0;
    public void drive() {
        distance+=10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar c){
        return Integer.compare(c.numberOfVictories,this.numberOfVictories);
    }
}
