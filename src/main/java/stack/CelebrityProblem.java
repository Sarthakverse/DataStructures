package stack;
import java.util.Stack;
public class CelebrityProblem {
    // Function to find if there is a celebrity in the party or not.
        int celebrity(int arr[][], int n) {
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                st.push(i);
            }

            while (st.size() >= 2) {
                int i = st.pop();
                int j = st.pop();
                if (arr[i][j] == 1) {
                    st.push(j);
                } else {
                    st.push(i);
                }
            }

            int pot = st.pop();
            for (int i = 0; i < arr.length; i++) {
                if (i != pot) {
                    if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                        return -1;
                    }
                }
            }
            return pot;
        }

        public static void main(String[] args) {
            // Example usage:
            int[][] partyMatrix = {
                    {0, 0, 1, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 0},
                    {0, 0, 1, 0}
            };
            int n = partyMatrix.length;
            CelebrityProblem celebrityProblem = new CelebrityProblem();
            int celebrityIndex = celebrityProblem.celebrity(partyMatrix, n);
            if (celebrityIndex != -1) {
                System.out.println("Celebrity found at index: " + celebrityIndex);
            } else {
                System.out.println("No celebrity found in the party.");
            }
        }
    }


