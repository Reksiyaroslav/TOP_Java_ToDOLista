package work_new_mohtw;

import java.util.Objects;

public class Product2 extends  Product{
    private Integer prise = 1;
    private String name = "Lemone";
    public Product2(String name, Integer prise ){
        super(name,prise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prise, name);
    }

    @Override
    public String toString() {
        return "Product2{" +
                "prise=" + prise +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(this.getClass()==obj.getClass())) return false;
        return this.name==((Product2)obj).name &&this.prise==((Product2)obj).prise;
    }
    public Integer getPrise() {
        return this.prise;
    }

    public String getName() {
        return this.name;
    }
}
