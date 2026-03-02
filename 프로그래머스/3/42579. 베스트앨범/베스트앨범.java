import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> totalMap = new HashMap<>();

        Map<String, List<int[]>> musicMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);

            musicMap.putIfAbsent(genres[i], new ArrayList<>());
            musicMap.get(genres[i]).add(new int[]{i, plays[i]});
        }

        List<String> genreList = new ArrayList<>(totalMap.keySet());
        genreList.sort((a, b) -> totalMap.get(b) - totalMap.get(a));

        List<Integer> result = new ArrayList<>();

        for (String genre : genreList) {

            List<int[]> list = musicMap.get(genre);

            list.sort((a, b) -> {
                if (b[1] == a[1]) return a[0] - b[0];
                return b[1] - a[1];
            });

            int count = 0;
            for (int[] song : list) {
                result.add(song[0]);
                count++;
                if (count == 2) break;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}