package com.bbva.emilio.kata1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubjectKata1Test
{
	SubjectKata1  subjectKata1 = new  SubjectKata1();
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{}


	@Before
	public void setUp() throws Exception
	{}


	@Test
	public void testSuma() throws Exception
	{
		final int val1 = 1;
		final int val2 = 2;
		
		final int result = subjectKata1.suma(val1, val2);
		
		assertEquals(result, 3);
	}

}
