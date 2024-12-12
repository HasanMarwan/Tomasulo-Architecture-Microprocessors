public class Instruction {
    String label;
    String opcode;
    // load , float instructions
    String destination ;
    String op1;
    String op2;
    // integer instruction
    int imm;
    //store , load address
    int address;
    //float instruction constructor
    public Instruction(String label,String opcode,String destination, String op1, String op2) {
        this.destination = destination;
        this.label = label;
        this.op1 = op1;
        this.op2 = op2;
        this.opcode = opcode;
    }
    //integer instruction
    public Instruction(String label,String opcode,String destination, String op1, int imm) {
        this.destination = destination;
        this.label = label;
        this.op1 = op1;
        this.imm = imm;
        this.opcode = opcode;
    }
    //load and store instruction with address
    public Instruction(String label, String opcode,String destination,int address) {
        this.address = address;
        this.destination = destination;
        this.label = label;
        this.opcode = opcode;
    }
    //load and store instruction with String
    public Instruction(String label, String opcode,String destination,String op1) {
        this.op1 = op1;
        this.destination = destination;
        this.label = label;
        this.opcode = opcode;
    }


    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getOpcode() {
        return opcode;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getOp1() {
        return op1;
    }
    public void setOp1(String op1) {
        this.op1 = op1;
    }
    public String getOp2() {
        return op2;
    }
    public void setOp2(String op2) {
        this.op2 = op2;
    }
    public int getImm() {
        return imm;
    }
    public void setImm(int imm) {
        this.imm = imm;
    }
    public int getAddress() {
        return address;
    }
    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "label='" + label + '\'' +
                ", opcode='" + opcode + '\'' +
                ", destination=" + destination +
                ", op1=" + op1 +
                ", op2=" + op2 +
                ", imm=" + imm +
                ", address=" + address +
                '}';
    }

}
