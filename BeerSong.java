public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {

			System.out.println(beerNum + " " + word + " beer on the wall, " + beerNum + " " + word + " of beer.");
			System.out.print("Take one down, pass it around, ");
			beerNum = beerNum - 1;

			if (beerNum == 1) {
				word = "bottle";
			}

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("no more bottles of beer on the wall! :(");
			}

		}
	}
}