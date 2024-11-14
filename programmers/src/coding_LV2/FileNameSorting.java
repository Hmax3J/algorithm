package coding_LV2;

import java.util.*;

public class FileNameSorting {
    private static class File {
        String head;
        String number;
        String tail;
        String original;

        public File(String head, String number, String tail, String original) {
            this.head = head;
            this.number = number;
            this.tail = tail;
            this.original = original;
        }
    }

    public String[] solution(String[] files) {
        List<File> parsedFiles = new ArrayList<>();

        for (String file : files) {
            parsedFiles.add(parseFile(file));
        }

        parsedFiles.sort(new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                int headComparison = f1.head.compareToIgnoreCase(f2.head);
                if (headComparison != 0) {
                    return headComparison;
                }

                int num1 = Integer.parseInt(f1.number);
                int num2 = Integer.parseInt(f2.number);
                return Integer.compare(num1, num2);
            }
        });

        String[] sortedFiles = new String[files.length];
        for (int i = 0; i < parsedFiles.size(); i++) {
            sortedFiles[i] = parsedFiles.get(i).original;
        }

        return sortedFiles;
    }

    private static File parseFile(String file) {
        int len = file.length();
        int idx = 0;

        StringBuilder head = new StringBuilder();
        while (idx < len && !Character.isDigit(file.charAt(idx))) {
            head.append(file.charAt(idx));
            idx++;
        }

        StringBuilder number = new StringBuilder();
        while (idx < len && Character.isDigit(file.charAt(idx))) {
            number.append(file.charAt(idx));
            idx++;
        }

        String tail = (idx < len) ? file.substring(idx) : "";

        return new File(head.toString(), number.toString(), tail, file);
    }
}
