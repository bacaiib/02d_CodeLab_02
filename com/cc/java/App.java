package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Henning", "Klaus", "Chef", 2004);
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Putin","Vladimir","Untertane",2005);
		Mitarbeiter mitarbeiter3 = new Mitarbeiter("Neumann","Thomas","Innhaber",2004);

		Mitarbeiter[] mitarbeiters = { mitarbeiter1, mitarbeiter2, mitarbeiter3 };

		for (Mitarbeiter mitarbeiter : mitarbeiters) {
				outputInfo(mitarbeiter);
		}
	}

		public static void outputInfo(Mitarbeiter mitarbeiter){
			output(mitarbeiter.getInfo("#familyName"));
			output(mitarbeiter.getInfo("#firstName"));
			output(mitarbeiter.getInfo("#role"));
			output(mitarbeiter.getYaerOfEntry());
		}
	
		private static void output(String outStr) {
			System.out.println(outStr);
		}
	
}



		// output(mitarbeiter1.getInfo("#familyName"));
		// output(mitarbeiter1.getInfo("#firstName"));
		// output(mitarbeiter1.getInfo("#role"));
		// output(mitarbeiter1.getYaerOfEntry());

		// output(mitarbeiter2.getInfo("#familyName"));
		// output(mitarbeiter2.getInfo("#firstName"));
		// output(mitarbeiter2.getInfo("#role"));
		// output(mitarbeiter2.getYaerOfEntry());

		// output(mitarbeiter3.getInfo("#familyName"));
		// output(mitarbeiter3.getInfo("#firstName"));
		// output(mitarbeiter3.getInfo("#role"));
		// output(mitarbeiter3.getYaerOfEntry());



	


