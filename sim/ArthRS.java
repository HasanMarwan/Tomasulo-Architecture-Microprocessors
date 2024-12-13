package sim;

public class ArthRS {
    boolean busy;
    String opCode;
    String vj;
    String vk;
    String qj;
    String qk;
    int timer;

    public ArthRS(boolean busy, String opCode, String vj, String vk, String qj, String qk, int timer) {
        this.busy = busy;
        this.opCode = opCode;
        this.qj = qj;
        this.qk = qk;
        this.timer = timer;
        this.vj = vj;
        this.vk = vk;
    }

    public int getTimer() {
        return timer;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }
    public boolean isBusy() {
        return busy;
    }
    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    public String getOpCode() {
        return opCode;
    }
    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }
    public String getVj() {
        return vj;
    }
    public void setVj(String vj) {
        this.vj = vj;
    }
    public String getVk() {
        return vk;
    }
    public void setVk(String vk) {
        this.vk = vk;
    }
    public String getQj() {
        return qj;
    }
    public void setQj(String qj) {
        this.qj = qj;
    }
    public String getQk() {
        return qk;
    }
    public void setQk(String qk) {
        this.qk = qk;
    }

}
