package tasmaneger;

import java.util.Objects;

public class Master extends Person implements Finalsen  {
    private String type_master ="";
    public  Master(String lname,String fname,Integer age,Integer id,Integer money,String type_master){
        super(lname,fname,age,id,money);
        this.type_master = type_master;
    }

    @Override
    public void addTask(TaskGlav taskGlav) {
        super.addTask(taskGlav);
    }

    @Override
    public String toString() {
        return "Master{" +
                super.toString()+
                "type_master='" + type_master + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Master master)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(type_master, master.type_master);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type_master);
    }

    @Override
    public Integer add_money(Integer amount) {
        return 0;
    }

    @Override
    public boolean cheage_money(Integer amount) {
        return this.getMoney() != this.getMoney() - amount;
    }

    @Override
    public Integer remove_money(Integer amount) {
        if(this.getMoney()>=amount) {
            this.setMoney(this.getMoney() - amount);
            return amount;
        }
        return  0;
    }


}
