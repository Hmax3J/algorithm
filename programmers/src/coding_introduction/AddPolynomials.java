package coding_introduction;

public class AddPolynomials {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");

        int xTerm = 0;
        int constant = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xTerm += 1;
                } else {
                    xTerm += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();

        if (xTerm > 0) {
            if (xTerm == 1) {
                result.append("x");
            } else {
                result.append(xTerm).append("x");
            }
        }

        if (constant > 0) {
            if (xTerm > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }
}
