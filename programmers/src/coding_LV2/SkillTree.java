package coding_LV2;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int validCount = 0;

        for (String skillTree : skill_trees) {
            StringBuilder filteredSkill = new StringBuilder();
            for (char c : skillTree.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    filteredSkill.append(c);
                }
            }

            if (skill.startsWith(filteredSkill.toString())) {
                validCount++;
            }
        }

        return validCount;
    }
}
