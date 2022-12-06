//Printer Errors
//https://www.codewars.com/kata/56541980fa08ab47a0000040/solutions/java?filter=all&sort=best_practice&invalids=false
public class Main {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        int err = 0;
        for (char x : s.toCharArray()) {
            if (x > 'm') err++;

        }
        System.out.println(err + "/" + s.length());
        System.out.println(s.replaceAll("[a-m]","").length()+"/"+s.length());
        System.out.println(s.chars().filter(i->i>'m').count()+"/"+s.length());
    }

}