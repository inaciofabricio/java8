import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new comparadorPorTamanho();
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);
		
		System.out.println(palavras);
		
		System.out.println();
		
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				if(s1.length() < s2.length()) {
					return -1;
				} 
				
				if(s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}
		});
		System.out.println(palavras);
		
		System.out.println();
		
		palavras.sort((String s1, String s2) -> {
				
				if(s1.length() < s2.length()) {
					return -1;
				} 
				
				if(s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}
		);
		System.out.println(palavras);
		
		System.out.println();
				
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
//		Collections.sort(palavras);
		System.out.println(palavras);
		
		System.out.println();
		
		for (String p : palavras) {
			System.out.println(p);
		}
		
		System.out.println();
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		palavras.forEach(consumidor);
		
		System.out.println();
		
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		System.out.println();
		
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		
		System.out.println();
		
		palavras.forEach(s -> System.out.println(s) );

	}

}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//	
//}

//class comparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		
//		if(s1.length() < s2.length()) {
//			return -1;
//		} 
//		
//		if(s1.length() < s2.length()) {
//			return 1;
//		}
//		return 0;
//	}
//	
//}
