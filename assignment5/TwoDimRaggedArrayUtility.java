import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {
    private static final int MAX_ROW = 10;
    private static final int MAX_COL = 10;

    // constructor

    public TwoDimRaggedArrayUtility() {

    }

    // methods

    public static double[][] readFile(File file) throws FileNotFoundException {

	String[][] tempArr = new String[MAX_ROW][MAX_COL];
	int numRows = 0;

	String line;
	String[] splitLine;

	Scanner scan = new Scanner(file);

	while (scan.hasNextLine()) {

	    line = scan.nextLine();
	    splitLine = line.split(" ");

	    for (int col = 0; col < splitLine.length; col++) {

		tempArr[numRows][col] = splitLine[col];

	    }
	    numRows++;
	}

	double[][] array = new double[numRows][];

	for (int row = 0; row < numRows; row++) {
	    int cols = 0;
	    for (int col = 0; col < MAX_COL; col++) {
		if (tempArr[row][col] != null) {
		    cols++;
		} else {
		    break;
		}
	    }
	    array[row] = new double[cols];
	    for (int col = 0; col < cols; col++) {
		array[row][col] = Double.parseDouble(tempArr[row][col]);
	    }
	}

	return array;

    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

	int vertical = data.length;

	PrintWriter print = new PrintWriter(outputFile);

	for (int i = 0; i < vertical; i++) {

	    for (int j = 0; j < data[i].length; j++) {
		print.print(data[i][j]);
	    }

	    print.println();

	}

	print.close();

    }

    public static double getTotal(double[][] data) {

	// System.out.println("\nGETTOTAL");

	double sum = 0.0;

	for (int i = 0; i < data.length; i++) {

	    for (int j = 0; j < data[i].length; j++) {

		sum += data[i][j];
		// System.out.println("GETTOTAL SUM of [" + i + "],[" + j + "] = " + sum);
	    }
	}

	return sum;
    }

    public static double getAverage(double[][] data) {

	double average = 0;

	for (int i = 0; i < data.length; i++) {

	    average += data[i].length;

	}

	return (getTotal(data) / average);

    }

    public static double getRowTotal(double[][] data, int row) {

	// System.out.println("\nROWTOTAL");

	double sum = 0.0;

	for (int i = 0; i < data[row].length; i++) {

	    sum += data[row][i];

	    // System.out.println("ROTOTAL: SUM of [" + row + "],[" + i + "] = " + sum);

	}

	return sum;

    }

    public static double getColumnTotal(double[][] data, int col) {

	double sum = 0.0;

	for (int i = 0; i < data.length; i++) {
	    if (col < data[i].length) {
		sum += data[i][col];
	    }
	}

	return sum;

    }

    public static double getHighestInRow(double[][] data, int row) {

	double num = data[row][0];

	for (int i = 0; i < data[row].length; i++) {

	    if (num < data[row][i]) {
		num = data[row][i];
	    }
	}

	return num;

    }

    public static int getHighestInRowIndex(double[][] data, int row) {

	double num = data[row][0];
	int index = 0;

	for (int i = 0; i < data[row].length; i++) {

	    if (num < data[row][i]) {
		num = data[row][i];
		index = i;
	    }
	}

	return index;

    }

    public static double getLowestInRow(double[][] data, int row) {

	double num = data[row][0];

	for (int i = 0; i < data[row].length; i++) {

	    if (num > data[row][i]) {
		num = data[row][i];
	    }
	}

	return num;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {

	double num = data[row][0];
	int index = 0;

	for (int i = 0; i < data[row].length; i++) {

	    if (num > data[row][i]) {
		num = data[row][i];
		index = i;
	    }
	}

	return index;
    }

    public static double getHighestInColumn(double[][] data, int col) {

	double num = 0.0;

	for (int i = 0; i < data.length; i++) {

	    if (col < data[i].length) {

		if (num < data[i][col]) {

		    num = data[i][col];

		}
	    }

	}

	return num;

    }

    public static int getHighestInColumnIndex(double[][] data, int col) {

	double num = 0.0;
	int index = 0;

	for (int i = 0; i < data.length; i++) {

	    if (col < data[i].length) {

		if (num < data[i][col]) {
		    num = data[i][col];
		    index = i;
		}

	    }

	}

	return index;

    }

    public static double getLowestInColumn(double[][] data, int col) {

	double num = Double.MAX_VALUE;

	for (int i = 0; i < data.length; i++) {

	    if (col < data[i].length) {

		if (num > data[i][col]) {
		    num = data[i][col];
		}
	    }

	}

	return num;

    }

    public static int getLowestInColumnIndex(double[][] data, int col) {

	double num = Double.MAX_VALUE;
	int index = 0;

	for (int i = 0; i < data.length; i++) {

	    if (col < data[i].length) {
		if (num > data[i][col]) {
		    num = data[i][col];
		    index = i;
		}
	    }

	}

	return index;

    }

    public static double getHighestInArray(double[][] data) {

	double num = data[0][0];

	for (int i = 0; i < data.length; i++) {

	    for (int j = 0; j < data[i].length; j++) {

		if (num < data[i][j]) {
		    num = data[i][j];
		}

	    }

	}

	return num;

    }

    public static double getLowestInArray(double[][] data) {

	double num = data[0][0];

	for (int i = 0; i < data.length; i++) {

	    for (int j = 0; j < data[i].length; j++) {

		if (num > data[i][j]) {
		    num = data[i][j];
		}

	    }

	}

	return num;

    }

}
