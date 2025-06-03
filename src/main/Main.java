package main;
import java.util.List;


public class Main {

	public static int[] maxColLengths(List<String[]> rows) {
        if (rows == null || rows.isEmpty()) {
            return new int[0];
        }

        // Determine the number of columns (assume uniform length or use the longest row)
        int maxCols = 0;
        for (String[] row : rows) {
            if (row != null) {
                maxCols = Math.max(maxCols, row.length);
            }
        }

        int[] maxLengths = new int[maxCols];

        // Loop over each row and update max lengths
        for (String[] row : rows) {
            if (row == null) continue;
            for (int i = 0; i < row.length; i++) {
                if (row[i] != null) {
                    maxLengths[i] = Math.max(maxLengths[i], row[i].length());
                }
            }
        }

        return maxLengths;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String[]> rows = List.of(
	        new String[]{"abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"},
	        new String[]{"ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"},
	        new String[]{"fdswddddd", "ab", "dddd", "ddd3dffff3"}
	    );
	
	    int[] result = maxColLengths(rows);
	    for (int len : result) {
	        System.out.print(len + " ");
	    }
	}

}
