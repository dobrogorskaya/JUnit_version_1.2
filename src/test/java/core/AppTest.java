package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test_01_AssertEquals_Positive() {assertEquals("String not the same", "Testing JUnit 4", App.sw);}
	       
	@Test
	public void Test_02_AssertEquals_Negative() {assertEquals("String not the same.", "Testing TestNG 6", App.sw);}
	       
	@Ignore
	@Test
	public void Test_03_AssertEquals_Ignored() {assertEquals("String not the same.", "Testing JUnit 3", App.sw);}
	       
	@Test
	public void Test_04_AssertSame_Positive() {assertSame("Integer not the same.", 55,App.iw);}
	       
	@Test
	public void Test_05_AssertSame_Negative() {assertSame("Integer not the same.", 54,App.iw);}
	       
	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {assertSame("Integer not the same.", 56,App.iw);}
	       
	@Test
	public void Test_07_AssertFalse_Positive() {assertFalse("Boolean should be false", App.fw);}
	       
	@Test
	public void Test_08_AssertFalse_Negative() {assertFalse("Boolean should be false", App.tw);}
	       
	@Test
	public void Test_09_AssertTrue_Positive() {assertTrue("Boolean should be true", App.tw);}
	       
	@Test
	public void Test_10_AssertTrue_Negative() {assertTrue("Boolean should be true", App.fw);}
	}

