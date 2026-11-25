import java.util.*;

public class Main {

    static class Group {
        int skill;
        int count;

        Group(int skill, int count) {
            this.skill = skill;
            this.count = count;
        }
    }

    static List<Group> special = new ArrayList<>();
    static int[] dp;
    static int[] rivalMask;
    static boolean[] banned;
    static int limit;
    static int answer;

    static void solve(int index, int mask, int skill, int count) {

        if (skill > limit) {
            return;
        }

        if (index == special.size()) {
            answer = Math.max(answer, count + dp[limit - skill]);
            return;
        }

        solve(index + 1, mask, skill, count);

        if (!banned[index] && (rivalMask[index] & mask) == 0) {

            Group g = special.get(index);

            solve(index + 1,
                    mask | (1 << index),
                    skill + g.skill,
                    count + g.count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] skills = new int[n];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            map.put(names[i], i);
        }

        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        int friendCount = sc.nextInt();

        int[] friend = new int[n];
        Arrays.fill(friend, -1);

        for (int i = 0; i < friendCount; i++) {
            int a = map.get(sc.next());
            int b = map.get(sc.next());

            friend[a] = b;
            friend[b] = a;
        }

        List<Group> groups = new ArrayList<>();
        int[] groupId = new int[n];

        for (int i = 0; i < n; i++) {

            if (friend[i] == -1) {
                groupId[i] = groups.size();
                groups.add(new Group(skills[i], 1));
            } else if (i < friend[i]) {

                int j = friend[i];
                int id = groups.size();

                groupId[i] = id;
                groupId[j] = id;

                groups.add(new Group(skills[i] + skills[j], 2));
            }
        }

        int rivalCount = sc.nextInt();

        int[] rivalA = new int[rivalCount];
        int[] rivalB = new int[rivalCount];

        boolean[] involved = new boolean[groups.size()];
        boolean[] impossible = new boolean[groups.size()];

        for (int i = 0; i < rivalCount; i++) {

            int a = map.get(sc.next());
            int b = map.get(sc.next());

            rivalA[i] = groupId[a];
            rivalB[i] = groupId[b];

            involved[rivalA[i]] = true;
            involved[rivalB[i]] = true;

            if (rivalA[i] == rivalB[i]) {
                impossible[rivalA[i]] = true;
            }
        }

        limit = sc.nextInt();

        int[] id = new int[groups.size()];
        Arrays.fill(id, -1);

        int k = 0;

        for (int i = 0; i < groups.size(); i++)

            if (involved[i]) {
                id[i] = k++;
                special.add(groups.get(i));
            }

        rivalMask = new int[k];
        banned = new boolean[k];

        for (int i = 0; i < groups.size(); i++)

            if (involved[i] && impossible[i]) {
                banned[id[i]] = true;
            }

        for (int i = 0; i < rivalCount; i++) {

            int a = id[rivalA[i]];
            int b = id[rivalB[i]];

            if (a != b) {
                rivalMask[a] |= (1 << b);
                rivalMask[b] |= (1 << a);
            }
        }

        dp = new int[limit + 1];

        for (int i = 0; i < groups.size(); i++) {

            if (involved[i]) {
                continue;
            }

            Group g = groups.get(i);

            for (int j = limit; j >= g.skill; j--)
                dp[j] = Math.max(dp[j], dp[j - g.skill] + g.count);

        }

        answer = 0;
        solve(0, 0, 0, 0);
        System.out.print(answer);
        sc.close();
    }
}