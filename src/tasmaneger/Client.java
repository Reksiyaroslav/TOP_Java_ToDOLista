package tasmaneger;

public class Client extends  Person implements SpendMoney,Finalsen{
    public Client(String lname, String fname, Integer age, Integer id, Integer money) {
        super(lname, fname, age, id,money);
    }
    public String toString() {
        return super.toString();
    }
    @Override
    public void addTask(TaskGlav taskGlav) {
        super.addTask(taskGlav);
    }
    public  void givesTask_The_Master(Master master,Integer id){
        Integer curen_id_object = id-1;
        master.addTask(this.getTaskGlavs().get(curen_id_object));
    }

    @Override
    public Integer remove_money(Integer amount) {
        if(this.getMoney()>=amount) {
            this.setMoney(this.getMoney() - amount);
            return amount;
        }
        return 0;
    }



    @Override
    public boolean cheage_money(Integer amount) {
        return this.getMoney()!= this.getMoney()-amount;
    }

}
