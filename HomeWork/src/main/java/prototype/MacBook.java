package prototype;

public class MacBook implements Cloneable {

    private String processor;
    private String memory;
    private String cost;

    public MacBook(String processor, String memory, String cost){
        this.processor = processor;
        this.memory = memory;
        this.cost = cost;
    }

    public MacBook clone() throws CloneNotSupportedException{
        return (MacBook)super.clone();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
