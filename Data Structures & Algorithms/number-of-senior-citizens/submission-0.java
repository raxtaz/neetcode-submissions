class Solution {
    public int countSeniors(String[] details) {
        int ages[] = new int[details.length];
        int count = 0;

        for (int i = 0; i < details.length; i++) {
            String ageString = details[i].substring(11, 13);
            ages[i] = Integer.parseInt(ageString);
            if (ages[i] > 60) {
                count++;
            }
        }
        return count;
    }
}