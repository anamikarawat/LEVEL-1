import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];

    for (int i = 0; i < arr.length; i++) {   //n
      for (int j = 0; j < arr[0].length; j++) { //m
        arr[i][j] = scn.nextInt();
      }
    }

    int minrow = 0;
    int mincol = 0;
    int maxrow = arr.length - 1;   //n-1
    int maxcol = arr[0].length - 1;     //m-1


    int tne = n * m;     //total numbers of elements
    int count = 0;

    while (count < tne) {

      //left wall
      if (count < tne) {//extra number print na ho eslea
        for (int i = minrow; i <= maxrow; i++) {
          System.out.println(arr[i][mincol]);
          //row increase from minrow to maxrow but column doesn't vary
          count++;
        }
      }
      mincol++;//corner ka ek extra number print na ho eslea mincol ek step agea


      //bottom wall
      if (count < tne) {//extra number print na ho eslea
        for (int j = mincol; j <= maxcol; j++) {
          //column increase from mincol to maxcol but row doesn't vary
          System.out.println(arr[maxrow][j]);
          count++;
        }
      }
      maxrow--;//corner ka ek extra number print na ho eslea maxrow ek step pichea


      //right wall
      if (count < tne) {//extra number print na ho eslea
        for (int i = maxrow; i >= minrow; i--) {
          //row decrease from maxrow to minrow but column doesn't vary
          System.out.println(arr[i][maxcol]);
          count++;
        }
      }
      maxcol--;//corner ka ek extra number print na ho eslea maxcol ek step pichea


      //top wall
      if (count < tne) { //extra number print na ho eslea
        for (int j = maxcol; j >= mincol; j--) {
          //column decrease from maxcol to mincol but row doesn't vary
          System.out.println(arr[minrow][j]);
          count++;
        }
      }
      minrow++;//corner ka ek extra number print na ho eslea minrow ek step agea
    }
  }
}
