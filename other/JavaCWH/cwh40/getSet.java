package cwh40;

class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class getSet {
    public static void main(String[] args) {
        MyEmployee patel = new MyEmployee();

        // patel.id = 45;
        // patel.name = "Siddhant";
        patel.setName("SIddhant");
        System.out.println(patel.getName());
        System.out.println(1);


    }

}
