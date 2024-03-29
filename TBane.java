import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class TBane{
    HashMap<String, ArrayList<String[]>> graph; //en stasjonsID med liste av tupler til andre stasjoner og tunnelen de deler mellom seg  
    HashMap<String, Station> stations; //stasjonID gir riktig stasjonsobjekt 
    HashMap<String, Tunnel> tunnels; //tunnelID gir riktig tunnelobjekt 

    public TBane(){
        graph = new HashMap<>();
        stations = new HashMap<>();
        tunnels = new HashMap<>();
    }

    public void addStation(String station){ // i grafen
        graph.put(station, new ArrayList<>());
    }

    public void addTunnel(String from, String to, String tunnel){ //i grafen 
        String[] val = new String[2];
        val[0] = to;
        val[1] = tunnel;

        graph.get(from).add(val);
    }

    public HashMap<String, ArrayList<String []>> getGraph(){
        return graph;
    }

    public HashMap<String, Station> getStations(){ //bruker under innlesning 
        return stations;
    }

    public HashMap<String, Tunnel> getTunnels(){ //bruker under innlesning 
        return tunnels;
    }


    public static void main(String[] args){
        TBane tbane = new TBane();

        try{
            Scanner filReader = new Scanner(new File("moviesTwo.tsv"));
            while(filReader.hasNextLine()){
                String line = filReader.nextLine();
            }

        }catch(FileNotFoundException e){
            System.out.println("fant ikke fil");
        }
    }
}

class Station{
    String stjID;
    String stasjonNavn;
    ArrayList<String> tnIDer = new ArrayList<String>();

}

class Tunnel{
    String tnID;
    String tunnelNavn;
    int reisetid;
}