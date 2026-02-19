package work_new_mohtw;

import java.util.Objects;

public class Product {
    private String name = "";
    private Integer prise = 100;
    Product(String name,Integer prise){
        this.name = name;
        this.prise= prise;
    }

    @Override
    public boolean equals(Object o) {
//        if(this == o) return  true;
//        if(this!=null) return  true;
//        if (this.getClass() == o.getClass()) return  true;
        if (!(this.getClass() == o.getClass())) return  false;
//        if (this.name == ((Product) o ).name) return  true
            return  this.getName()==((Product)o).getName() && this.getPrise() ==((Product) o).getPrise();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }

    public Integer getPrise() {
        return this.prise;
    }

    public String getName() {
        return this.name;
    }
}
