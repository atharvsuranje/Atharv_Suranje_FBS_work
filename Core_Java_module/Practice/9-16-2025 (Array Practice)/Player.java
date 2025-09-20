import java.util.Scanner;

class Player{
    String name;
    int matches,runs,wickets;

    void setName(String name) {
        this.name = name;
    }
    
    void setMatches(int matches) {
        this.matches = matches;
    }
    
    void setRuns(int runs) {
        this.runs = runs;
    }
    
    void setWickets(int wickets) {
        this.wickets = wickets;
    }
    
    String getName() {
        return this.name;
    }
    
    int getMatches() {
        return this.matches;
    }
    
    int getRuns() {
        return this.runs;
    }
    
    int getWickets() {
        return this.wickets;
    }

    Player(String n, int m, int r, int w) {
        this.name=n;
        this.matches=m;
        this.runs=r;
        this.wickets=w;
    }

    Player(String n) {
        this.name=n;
    }
    
    void display(){
        System.out.println("Player Name : "+this.name);
        System.out.println("Matches Played : "+this.matches);
        System.out.println("Runs Scored: "+this.runs);
        System.out.println("Wickets Taken : "+this.wickets);
    }
}

class TestPlayer {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total Number of Players : ");
        n=sc.nextInt();
        sc.nextLine();
        Player[] players=new Player[n];
        System.out.println("Entering Player Details");
        for(int i=0;i<n;i++){
            String name;
            int matches,runs,wickets;
            System.out.print("Enter Player "+(i+1)+" Name : ");
            name=sc.nextLine();
            System.out.print("Enter Player "+(i+1)+" matches : ");
            matches=sc.nextInt();
            System.out.print("Enter Player "+(i+1)+" Runs : ");
            runs=sc.nextInt();
            System.out.print("Enter Player "+(i+1)+" Wickets : ");
            wickets=sc.nextInt();
            sc.nextLine();
            players[i]=new Player(name,matches,runs,wickets);
            System.out.println();
        }
        System.out.println("\n\nDisplaying all player details\n");
        for(int i=0;i<n;i++){
            System.out.println("Player "+(i+1)+" Details");
            players[i].display();
        }
        int maxRuns=players[0].getRuns(),maxRunsIndex=0,maxWickets=players[0].getWickets(),maxWicketsIndex=0;
        for(int i=0;i<n;i++){
            if(players[i].getRuns()>maxRuns){
                maxRuns=players[i].getRuns();
                maxRunsIndex=i;
            }
            if(players[i].getWickets()>maxWickets){
                maxWickets=players[i].getWickets();
                maxWicketsIndex=i;
            }
        }
        System.out.println("\n\nPlayer with Maximum Runs\n");
        players[maxRunsIndex].display();
        System.out.println("\n\nPlayer with Maximum Wickets\n");
        players[maxWicketsIndex].display();
    }    
}

