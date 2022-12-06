import java.util.*;

public class Main {
    public static void main(String[] args) {
//uj
        Artist Kip1=new Artist("Kipelov",43);
        Artist Kip2=new Artist("Gorshok",13);
        Artist Kip3=new Artist("Tsoy",23);
        Artist Kip4=new Artist("Dirty Harry",33);
        Artist Kip5=new Artist("Kirkorov",60);
        Artist Kip6=new Artist("DJ Smash",48);
        Artist Kip7=new Artist("Noze MC",45);

        List<Artist> membersList1=new ArrayList<>(Arrays.asList(Kip1,Kip5));
        List<Artist> membersList2=new ArrayList<>(Arrays.asList(Kip2,Kip6));
        List<Artist> membersList3=new ArrayList<>(Arrays.asList(Kip3,Kip7));
        List<Artist> membersList4=new ArrayList<>(Arrays.asList(Kip4));
        System.out.println(membersList1.toString());

        MusicBand mb1=new MusicBand("ariya",1995,membersList1);
        MusicBand mb2=new MusicBand("KiSH",1996, membersList2);
        MusicBand mb3=new MusicBand("KINO",1989,membersList3);
        MusicBand mb4=new MusicBand("Gorilaz",1994,membersList4);

        MusicBand.mergMembers(mb1,mb2);
       mb1.printMember();
        mb2.printMember();





    }




}