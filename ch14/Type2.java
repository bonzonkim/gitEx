package ch14;

public class Type2 {
    private Object value;
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Type2 t = new Type2();
        t.setValue("100.5");
        System.out.println(t.getValue());
        //object로 하면 내부적으로 형변환등 처리가 많아져서 무거워짐

    }
}
