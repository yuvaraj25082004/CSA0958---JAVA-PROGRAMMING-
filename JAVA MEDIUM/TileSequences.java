import java.util.HashSet;
import java.util.Set;

public class TileSequences {
    public static int numTilePossibilities(String tiles) {
        Set<String> sequences = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        backtrack(tiles, visited, new StringBuilder(), sequences);
        return sequences.size();
    }

    private static void backtrack(String tiles, boolean[] visited, StringBuilder current, Set<String> sequences) {
        if (current.length() > 0) {
            sequences.add(current.toString());
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.append(tiles.charAt(i));
                backtrack(tiles, visited, current, sequences);
                current.deleteCharAt(current.length() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        int result = numTilePossibilities(tiles);
        System.out.println("Output: " + result);
    }
}
