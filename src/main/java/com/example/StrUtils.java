package com.example;
public class StrUtils {
 public static boolean isPalindrome(String s) {
 if (s == null) throw new IllegalArgumentException("input cannot be null");
 StringBuilder cleaned = new StringBuilder();
 for (char c : s.toLowerCase().toCharArray()) {
 if (Character.isLetterOrDigit(c)) cleaned.append(c);
 }
 return cleaned.toString().equals(cleaned.reverse().toString());
 }
 public static String reverseWords(String s) {
 if (s == null) throw new IllegalArgumentException("input cannot be null");
 String[] parts = s.trim().split("\\s+");
 StringBuilder sb = new StringBuilder();
 for (int i = parts.length - 1; i >= 0; i--) {
 sb.append(parts[i]);
 if (i != 0) sb.append(" ");
 }
 return sb.toString();
 }
}
