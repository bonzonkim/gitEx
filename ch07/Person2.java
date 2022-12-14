package ch07;

public class Person2 {
    private String name;
    private int age;
    private String email;
    private String adrs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdrs() {
        return adrs;
    }

    public void setAdrs(String adrs) {
        this.adrs = adrs;
    }
    public void print(){
        System.out.println("이름 :"+name+"\n"+"나이 :"+age+"\n"+"이메일 :"+email+"\n"+"주소 :"+adrs);
    }
}
