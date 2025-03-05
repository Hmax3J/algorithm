package brush_up.hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String, Integer> playCount = new HashMap<>();
        Map<String, List<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            playCount.put(genres[i], playCount.getOrDefault(genres[i], 0) + plays[i]);

            genreSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new Song(i, plays[i]));
        }

        List<Integer> result = new ArrayList<>();

        List<String> genresSorted = new ArrayList<>(playCount.keySet());
        genresSorted.sort((g1, g2) -> playCount.get(g2) - playCount.get(g1));

        for (String genre : genresSorted) {
            List<Song> songs = genreSongs.get(genre);

            songs.sort((s1, s2) -> s2.playCount - s1.playCount);

            int count = Math.min(2, songs.size());
            for (int i = 0; i < count; i++) {
                result.add(songs.get(i).id);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    class Song {
        int id;
        int playCount;

        Song(int id, int playCount) {
            this.id = id;
            this.playCount = playCount;
        }
    }
}
