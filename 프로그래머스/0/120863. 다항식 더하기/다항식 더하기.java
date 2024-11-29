class Solution {
    public String solution(String polynomial) {
        int coefficient = 0; 
        int constant = 0;    

        String[] terms = polynomial.split(" ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    coefficient += 1;
                } else {
                    coefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else if (!term.equals("+")) {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (coefficient > 0) {
            if (coefficient == 1) {
                result.append("x");
            } else {
                result.append(coefficient).append("x");
            }
        }
        if (constant > 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }
}
