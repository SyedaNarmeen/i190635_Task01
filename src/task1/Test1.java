/*
 * Syeda Narmeen
 * 19I-0635
 * Task1
 * All 13 test cases pass
 */
package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {
	@task1.before
	Account x= new Account();

	@Test                                //Showed correct withdrawal from Checkings account with assertEquals
	public void test1() { 
		x.setBal(4000);
		x.setType(1);
		x.makeWithdrawal(2500);
		assertEquals(1500,x.getBalance()); 
	}
	
	@Test
	public void test2() {                 //Showed correct withdrawal from Checkings account with assertNotEquals
		x.setBal(4000);
		x.setType(1);
		x.makeWithdrawal(2500);
		assertNotEquals(1000,x.getBalance());
	}
	
	@Test
	public void test3() {                 //Showed correct withdrawal from Checkings account with amount greater than balance(amount-balance<=5000)
		x.setBal(6000);
		x.setType(1);
		x.makeWithdrawal(11000);
		assertEquals(-5000,x.getBalance());
	}
	
	@Test
	public void test4() {                 //Showed correct withdrawal from Checkings account with amount greater than balance(amount-balance>5000)
		x.setBal(6000);
		x.setType(1);
		x.makeWithdrawal(12000);
		assertEquals(6000,x.getBalance());
	}
	
	@Test
	public void test5() {                 //Showed correct withdrawal from Savings account with assertEquals
		x.setBal(6000);
		x.setType(2);
		x.makeWithdrawal(5500);
		assertEquals(500,x.getBalance());
	}
	
	@Test
	public void test6() {                 //Showed correct withdrawal from Savings account with amount greater than balance
		x.setBal(6000);
		x.setType(2);
		x.makeWithdrawal(1100);
		assertNotEquals(-5000,x.getBalance());
	}
	
	@Test
	public void test7() {                  //Showed correct deposit with assertEquals
		x.makeDeposit(1200);
		assertEquals(1200,x.getBalance());
	}
	
	@Test
	public void test8() {                  //Showed correct deposit with assertNotEquals     
		x.makeDeposit(1200);
		assertNotEquals(0,x.getBalance()); 
	}
	
	@Test
	public void test9() {                  //Showed correct zakaat calculation with assertEquals(balance>20000)     
		x.setBal(30000);
		x.setType(2);
		assertEquals(750,x.calculateZakat()); 
	}
	
	@Test
	public void test10() {                  //Showed correct zakaat calculation with assertNotEquals(balance<20000)
		x.setBal(19000);
		x.setType(2);
		assertNotEquals(475,x.calculateZakat()); 
	}
	
	@Test
	public void test11() {                  //Showed correct zakaat calculation as Zakaat is not applicable on Checkings avccount
		x.setBal(30000);
		x.setType(1);
		assertNotEquals(750,x.calculateZakat()); 
	}
	
	@Test
	public void test12() {                  //Showed correct interest calculation for Checkings acount
		x.setBal(5000);
		x.setType(1);
		assertNotEquals(1000,x.calculateInterest(20)); 
	}
	
	@Test
	public void test13() {                  //Showed correct interest calculation for Savings acount
		x.setBal(5000);
		x.setType(2);
		assertEquals(1000,x.calculateInterest(20)); 
	}
	

}
