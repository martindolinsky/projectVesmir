package sk.itsovy.dolinsky.vesmir;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
public class Slnko {

	private static List<Planeta> list = new ArrayList<>();
	private static final Slnko instance = new Slnko();

	private Slnko() {
	}

	public static Slnko getInstance() {
		return instance;
	}

	public void addPlaneta(Planeta planeta) {
		list.add(planeta);
	}

	public void printPlanets() {
		for (Planeta planeta : list) {
			System.out.println(planeta.getName());
		}
	}
}
