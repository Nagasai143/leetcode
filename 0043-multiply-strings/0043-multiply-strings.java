class Solution {
    public String multiply(String num1, String num2) {
        // Handle multiplication by zero
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2]; // Max possible length

        // Multiply each digit from the end
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int sum = d1 * d2 + result[i + j + 1];

                result[i + j + 1] = sum % 10;               // Store unit digit
                result[i + j] += sum / 10;                  // Carry to the left
            }
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
