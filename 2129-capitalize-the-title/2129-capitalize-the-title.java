class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String curr = words[i].toLowerCase();

            if (curr.length() > 2) {
                sb.append(Character.toUpperCase(curr.charAt(0)));
                sb.append(curr.substring(1));
            } else {
                sb.append(curr);
            }

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
