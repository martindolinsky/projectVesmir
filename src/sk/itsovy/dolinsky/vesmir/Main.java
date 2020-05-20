package sk.itsovy.dolinsky.vesmir;

public class Main {

	public static void main(String[] args) {
		Slnko slnko = Slnko.getInstance();
		Planeta planeta = new Planeta("Merkur");
		slnko.addPlaneta(planeta);
		planeta = new Planeta("Venusa");
		planeta = new Planeta("Zem");
		slnko.addPlaneta(planeta);
		slnko.printPlanets();
	}
}
