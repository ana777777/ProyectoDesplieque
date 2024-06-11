import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Perro perro0 = new Perro("Cuchu", 2, "Podle");
		Perro perro1 = new Perro("Tomasa", 1, "Husky");

		Gato gato0 = new Gato("Paco", 3, "Corto");
		Gato gato1 = new Gato("Ronaldinho", 5, "Mediano");

		Pajaro pajaro0 = new Pajaro("Tilin", 1, "Rojo");
		Pajaro pajaro1 = new Pajaro("Chavez", 4, "Morado");

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		ArrayList<Animal> animalesEnfermos = new ArrayList();

		animalesEnfermos.add(perro0);
		animalesEnfermos.add(gato0);
		animalesEnfermos.add(pajaro0);

		ArrayList<Animal> animalesSanos = new ArrayList();

		animalesSanos.add(perro1);
		animalesSanos.add(gato1);
		animalesSanos.add(pajaro1);

		int dia = 1;
		boolean exit = false;

		while (!exit) {
			System.out.println("Día" + dia);
			System.out.println("Lista de animales enfermos");

			for (int i = 0; i < animalesEnfermos.size(); i++) {
				System.out.println((i + 1) + " " + animalesEnfermos.get(i).getNombre());
			}
			System.out.println("Seleccione el animal que se encuentra sano");
			int opcion = sc1.nextInt() - 1;

			if (opcion != -2) {

				animalesSanos.add(animalesEnfermos.get(opcion));
				animalesEnfermos.remove(opcion);
			} else {
				boolean nt = true;
				while (nt) {
					System.out.println("Animales sanos");
					for (int i = 0; i < animalesSanos.size(); i++) {
						System.out.println((i + 1) + " " + animalesSanos.get(i).getNombre());

					}
					System.out.println("Seleccione el animal que se encuentra enfermo");
					opcion = sc1.nextInt() - 1;
					if (opcion != -2) {
						animalesEnfermos.add(animalesSanos.get(opcion));
						animalesSanos.remove(opcion);
					} else {
						dia++;
						nt = false;
					}
				}

			}
		}

	}

}
