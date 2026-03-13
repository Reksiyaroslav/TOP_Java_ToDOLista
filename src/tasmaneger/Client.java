package tasmaneger;

import java.util.ArrayList;

public class Client extends  Person implements Finalsen{
    public Client(String lname, String fname, Integer age, Integer id, Integer money) {
        super(lname, fname, age, id,money);
    }
    public String toString() {
        return "Client {" +
                "lname=" +getLname()+
                ",fname= " +getFname()+
                ",money=" + getMoney()+
                ",clientTask=" + '\n'+getTaskGlavs()+
                "}";
    }
    @Override
    public void addTask(TaskGlav taskGlav) {
        super.addTask(taskGlav);
    }
    public  void givesTask_The_Master(Master master , Integer id){
        master.addTask(this.getTaskGlavs().get(id-1));
    }


    @Override
    public Integer add_money(Integer amount) {
        return  0;
    }

    @Override
    public boolean cheage_money(Integer amount) {
        return false;
    }

    @Override
    public Integer remove_money(Integer amount)  throws MyExepts{
        if(amount<=0) {
            throw new MyExepts("Сумма должна быть больше");
        }
        if(this.getMoney()<amount){
            throw new MyExepts("Цена котороу просить пользователь не может быть болешь его money");
        }
        this.setMoney(this.getMoney()-amount);
        return  amount;

    }





}
