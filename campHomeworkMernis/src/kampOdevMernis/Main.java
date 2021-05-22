package kampOdevMernis;

import java.util.Date;

import com.Abstracts.*;
import com.Adapters.MernisServiceAdapter;
import com.Entities.*;
import com.Concrete.*;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Muhammet Faruk", "Maden", (new Date(2000, 5, 26)), "47737496614");
		baseCustomerManager.save(customer);
		baseCustomerManager2.save(customer);

	}

}
