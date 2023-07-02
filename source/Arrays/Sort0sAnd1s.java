public class Sort0sAnd1s {
    /*
    ~In place sorting O(N) time and O(1) space complexities~
    Repeat until left < right 
        a) Keep incrementing left index while there are 0s at it 
        b) Keep decrementing index right while there are 1s at it 
        c) Whenever left < right, exchange arr[left] and arr[right] 
    */
    public ArrayList<Integer> sort(ArrayList<Integer> A) {
        int left = 0, right = A.size()-1;
        while(left < right) {
            while(A.get(left) == 0 && left < right) {
                left++;
            } 
            while(A.get(right) == 1 && left < right) {
                right--;
            } 
            if(left < right) {
                A.set(left, 0);
                A.set(right, 1);
                left++;
                right--;
            } 
        }
        return A;
    }   
}