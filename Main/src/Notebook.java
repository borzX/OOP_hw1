import  java.util.Comparator;

public class Notebook {
    private Integer id;
    private String brand;
    private Integer ramVal;
    private  Integer hddVal;
    private String opSys;

    public Notebook(Integer id, String brand, Integer ramVal, Integer hddVal, String opSys) {
        this.id = id;
        this.brand = brand;
        this.ramVal = ramVal;
        this.hddVal = hddVal;
        this.opSys = opSys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRamVal() {
        return ramVal;
    }

    public void setRamVal(Integer ramVal) {
        this.ramVal = ramVal;
    }

    public Integer getHddVal() {
        return hddVal;
    }

    public void setHddVal(Integer hddVal) {
        this.hddVal = hddVal;
    }

    public String getOpSys() {
        return opSys;
    }

    public void setOpSys(String opSys) {
        this.opSys = opSys;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ramVal=" + ramVal +
                ", hddVal=" + hddVal +
                ", opSys='" + opSys + '\'' +
                '}';
    }


}
