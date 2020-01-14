package storiestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import stories.Stories;

class StoriesTest {

	private Stories historinhas;
	
	@BeforeAll
	static void oi() {
		System.out.println("Iniciando teste!!!");
	}
	
	@BeforeEach
	void setup() {
		historinhas = new Stories();
	}
	
	@Test
	@DisplayName("Teste de ordenação de códigos!!")
	void testaOrdenacao() {
		assertArrayEquals(new int[]{22, 45, 61, 89}, historinhas.ordenacao(new int[]{89, 45, 61, 22}));
		assertArrayEquals(new int[]{22}, historinhas.ordenacao(new int[]{22}));
		assertArrayEquals(new int[]{}, historinhas.ordenacao(new int[]{}));
	}
	
	@Test
	@DisplayName("Teste do retorno do primeiro nome!!")
	void testaPrimeiroNome() {
		assertEquals("Luciano", historinhas.primeiroNome("Luciano Augusto Campagnoli da Silva"));
		assertEquals("Ronaldo",historinhas.primeiroNome("Ronaldo"));
		assertEquals("Insira um nome!!", historinhas.primeiroNome(""));
	}
	
	@Test
	@DisplayName("Teste da calculadora")
	void testaCalculadora() {
		assertEquals("3", historinhas.calculadora(2, "+", 1));
		assertEquals("5", historinhas.calculadora(7, "-", 2));
		assertEquals("72", historinhas.calculadora(9, "*", 8));
		assertEquals("4", historinhas.calculadora(32, "/", 8));
		assertEquals("2.5", historinhas.calculadora(5, "/", 2));
		assertEquals("Erro, não se pode dividir por 0!!", historinhas.calculadora(32, "/", 0));
		assertEquals("Operação inválida. Tente novamente!", historinhas.calculadora(32, "(", 2));
	}
	
	@AfterEach
	void sucesso() {
		System.out.println("Teste realizado com sucesso!!");
	}
	
	@AfterAll
	static void tchau() {
		System.out.println("Teste terminou!!");
	}
	
	

}
