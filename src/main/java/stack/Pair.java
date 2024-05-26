package stack;

public class Pair implements Comparable<Pair>
{
    int st;
    int et;

    public Pair(int st, int et) {
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Pair o) {
        if(this.st != o.st)
        {
            return this.st - o.st;
        }
        else
        {
            return this.et-o.et;
        }
    }
}
