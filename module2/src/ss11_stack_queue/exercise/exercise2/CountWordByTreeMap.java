package ss11_stack_queue.exercise.exercise2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordByTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi: ");
        String str = scanner.nextLine();
        String[] word = str.toLowerCase().split(" ");
        Map<String,Integer> map = new TreeMap<>();
        for (String i : word){
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        System.out.println(map);
    }
}
