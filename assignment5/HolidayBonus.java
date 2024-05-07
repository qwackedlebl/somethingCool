
public class HolidayBonus {

    // fields

    final static double HIGH = 5000;
    final static double LOW = 1000;
    final static double OTHER = 2000;

    // constructor

    public HolidayBonus() {

    }

    // methods

    public static double[] calculateHolidayBonus(double[][] data) {

	double[][] raggedBonusArray = new double[data.length][];

	// fill everything with OTHER

	for (int i = 0; i < data.length; i++) {

	    raggedBonusArray[i] = new double[data[i].length];

	    for (int j = 0; j < data[i].length; j++) {

		if (data[i][j] > 0.0) {
		    raggedBonusArray[i][j] = OTHER;

		}

	    }

	}


	int longestRow = 0;

	for (int i = 0; i < data.length; i++) {
	    if (data[i].length > longestRow) {
		longestRow = data[i].length;
	    }
	}

	// cycle cols
	for (int col = 0; col < longestRow; col++) {

	    int indexOfLowestValInCol = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

	    raggedBonusArray[indexOfLowestValInCol][col] = LOW;

	}

	// cycle cols
	for (int col = 0; col < longestRow; col++) {

	    int indexOfHighestValInCol = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);

	    raggedBonusArray[indexOfHighestValInCol][col] = HIGH;

	}

	// negative costs become 0

	for (int i = 0; i < data.length; i++) {

	    for (int j = 0; j < data[i].length; j++) {

		if (data[i][j] < 0) {
		    raggedBonusArray[i][j] = 0;
		}

	    }

	}

//	/// debug print
//
//	for (int i = 0; i < raggedBonusArray.length; i++) {
//
//	    for (int j = 0; j < raggedBonusArray[i].length; j++) {
//
//		System.out.println("INDEX: [" + i + "],[" + j + "] = " + raggedBonusArray[i][j]);
//
//	    }
//
//	    System.out.println();
//
//	}

	// adding them up

	double bonusArray[] = new double[data.length];

	for (int i = 0; i < data.length; i++) {
	    bonusArray[i] = TwoDimRaggedArrayUtility.getRowTotal(raggedBonusArray, i);
	}

	return bonusArray;

    }

    public static double calculateTotalHolidayBonus(double[][] data) {

	double[] tempArray;
	tempArray = calculateHolidayBonus(data);

	double temp = 0.0;

	for (int i = 0; i < data.length; i++) {
	    temp += tempArray[i];
	}

	return temp;
    }

}
