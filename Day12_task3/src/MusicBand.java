import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {
   private String name;
   private   int year;
   private List<Artist> members;


    public MusicBand(String name, int year, List<Artist> members){
        this.name=name;
        this.year=year;
        this.members=members;
    }
    public void printMember(){
        System.out.println("Соств группы "+name+":\n");
        for (Artist x: members)
        {System.out.println(x.toString());

        }
    }
//    public void addMembers(List<String> members){
//     this.members.addAll(members);
//    }
    public int getYear() {
        return year;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public static  void mergMembers(MusicBand band1, MusicBand band2){
        band1.members.addAll(band2.members);
        band2.members.clear();
    }
    @Override
    public String toString() {
        return  name+" "+ year+" г." ;
    }
}
