package demo01;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object show(){
        System.out.println("name"+name);
        return null;
    }
}

