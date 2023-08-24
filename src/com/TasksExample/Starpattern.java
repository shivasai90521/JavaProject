package com.TasksExample;
   // public class DiamondPattern1{

      //  public static void main(String[] args) {

        /*    int i, j,k = 6;
            for (i = 1 ; i <= k; i++ )
            {
                for (j = 1 ; j <= k - i; j++ )
                {
                    System.out.print(" ");
                }
                for (j = 1 ; j <= i * 2 - 1; j++ )
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (i = k - 1 ; i > 0; i-- )
            {
                for (j = 1 ; j <= k- i; j++ )
                {
                    System.out.print(" ");
                }
                for (j = 1 ; j <= i * 2 - 1; j++ )
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }*/
            public class Starpattern {

                public void m1(){
                    int n=5;
                    int i;
                    int j;
                    for(i=1;i<n;i++){
                        for(j=i;j<=n;j++){
                            System.out.print("  ");
                        }
                        for(j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                        for (j=1;j<i;j++){
                            System.out.print("* ");
                        }
                        for (j=i;j<=n;j++){
                            System.out.print("  ");
                        }
                        System.out.println();
                    }

                    for( i=1;i<=n;i++){
                        for(j=1;j<=i;j++){
                            System.out.print("  ");
                        }
                        for(j=i;j<=n;j++){
                            System.out.print("* ");
                        }
                        for(j=i;j<n;j++){
                            System.out.print("* ");
                        }
                        for(j=1;j<=i;j++){
                            System.out.print("  ");
                        }
                        System.out.println();
                    }
                }
                public static void main(String[]args){
                    Starpattern ee=new Starpattern();
                    ee.m1();
                }
            }