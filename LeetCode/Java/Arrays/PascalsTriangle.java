public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        if(numRows == 0){
            return triangle;
        }
        
        for(int row = 1; row <= numRows; row++){
            triangle.add(new ArrayList<Integer>(Collections.nCopies(row ,0)));
            triangle.get(row - 1).set(0, 1);
            triangle.get(row - 1).set(row - 1, 1);

            if(row > 1){
                for(int col = 1; col < triangle.get(row - 1).size() - 1; col ++){
                    int val = triangle.get(row - 2).get(col - 1) + triangle.get(row - 2).get(col);
                    triangle.get(row - 1).set(col, val);
                }
            }
        }
        return triangle;
    }
}