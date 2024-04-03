package fr.emse.test;
import static org.junit.Assert.assertEquals;
public class Money implements IMoney{
	int fAmount;
	String fCurrency;
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
		if (m.currency().equals(currency())) {
			return new Money(amount() + m.amount(), currency());
			return new MoneyBag(this,m);
		}
			
	}
	
	

    public IMoney add1(IMoney money) {
        return money.addMoney(this);
    }

    public IMoney addMoney1(Money money) {
        if (currency().equals(money.currency())) {
            return new Money(amount() + money.amount(), currency());
        } else {
            // Handle different currencies
            return null; // For simplicity, returning null
        }
    }

    public IMoney addMoneyBag1(MoneyBag moneybag) {
        return moneybag.addMoney(this);
    }

	public IMoney add(IMoney m) {
		return m.addMoney(this);
		}
	@Override
	public IMoney addMoney(Money money) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoneyBag(MoneyBag moneyBag) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoneyBag(IMoney m) {
		// TODO Auto-generated method stub
		return null;
	}
}
