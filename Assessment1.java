package assesment;


	public class Assessment1 {

	    // 1. Variable Types: Local, Instance, and Static
	    static class VariableTypes {
	        int instanceVar; // Instance variable
	        static int staticVar; // Static variable

	        void demonstrateVariables() {
	            int localVar = 10; // Local variable
	            System.out.println("Local Variable: " + localVar);
	            System.out.println("Instance Variable: " + instanceVar);
	            System.out.println("Static Variable: " + staticVar);
	        }
	    }

	    // 2. Variable Scope
	    static class VariableScope {
	        int instanceVar = 10;

	        void demonstrateScope() {
	            int localVar = 20; // Local scope
	            if (localVar > 15) {
	                int blockVar = 30; // Block scope
	                System.out.println("Block Variable: " + blockVar);
	            }
	            System.out.println("Local Variable: " + localVar);
	            System.out.println("Instance Variable: " + instanceVar);
	        }
	    }

	    // 3. Final Variables
	    static class FinalVariableDemo {
	        final int finalVar = 10;

	        void demonstrateFinalVariable() {
	            System.out.println("Final Variable: " + finalVar);
	        }
	    }

	    // 4. Type Inference (var in Java 10+)
	    static class TypeInferenceDemo {
	        void demonstrateVar() {
	            var num = 10; // Inferred as int
	            var str = "Hello"; // Inferred as String
	            System.out.println("Number: " + num);
	            System.out.println("String: " + str);
	        }
	    }

	    // 5. Static vs Non-Static Variables
	    static class StaticVsNonStatic {
	        static int staticVar = 10;
	        int nonStaticVar = 20;

	        void demonstrateVariables() {
	            System.out.println("Static Variable: " + staticVar);
	            System.out.println("Non-Static Variable: " + nonStaticVar);
	        }
	    }

	    // 6. Primitive vs Reference Variables
	    static class PrimitiveVsReference {
	        void demonstrateDifference() {
	            int primitive = 10;
	            int[] reference = {1, 2, 3};
	            modifyPrimitive(primitive);
	            modifyReference(reference);
	            System.out.println("Primitive after modification: " + primitive);
	            System.out.println("Reference after modification: " + reference[0]);
	        }

	        void modifyPrimitive(int num) {
	            num = 20;
	        }

	        void modifyReference(int[] arr) {
	            arr[0] = 10;
	        }
	    }

	    // 7. Constant Variables with static final
	    static class Circle {
	        static final double PI = 3.14159;

	        void calculateCircle(double radius) {
	            double area = PI * radius * radius;
	            double circumference = 2 * PI * radius;
	            System.out.println("Area: " + area);
	            System.out.println("Circumference: " + circumference);
	        }
	    }

	    // 8. Shadowing Variables
	    static class VariableShadowing {
	        int x = 10; // Instance variable

	        void demonstrateShadowing() {
	            int x = 20; // Local variable shadows instance variable
	            System.out.println("Local x: " + x);
	            System.out.println("Instance x: " + this.x);
	        }
	    }

	    // 9. Default Values of Variables
	    static class DefaultValues {
	        int intDefault;
	        double doubleDefault;
	        static String stringDefault;

	        void showDefaults() {
	            System.out.println("Default int: " + intDefault);
	            System.out.println("Default double: " + doubleDefault);
	            System.out.println("Default static String: " + stringDefault);
	        }
	    }

	    // 10. Volatile Variables
	    static class VolatileDemo {
	        volatile boolean flag = false;

	        void demonstrateVolatile() {
	            new Thread(() -> {
	                while (!flag) {
	                }
	                System.out.println("Flag changed!");
	            }).start();

	            try {
	                Thread.sleep(1000); // Simulate some work
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            flag = true; // Changes are visible to other threads
	        }
	    }

	    // 11. String Manipulation
	    static class StringManipulation {
	        void countCharacterFrequency(String input) {
	            input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
	            int[] freq = new int[26];
	            for (char c : input.toCharArray()) {
	                freq[c - 'a']++;
	            }
	            for (int i = 0; i < 26; i++) {
	                if (freq[i] > 0) {
	                    System.out.println((char) (i + 'a') + ": " + freq[i]);
	                }
	            }
	        }
	    }

	    // 12. Anagram Checker
	    static class AnagramChecker {
	        boolean areAnagrams(String str1, String str2) {
	            int[] freq1 = new int[26];
	            int[] freq2 = new int[26];
	            for (char c : str1.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
	                freq1[c - 'a']++;
	            }
	            for (char c : str2.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
	                freq2[c - 'a']++;
	            }
	            return java.util.Arrays.equals(freq1, freq2);
	        }
	    }

	    // 13. Array Rotation
	    static class ArrayRotation {
	        void rotateArray(int[] arr, int n, boolean toRight) {
	            int length = arr.length;
	            n = n % length; // Adjust rotation count
	            if (toRight) {
	                n = length - n;
	            }
	            reverse(arr, 0, n - 1);
	            reverse(arr, n, length - 1);
	            reverse(arr, 0, length - 1);
	        }

	        void reverse(int[] arr, int start, int end) {
	            while (start < end) {
	                int temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;
	                start++;
	                end--;
	            }
	        }
	    }

	    // 14. Subarray Sum
	    static class SubarraySum {
	        int maxSubarraySum(int[] arr) {
	            int maxSum = Integer.MIN_VALUE, currentSum = 0;
	            for (int num : arr) {
	                currentSum = Math.max(num, currentSum + num);
	                maxSum = Math.max(maxSum, currentSum);
	            }
	            return maxSum;
	        }
	    }

	    // 15. Matrix Multiplication
	    static class MatrixMultiplication {
	        int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
	            int rows1 = mat1.length, cols1 = mat1[0].length, cols2 = mat2[0].length;
	            int[][] result = new int[rows1][cols2];
	            for (int i = 0; i < rows1; i++) {
	                for (int j = 0; j < cols2; j++) {
	                    for (int k = 0; k < cols1; k++) {
	                        result[i][j] += mat1[i][k] * mat2[k][j];
	                    }
	                }
	            }
	            return result;
	        }
	    }

	    // 16. Palindrome Checker
	    static class PalindromeChecker {
	        boolean isPalindrome(String str) {
	            str = str.toLowerCase().replaceAll("[^a-z]", "");
	            return str.equals(new StringBuilder(str).reverse().toString());
	        }
	    }

	    // 17. Array Element Comparison
	    static class ArrayElementComparison {
	        void compareArrays(int[] arr1, int[] arr2) {
	            for (int i = 0; i < arr1.length; i++) {
	                if (arr1[i] > arr2[i]) {
	                    System.out.println(arr1[i] + " > " + arr2[i]);
	                } else if (arr1[i] < arr2[i]) {
	                    System.out.println(arr1[i] + " < " + arr2[i]);
	                } else {
	                    System.out.println(arr1[i] + " == " + arr2[i]);
	                }
	            }
	        }
	    }

	    // 18. Vowel and Consonant Counter
	    static class VowelConsonantCounter {
	        void countVowelsConsonants(String input) {
	            int vowels = 0, consonants = 0;
	            input = input.toLowerCase();
	            for (char c : input.toCharArray()) {
	                if ("aeiou".indexOf(c) != -1) {
	                    vowels++;
	                } else if (c >= 'a' && c <= 'z') {
	                    consonants++;
	                }
	            }
	            System.out.println("Vowels: " + vowels);
	            System.out.println("Consonants: " + consonants);
	        }
	    }

	    // 19. Frequency of Elements
	    static class FrequencyOfElements {
	        void findFrequency(int[] arr) {
	            java.util.Map<Integer, Integer> frequency = new java.util.HashMap<>();
	            for (int num : arr) {
	                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
	            }
	            frequency.forEach((key, value) -> System.out.println(key + ": " + value));
	        }
	    }

	    // 20. Valid Parentheses
	    static class ValidParentheses {
	        boolean isValid(String s) {
	            java.util.Stack<Character> stack = new java.util.Stack<>();
	            for (char c : s.toCharArray()) {
	                if (c == '(' || c == '{' || c == '[') {
	                    stack.push(c);
	                } else {
	                    if (stack.isEmpty()) return false;
	                    char open = stack.pop();
	                    if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
	                        return false;
	                    }
	                }
	            }
	            return stack.isEmpty();
	        }
	    }

	    // Main method for testing

	    	public static void main(String[] args) {
	    	    // Testing Variable Types
	    	    System.out.println("1. Variable Types:");
	    	    VariableTypes variableTypes = new VariableTypes();
	    	    variableTypes.demonstrateVariables();
	    	    System.out.println();

	    	    // Testing Variable Scope
	    	    System.out.println("2. Variable Scope:");
	    	    VariableScope variableScope = new VariableScope();
	    	    variableScope.demonstrateScope();
	    	    System.out.println();

	    	    // Testing Final Variables
	    	    System.out.println("3. Final Variables:");
	    	    FinalVariableDemo finalVariableDemo = new FinalVariableDemo();
	    	    finalVariableDemo.demonstrateFinalVariable();
	    	    System.out.println();

	    	    // Testing Type Inference
	    	    System.out.println("4. Type Inference:");
	    	    TypeInferenceDemo typeInferenceDemo = new TypeInferenceDemo();
	    	    typeInferenceDemo.demonstrateVar();
	    	    System.out.println();

	    	    // Testing Static vs Non-Static Variables
	    	    System.out.println("5. Static vs Non-Static Variables:");
	    	    StaticVsNonStatic staticVsNonStatic = new StaticVsNonStatic();
	    	    staticVsNonStatic.demonstrateVariables();
	    	    System.out.println();

	    	    // Testing Primitive vs Reference Variables
	    	    System.out.println("6. Primitive vs Reference Variables:");
	    	    PrimitiveVsReference primitiveVsReference = new PrimitiveVsReference();
	    	    primitiveVsReference.demonstrateDifference();
	    	    System.out.println();

	    	    // Testing Constants with static final
	    	    System.out.println("7. Constants with static final:");
	    	    Circle circle = new Circle();
	    	    circle.calculateCircle(5);
	    	    System.out.println();

	    	    // Testing Variable Shadowing
	    	    System.out.println("8. Variable Shadowing:");
	    	    VariableShadowing variableShadowing = new VariableShadowing();
	    	    variableShadowing.demonstrateShadowing();
	    	    System.out.println();

	    	    // Testing Default Values
	    	    System.out.println("9. Default Values:");
	    	    DefaultValues defaultValues = new DefaultValues();
	    	    defaultValues.showDefaults();
	    	    System.out.println();

	    	    // Testing Volatile Variables
	    	    System.out.println("10. Volatile Variables:");
	    	    VolatileDemo volatileDemo = new VolatileDemo();
	    	    volatileDemo.demonstrateVolatile();
	    	    System.out.println();

	    	    // Testing String Manipulation
	    	    System.out.println("11. String Manipulation:");
	    	    StringManipulation stringManipulation = new StringManipulation();
	    	    stringManipulation.countCharacterFrequency("Hello, World!");
	    	    System.out.println();

	    	    // Testing Anagram Checker
	    	    System.out.println("12. Anagram Checker:");
	    	    AnagramChecker anagramChecker = new AnagramChecker();
	    	    System.out.println("Are anagrams: " + anagramChecker.areAnagrams("listen", "silent"));
	    	    System.out.println();

	    	    // Testing Array Rotation
	    	    System.out.println("13. Array Rotation:");
	    	    ArrayRotation arrayRotation = new ArrayRotation();
	    	    int[] arr = {1, 2, 3, 4, 5};
	    	    arrayRotation.rotateArray(arr, 2, true);
	    	    System.out.println("Rotated Array: " + java.util.Arrays.toString(arr));
	    	    System.out.println();

	    	    // Testing Subarray Sum
	    	    System.out.println("14. Subarray Sum:");
	    	    SubarraySum subarraySum = new SubarraySum();
	    	    int[] subarray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	    	    System.out.println("Maximum Subarray Sum: " + subarraySum.maxSubarraySum(subarray));
	    	    System.out.println();

	    	    // Testing Matrix Multiplication
	    	    System.out.println("15. Matrix Multiplication:");
	    	    MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
	    	    int[][] mat1 = {{1, 2}, {3, 4}};
	    	    int[][] mat2 = {{2, 0}, {1, 2}};
	    	    int[][] result = matrixMultiplication.multiplyMatrices(mat1, mat2);
	    	    System.out.println("Matrix Multiplication Result:");
	    	    for (int[] row : result) {
	    	        System.out.println(java.util.Arrays.toString(row));
	    	    }
	    	    System.out.println();

	    	    // Testing Palindrome Checker
	    	    System.out.println("16. Palindrome Checker:");
	    	    PalindromeChecker palindromeChecker = new PalindromeChecker();
	    	    System.out.println("Is palindrome: " + palindromeChecker.isPalindrome("A man a plan a canal Panama"));
	    	    System.out.println();

	    	    // Testing Array Element Comparison
	    	    System.out.println("17. Array Element Comparison:");
	    	    ArrayElementComparison arrayElementComparison = new ArrayElementComparison();
	    	    int[] arr1 = {1, 2, 3};
	    	    int[] arr2 = {3, 2, 1};
	    	    arrayElementComparison.compareArrays(arr1, arr2);
	    	    System.out.println();

	    	    // Testing Vowel and Consonant Counter
	    	    System.out.println("18. Vowel and Consonant Counter:");
	    	    VowelConsonantCounter vowelConsonantCounter = new VowelConsonantCounter();
	    	    vowelConsonantCounter.countVowelsConsonants("Hello World");
	    	    System.out.println();

	    	    // Testing Frequency of Elements
	    	    System.out.println("19. Frequency of Elements:");
	    	    FrequencyOfElements frequencyOfElements = new FrequencyOfElements();
	    	    int[] freqArr = {1, 2, 2, 3, 3, 3};
	    	    frequencyOfElements.findFrequency(freqArr);
	    	    System.out.println();

	    	    // Testing Valid Parentheses
	    	    System.out.println("20. Valid Parentheses:");
	    	    ValidParentheses validParentheses = new ValidParentheses();
	    	    System.out.println("Is valid: " + validParentheses.isValid("({[]})"));
	    	    System.out.println("Is valid: " + validParentheses.isValid("({[})]"));
	    	}

	    }
	



