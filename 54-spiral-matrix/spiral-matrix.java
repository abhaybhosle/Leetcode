class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //Top 
            for(int j = startCol;j<=endCol;j++){
                result.add(matrix[startRow][j]);
            }
            startRow++;

            //Right
            for(int i = startRow;i<= endRow;i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;

            //Bottom
            if(startRow <= endRow){
            for(int j = endCol;j>=startCol;j--){
                result.add(matrix[endRow][j]);
            }
            endRow--;
            }

            //Left
            if(startCol<=endCol){
                for(int i = endRow;i>=startRow;i--){
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return result;
    }
}