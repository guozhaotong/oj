package medium;

import java.util.HashMap;

/**TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 * @author 郭朝彤
 * @date 2017/11/17.
 */
public class M535_tinyURL {
    public void main(String[] args) {

    }

    HashMap<String, String> map = new HashMap<String, String>();//key是shortURL的编号（表示成String）， value是longURL
    int i = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortURL = "";
        shortURL = "http://tinyurl.com/" + i;
        map.put("" + (i++), longUrl);
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String longURL = "";
        String index = shortUrl.replaceAll("http://tinyurl.com/", "");
        if (!map.containsKey(index)) {
            return longURL;
        } else {
            longURL = map.get(index);
        }
        return longURL;
    }
}
