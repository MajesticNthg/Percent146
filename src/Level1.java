public class Level1 {
    public static String MassVote(int N, int [] Votes) {
      int max = 0;
      int amt = 0;
      int sum = 0;
      int winner = 0;

      for (int i = 0; i < N; i++) {
          sum += Votes[i];
          if (Votes[i] > max) {
              max = Votes[i];
              amt = 0;
              winner = i + 1;
          }
          else if (Votes[i] == max) {
              amt++;
          }
      }

      if (amt > 0) return "no winner";
      else if (max > sum * 0.5) return "majority winner " + winner;
      else return "minority winner " + winner;

    }
    public static void main(String[] args) {
        int N = 4;
        int [] Votes = {100, 100, 100, 101};
        System.out.println(MassVote(N, Votes));
        }
    }
