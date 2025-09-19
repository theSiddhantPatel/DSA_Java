public class generateTag {

    public static String generateTag(String caption) {
        String[] words = caption.trim().split("\\s+");
        if (words.length == 0)
            return "";
        StringBuilder sb = new StringBuilder("#");
        sb.append(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            String w = words[i];
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase());
            }
        }
        // Limit the output to 100 characters
        return sb.length() > 100 ? sb.substring(0, 100) : sb.toString();
    }
}
