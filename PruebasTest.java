package temperaturas;

import static org.junit.Assert.assertTrue;
import java.sql.SQLException;
import org.junit.Test;

public class PruebasTest {
	
	
	
	@Test 
	public void ProbarcelsiusTofahrenheit() throws SQLException {
			System.out.println("Verificar conversion");
			MetodosTemp cn= new MetodosTemp();
			assertTrue(cn.celsiusTofahrenheit(50)==122);
	
	}
	@Test
	public void ProbarcelsiusTokelvin() throws SQLException{
		System.out.println("Verificar conversion");
		MetodosTemp cn= new MetodosTemp();
		assertTrue(cn.celsiusTokelvin(100)==373.15);
	}
	
	@Test
	public void ProbarfahrenheitTocelsius() throws SQLException{
		System.out.println("Verificar conversion");
		MetodosTemp cn= new MetodosTemp();
		assertTrue(cn.fahrenheitTocelsius(80)==26.6667);
	}
	
	@Test
	public void probarfahrenheitTokelvin() throws SQLException{
		System.out.println("Verificar conversion");
		MetodosTemp cn= new MetodosTemp();
		assertTrue(cn.fahrenheitTokelvin(150)==338.706);
	}
	
	@Test 
	public void probarkelvinTocelsius() throws SQLException{
		System.out.println("Verificar conversion");
		MetodosTemp cn= new MetodosTemp();
		assertTrue(cn.kelvinTocelsius(600)== 326.85);
	
	}
	@Test
	public void probarkelvinTofahrenheit() throws SQLException{
		System.out.println("Verificar conversion");
		MetodosTemp cn= new MetodosTemp();
		assertTrue(cn.kelvinTofahrenheit(300)== 80.33);
	}
}


