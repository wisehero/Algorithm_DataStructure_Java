package programmers;

import java.util.Arrays;

public class lottos {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {};
            int max = 7;
            int min = 1;
            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    max--;
                    if (lottos[5] == 0 && min == 6) {
                        break;
                    }
                    min++;
                    continue;
                }
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        max--;
                        break;
                    }
                    if (j == 5) {
                        if (min == 6) {
                            max--;
                            break;
                        }
                        min++;
                    }
                }
            }
            answer = new int[2];
            answer[0] = max;
            answer[1] = min;
            return answer;
        }
    }
}



