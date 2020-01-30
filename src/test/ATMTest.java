package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ATM;

class ATMTest {
	

	@Test
	public void shouldHaveDeffaultBalanceOf100() {
		//arrange
		ATM underTest = new ATM(100,"");
		//act
		double balance = underTest.getBalance();
		assertEquals(100,balance);
	}
	@Test
	public void shouldHaveBalanceOf200AfterWithdraw() {
		//arrange
		ATM underTest = new ATM(300,"");
		//act
		underTest.withdraw(100);
		double balance = underTest.getBalance();
		assertEquals(200,balance);
	}
	@Test
	public void balanceShouldNotGoNegative() {
		//arrange
		ATM underTest = new ATM(200, "");
		//act
		underTest.withdraw(400);
		double balance = underTest.getBalance();
		assertEquals(0,balance);
	}
	@Test
	public void shouldHaveBalanceOf100AfterDeposit() {
		//arrange
		ATM underTest = new ATM(0,"");
		//ac
		underTest.deposit(100);
		double balance = underTest.getBalance();
		assertEquals(100,balance);
	}
	@Test
	public void shouldAllowAccess() {
		ATM underTest = new ATM(0,"1234");
		boolean access = underTest.AllowAccess("1234");
		assertTrue(access);
		
	}
	
	@Test
	public void shouldDenyAccess() {
		ATM underTest = new ATM(0,"1234");
		boolean access = underTest.AllowAccess("1235");
		assertFalse(access);
		
	}
	
	

	
	
	
	

}
