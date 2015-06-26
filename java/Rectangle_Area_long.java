class Solution{
  public int solution(int K, int L, int M, int N, int P, int Q, int R, int S){
    long overlap = 0;
    if(M <= P || K >= R || L >= S || N <= Q) overlap = 0;
    else{
      int x = Math.min(M, R) - Math.max(K, P);
      int y = Math.min(N, S) - Math.max(L, Q);
      overlap = x * y;
    }
    return (int)(((long)(M - K)) * ((long)(N - L)) + ((long)(R - P)) * ((long)(S - Q)) - overlap)
  }
}