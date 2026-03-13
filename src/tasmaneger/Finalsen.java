package tasmaneger;

public interface Finalsen   extends  AddMoney ,SpendMoney{
      public Integer add_money(Integer amount)throws MyExepts;;
      boolean cheage_money(Integer amount);
      public Integer remove_money(Integer amount) throws MyExepts;
}
