package kz.aitu.dz;

public class wolf {
    private String name;
    private String color;
    private Integer weight;
    private Boolean friendly;

    public wolf(String name,String color,Integer weight, boolean friendly) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.friendly = friendly;
    }
    public void isFriendly(){
        if(friendly){
            System.out.println("this wolf is friendly");
        }
        else{
            System.out.println("this wolf is not friendly");
        }
    }
    public String getName() {
        System.out.println("Getter for "+name+" was called");
        return name;

    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
}
