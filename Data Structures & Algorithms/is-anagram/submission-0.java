class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> setS = new HashMap<>();
        HashMap<Character, Integer> setT = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            setS.put(s.charAt(i), setS.getOrDefault(s.charAt(i), 0) + 1);
            setT.put(t.charAt(i), setT.getOrDefault(t.charAt(i), 0) + 1);

        }
        return setS.equals(setT);
        
    }
}
