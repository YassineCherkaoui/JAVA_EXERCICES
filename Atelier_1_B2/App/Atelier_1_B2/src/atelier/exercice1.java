//package atelier;
//
//public class exercice1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package atelier;

public class exercice1 {

		int x;
		int y;
		public exercice1(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public static double distance(exercice1 A, exercice1 B) {
			return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
		}

		public static void main(String[] args) {

			exercice1 p1 = new exercice1(1, 4);
			exercice1 p2 = new exercice1(1, 2);
			double distance = distance(p1, p2);
			System.out.println("La distance entre les deux point est: " + distance);

		}

	}
