class Solution {
    public boolean isAnagram(String s, String t) {
        s.trim().toLowerCase();
        t.trim().toLowerCase();

        if(s.length() != t.length()){
            return false;
        }
        if(s.equals(t)){
            return true;
        }
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();
        
        for(char c: s_arr){
            if (s_map.containsKey(c) == false){
                s_map.put(c,1);
                continue;
            }
            s_map.put(c,s_map.get(c)+1);
        }
        for(char c: t_arr){
            if (t_map.containsKey(c) == false){
                t_map.put(c,1);
                continue;
            }
            t_map.put(c,t_map.get(c)+1);
        }
        for(HashMap.Entry<Character,Integer> entry : s_map.entrySet()){
            if(!entry.getValue().equals(t_map.get(entry.getKey()))){
                return false;
            }
        }
        return true;
    }
}
