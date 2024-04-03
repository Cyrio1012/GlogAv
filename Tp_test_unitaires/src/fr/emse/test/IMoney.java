package fr.emse.test;


public interface IMoney {
	public IMoney add(IMoney aMoney);
	
	public IMoney addMoney(Money money);
	public IMoney addMoneyBag(IMoney m);

	public static IMoney add1(IMoney m) {
        return m.addMoneyBag(m);
    }

    public static IMoney addMoney1(Money money) {
        IMoney fMonies = null;
		fMonies.add(money);
        return money;
    }

    public static IMoney addMoneyBag1(MoneyBag moneyBag) {
        for (Money m : moneyBag.fMonies) {
            appendMoney(m);
        }
        return moneyBag;
    }

	public static void appendMoney(Money m) {
		// TODO Auto-generated method stub
		
	}

	IMoney addMoneyBag(MoneyBag moneyBag);

}
