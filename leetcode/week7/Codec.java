import java.util.HashMap;

public class Codec {
    HashMap<String, String> map = new HashMap<String, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String seed = "";
        for (int i = 0; i < 6; i++) {
            seed += (char)('a' + (int)(Math.random() * 26));
        }
        map.put(seed, longUrl);
        return seed;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
