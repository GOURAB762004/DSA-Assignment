import java.util.*;

public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

int n = s.length();
String t = s + s;

Set<Character> set = new HashSet<>();

int i = 0;
int sum = 0;
int max = 0;

for(int j = 0; j < 2*n; j++) {

    char c = t.charAt(j);

    while( set.contains(c) || (j - i + 1) > n ) {

        char left = t.charAt(i);
        set.remove(left);
        sum -= (left - 'a' + 1);
        i++;
    }

    set.add(c);
    sum += (c - 'a' + 1);

    if(sum > max) {
        max = sum;
    }
}

System.out.println(max);

}
}
