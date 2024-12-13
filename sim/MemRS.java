package sim;

public class MemRS {
    boolean busy;
    Register register; // for register as an address
    int address; // for memory address

    //  for store RS only
    String v;
    String q;
    
    int timer;

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isBusy() {
        return busy;
    }

    // constructor for load RS with register as address
    public MemRS(boolean busy, Register register, int timer) {
        this.busy = busy;
        this.register = register;
        this.timer=timer;
    }

    // constructor for load RS with memory address
    public MemRS(boolean busy, int address, int timer) {
        this.busy = busy;
        this.address = address;
        this.timer=timer;
    }

    // constructor for Store RS with register as address
    public MemRS(boolean busy, Register register, String v, String q, int timer) {
        this.busy = busy;
        this.register = register;
        this.v = v;
        this.q = q;
        this.timer=timer;
    }

    // constructor for Store RS with memory address
    public MemRS(boolean busy, int address, String v, String q, int timer) {
        this.busy = busy;
        this.address = address;
        this.v = v;
        this.q = q;
        this.timer=timer;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    public Register getRegister() {
        return register;
    }
    public void setRegister(Register register) {
        this.register = register;
    }
    public int getAddress() {
        return address;
    }
    public void setAddress(int address) {
        this.address = address;
    }
    public String getV() {
        return v;
    }
    public void setV(String v) {
        this.v = v;
    }
    public String getQ() {
        return q;
    }
    public void setQ(String q) {
        this.q = q;
    }

    
}
