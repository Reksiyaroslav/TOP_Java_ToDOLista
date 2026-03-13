package tasmaneger;
@FunctionalInterface
public interface SpendMoney   {
    public Integer remove_money(Integer amount) throws MyExepts;
}
