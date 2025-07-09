package com.Array;

public class population {
    public static void main(String[] args) {
        int[][] logs ={
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        System.out.println(maximumPopulation(logs));
    }

        public static int maximumPopulation(int[][] logs) {
            int[] year = new int[101];
            for(int[] log: logs){
                year[log[0]-1950]++;
                year[log[1]-1950]--;
            }
            int maxPop =0;
            int maxYear = 1950;
            int currentPop = 0;

            for(int i =0;i<101;i++){
                currentPop += year[i];
                if(currentPop > maxPop){
                    maxPop = currentPop;
                    maxYear = 1950 + i;
                }
            }
            return maxYear;
        }
    }

