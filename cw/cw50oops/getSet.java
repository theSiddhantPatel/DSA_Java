package cw50oops;

public class getSet {
    private String name;

    public void getname() {
        // return name;
        System.out.println(name);
    }

    public void setName(String name1) {
        this.name = name1;
    }
}

class nameAccess {
    public static void main(String[] args) {
        getSet name = new getSet();
        name.setName("Siddhant");
        name.getname();
        // System.out.println(name.getname());
    }
}
