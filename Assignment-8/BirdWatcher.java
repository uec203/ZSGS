
class BirdWatcher {
    private final int[] birdsPerDay;
    private int today;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        today = birdsPerDay.length-1;
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        birdsPerDay[today]++;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay){
            if(i==0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays>7)numberOfDays=7;
        while(numberOfDays>0){
            numberOfDays--;
            sum+=birdsPerDay[numberOfDays];
        }
        return sum;
    }

    public int getBusyDays() {
        int count=0;
        for(int i : birdsPerDay){
            if(i>=5) count++;
        }
        return count;
    }
}
