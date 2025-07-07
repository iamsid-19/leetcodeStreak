class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map = new HashMap<>();
        HashMap<Character, String> res = new HashMap<>();
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (!map.get(arr[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            } else {

                if (res.containsKey(pattern.charAt(i))) {
                    return false;
                }
                res.put(pattern.charAt(i), arr[i]);
                map.put(arr[i], pattern.charAt(i));

            }

        }
        return true;
    }
}