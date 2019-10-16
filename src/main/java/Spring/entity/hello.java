package Spring.entity;

public class hello {
    private String massage;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
    public void init(){
        System.out.println("hello init!");
    }
    public void  destroy(){
        System.out.println("hello destroy!");
    }

}
