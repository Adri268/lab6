import java.util.HashMap;
public class Ex3 {
    public static void main(String[] args) {
        HashMap<String, String> note = new HashMap<String, String>();
        note.put("1" , "8");
        note.put("2" , "10");
        System.out.println(note.get("2"));
    }

}
