import java.util.ArrayList;

public class newProject {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Billy");
        names.add("Johns");
        names.add("Tims");
        names.add("Sally");
        removePlurals(names);
    }
    public static void removePlurals (ArrayList<String> nameList){
        for (int i = 0; i < nameList.size(); i++){
            String newString = nameList.get(i);
            if (newString.endsWith("s")){
                nameList.remove(i);
                i--;
            }
        }
        System.out.println(nameList);
    }
}