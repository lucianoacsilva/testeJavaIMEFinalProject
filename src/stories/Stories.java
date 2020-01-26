package stories;

import java.util.Arrays;

public class Stories {

	public int[] ordenacao(int[] is) {
		Arrays.sort(is);
		return is;
	}

	public String primeiroNome(String string) {
		if (string == "") {
			return "Insira um nome!!";
		}
		
		String[] splitString = string.split(" ");
		return splitString[0];
	}

	public String calculadora(int i, String string, int j) {
		
		int result;
		
		if (string == "+") {
			result = i + j;
			return Integer.toString(result);
		}
		
		else if (string == "-") {
			result = i - j;
			return Integer.toString(result);
		}
		
		else if (string == "*") {
			result = i * j;
			return Integer.toString(result);
		}
		
		else if (string == "/") {
			if (j == 0) {
				return "Erro, não se pode dividir por 0!!";
			}
			
			else if (i % j != 0) {
				//System.out.println((float) i/(float) j);
				return Float.toString((float) i/(float) j);
			}
			
			else {
				result = i / j;
				return Integer.toString(result);
			}
		}
		
		return "Operação inválida. Tente novamente!";
		
	}

}
