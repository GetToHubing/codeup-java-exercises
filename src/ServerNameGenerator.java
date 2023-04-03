public class ServerNameGenerator {
    static String[] nouns = {"Walmart", "Tree", "Goose", "WerbenJagerManJensen", "Shenanigans", "Collywobles", "Borborygmus", "Donnybrook", "Snollygoster", "Taradiddle"};
    static String[] adjectives = {"jocular", "Cheesy", "Clownish", "Madcap", "Zesty", "Nutty", "Mirthful", "insecure", "Jolly", "alcoholic"};

    public static String Random(String[] arr) {
        String newArray = arr[(int) (Math.random() * 10)];
        return newArray;
    };

    public static void main(String[] args) {
        String noun = Random(nouns);
        String adjective = Random(adjectives);
        System.out.println(adjective + "-" + noun);
    }
};

