class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1Revisions = version1.split("\\."); // Need to escape the dot
        String[] v2Revisions = version2.split("\\."); // Need to escape the dot
        
        int maxLength = Math.max(v1Revisions.length, v2Revisions.length);
        
        for (int i = 0; i < maxLength; i++) {
            int v1Rev = i < v1Revisions.length ? Integer.parseInt(v1Revisions[i]) : 0;
            int v2Rev = i < v2Revisions.length ? Integer.parseInt(v2Revisions[i]) : 0;
            
            if (v1Rev < v2Rev) {
                return -1;
            } else if (v1Rev > v2Rev) {
                return 1;
            }
        }
        
        return 0;
    }
}
