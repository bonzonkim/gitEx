package ch18;

import java.io.Serializable;
//객체 직렬화
//메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때 사용
//MVC패턴에서 쓰이는 용어
//DTO : Data Transfer Object(데이터 전달 객체, 결과물을 저장)
//VO : Value Object, DTO개념이지만 생성자없이getter,setter로만 구성
//DAO : Data Access Object(데이터 조작객체, DB와 연결하여 데이터 구하는 비즈니스 로직단)
public class MemberDTO implements Serializable {
    private String userId;
    private String name;
    private String psswd;
    private int age;
    private String email;

    public MemberDTO(){

    }

    public MemberDTO(String userId, String name, String psswd, int age, String email) {
        this.userId = userId;
        this.name = name;
        this.psswd = psswd;
        this.age = age;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
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

    @Override
    public String toString() {
        return "MemberDTO{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", psswd='" + psswd + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
