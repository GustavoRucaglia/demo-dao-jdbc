package appication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"books");
		System.out.println(obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
