package coding_introduction;

public class ArmyOfAnts {
    public int solution(int hp) {
        int general = hp / 5;
        int remainder = hp % 5;

        int solider = remainder / 3;
        remainder = remainder % 3;

        int work = remainder;

        return general + solider + work;
    }
}
