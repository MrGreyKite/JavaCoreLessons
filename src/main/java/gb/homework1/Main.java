package gb.homework1;

public class Main {
    public static void main(String[] args) {
        Team teamOne = new Team("Тестовая команда",
                new TeamMember("Ферст", 20),
                new TeamMember("Секонд", 50),
                new TeamMember("Тирд", 120),
                new TeamMember("Фор", 35));
        teamOne.printTeamInfo();

        Team teamTwo = new Team("Команда со случайными значениями",
                new TeamMember("Од"),
                new TeamMember("Втор"),
                new TeamMember("Трит"),
                new TeamMember("Чета"));
        teamTwo.printTeamInfo();
    }
}
