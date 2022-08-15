import java.util.Scanner;

public class getSmallestInefficiencies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many developers are (n):");
        int n = sc.nextInt();
        int[] skill = new int[n];
        System.out.print("Enter the skills value for " + n + " developers : ");

        for (int i = 0; i < n; i++) {
            skill[i] = sc.nextInt();
        }
        System.out.print("How many inefficient skills pair you want (k) :");
        int k = sc.nextInt();

        int[] pair = getSmallestInefficiencies(skill, k);
        System.out.println(k + " inefficient skills pair : ");
        for (int i = 0; i < k; i++) {
            System.out.println(pair[i]);
        }

        System.out.println();
    }

    public static int[] getSmallestInefficiencies(int[] skill, int k) {
        int ln = (skill.length * (skill.length - 1)) / 2;
        int[] res = new int[k];
        int[] temp = new int[ln];
        int t = 0;
        for (int i = 0; i < skill.length; i++) {
            for (int j = i + 1; j < skill.length; j++) {
                temp[t] = Math.abs(skill[i] - skill[j]);
                t++;
            }
        }

        for (int i = 1; i < temp.length; i++) {
            for (int j = 0; j < temp.length - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int h = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = h;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = temp[i];
        }

        return res;
    }

}