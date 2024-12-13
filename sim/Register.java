package sim;

public class Register {
    String name;
    float value;
    String Qi;
    
    public Register(){

    }

    public Register(String name,float value,String Qi) {
        this.Qi = Qi;
        this.name = name;
        this.value = value;
    }

    public Register(String name) {
        this.Qi = "0";
        this.name = name;
        this.value = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public String getQi() {
        return Qi;
    }
    public void setQi(String qi) {
        Qi = qi;
    }
    
}
