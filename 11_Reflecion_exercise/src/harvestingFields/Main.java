package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String command = scan.nextLine();
		Class<RichSoilLand> clazz = RichSoilLand.class;

		Field[] allFields = clazz.getDeclaredFields();


		while (!command.equals("HARVEST")){

			filedFilter(command, allFields);

			command = scan.nextLine();
		}
	}

	public static void filedFilter (String command, Field[] fields){
		if (!command.equals("all")){
			Field[] filteredFields = Arrays.stream(fields)
					.filter(f -> Modifier.toString(f.getModifiers()).equals(command))
					.toArray(Field[]::new);
			fieldsPrinter(filteredFields);
		} else {
			fieldsPrinter(fields);
		}
	}

	private static void fieldsPrinter(Field[] filteredFields) {
		Arrays.stream(filteredFields).forEach(f -> {
			System.out.printf("%s %s %s%n"
					, Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName());
		});
	}
}
