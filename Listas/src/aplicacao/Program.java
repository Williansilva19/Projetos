package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list= new ArrayList <>();
		
		//add lista
		list.add("maria");
		list.add("joao");
		list.add("marcos");
		list.add("ana");
		list.add("luis");
		list.add(2, "mario");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		// remove da lista
		System.out.println("----------------");
		list.removeIf(x -> x.charAt(0) == 'j');
		
		for (String x : list) {
			System.out.println(x);
		}
		// filtrar dados de uma lista e add em outra
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
		System.out.println("----------------");
		//print
		for (String y : result) {
			System.out.println(y);
		
		}
		System.out.println("----------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(nome);
	}

}
