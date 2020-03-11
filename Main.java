import java.util.*;

public class Main {

        public static void main(String[] args) {

            wordsSort();
            phoneBook();
        }

        private static void wordsSort() {

            Map<String, Integer> map = new HashMap<>();

            String[] words = {"Стол","Стул", "Шкаф","Зеркало","Стол","Тумбочка","Кровать","Лампа","Телевизор","Лампа"};

            for (int i = 0; i < words.length; i++) {

                if (map.containsKey(words[i]))

                    map.put(words[i], map.get(words[i]) + 1);
                else
                    map.put(words[i], 1);
            }
            System.out.println(map);
        }

        private static void phoneBook() {

            Guide guide = new Guide();

            guide.add("Антипов", "8999887654");

            guide.add("Антипов", "8998887765");

            guide.add("Борисов", "8917155544");

            guide.add("Вряшкин", "8915677777");

            guide.add("Гудяшкин", "8999995677");

            guide.add("Темяшкин", "8991145667");

            guide.add("Кудряшкин", "8994566777");

            guide.add("Леняшкин", "8888125566");

            guide.add("Кудяшкин", "8678876444");

            System.out.println(guide.get("Антипов"));

            System.out.println(guide.get("Вряшкин"));

            System.out.println(guide.get("Леняшкин"));

            System.out.println(guide.get("Кудяшкин"));

        }

    }

    class Guide {

        private Map<String, List<String>> directory_map = new HashMap<>();

        private List<String> phone_number_list;

        public void add(String surname, String phone_number) {

            if (directory_map.containsKey(surname)) {

                phone_number_list = directory_map.get(surname);

                phone_number_list.add(phone_number);

                directory_map.put(surname, phone_number_list);

            } else {

                phone_number_list = new ArrayList<>();

                phone_number_list.add(phone_number);

                directory_map.put(surname, phone_number_list);
            }
        }
        public List<String> get(String surname) {

            return directory_map.get(surname);
        }
    }
