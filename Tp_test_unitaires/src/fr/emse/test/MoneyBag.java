package fr.emse.test;
import java.util.Vector;
import static org.junit.Assert.assertEquals;
public class MoneyBag implements IMoney{
	Vector<Money> fMonies = new Vector<Money>();
	MoneyBag(Money m1, Money m2) {
		appendMoney(m1);
		appendMoney(m2);
	}
	MoneyBag(Money bag[]) {
		for (int i = 0; i < bag.length; i++)
		appendMoney(bag[i]);
	}
	private void appendMoney(Money m) {
		if (fMonies.isEmpty()) {
			fMonies.add(m);
		} else {
			int i = 0;
			while ((i < fMonies.size()) && (!(fMonies.get(i).currency().equals(m.currency()))))
			i++;
			if (i >= fMonies.size()) {
				fMonies.add(m);
			} else {
				fMonies.set(i, new Money(fMonies.get(i).amount() + m.amount(),m.currency()));
			}
		}	
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoneyBag other = (MoneyBag) obj;
        return fMonies.equals(other.fMonies);
    }
	public IMoney add1(IMoney m) {
		return m.addMoneyBag1(this);
		}
	@Override
	public IMoney addMoney1(Money money) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoneyBag1(MoneyBag moneyBag) {
		// TODO Auto-generated method stub
		return null;
	}
	public IMoney add(IMoney m) {
        return m.addMoney1(this);
    }

    public IMoney addMoney(Money m) {
        if (currency().equals(m.currency())) {
            return new Money(amount() + m.amount(), currency());
        } else {
            // Handle different currencies
            return null; // For simplicity, returning null
        }
    }

    public IMoney addMoneyBag(MoneyBag mb) {
        return mb.addMoney1(this);
    }
	@Override
	public IMoney addMoneyBag(IMoney m) {
		// TODO Auto-generated method stub
		return null;
	}
}


}
