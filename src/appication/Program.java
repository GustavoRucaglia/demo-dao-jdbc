package appication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: Seller findByID ===");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDeparment ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller findByDeparment ===");
		
		 list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller findByDeparment ===");
		Seller newSeller = new Seller(null, "greg", "greg@gmial.com", new Date(), 400.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("\n=== TEST 5: Seller findByDeparment ===");
		 seller = sellerDao.findById(1);
		 seller.setName("Marta");
		 sellerDao.update(seller);
		 System.out.println("\n=== TEST 6: Seller findByDeparment ===");
		 System.out.println("digite um id");
		 int id = sc.nextInt();
		 sellerDao.deleById(id);
		 
		 System.out.println("\n=== TEST 6: Seller findByDeparment ===");
		 
		 DepartmentDao departmentDao =DaoFactory.createDepartmentDao();
		 Department department1 = new Department(2,"RH");
		 departmentDao.insert(department1);
		 sc.close();
	}

}
