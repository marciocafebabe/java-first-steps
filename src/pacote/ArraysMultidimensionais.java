package pacote;
public class ArraysMultidimensionais {

	public static void main(String[] args) {
				
		String[][] duas = {{"Luigi", "M", "Houston"}, {"Lari", "F", "Sao Paulo"}};
		duas[1][0] = "Larissa";
		
		System.out.println(duas[0][0]);
		System.out.println(duas[1][0]);
		System.out.println(duas[0].length);
				
	}

}
