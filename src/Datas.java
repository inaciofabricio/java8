import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println();
		
		LocalDate olimpiada = LocalDate.of(2022, 6, 5);
		Period periodo = Period.between(hoje, olimpiada);
		System.out.println("anos " + periodo.getYears() + " meses " + periodo.getMonths() + " dias " + periodo.getDays());
		
		System.out.println();
		
		LocalDate proximas = olimpiada.plusYears(4);
		System.out.println(proximas);
		
		System.out.println();
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximas.format(formatador));
		
		System.out.println();
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatador2));
		
		System.out.println();
		
		LocalTime intervalo = LocalTime.of(15,30);
		System.out.println(intervalo);
		
	}

}
