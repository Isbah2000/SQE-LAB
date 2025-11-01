package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StrUtilsTest {
 @Test
 public void palindromeTests() {
 assertTrue(StrUtils.isPalindrome("A man, a plan, a canal: Panama"));
 assertFalse(StrUtils.isPalindrome("hello"));
 }
 @Test
 public void reverseWordsTests() {
 assertEquals("world hello", StrUtils.reverseWords("hello world"));
 assertEquals("spaces multiple", StrUtils.reverseWords(" multiple spaces "));
 }
 @Test
 public void nullInputs() {
 assertThrows(IllegalArgumentException.class, () -> StrUtils.isPalindrome(null));
 assertThrows(IllegalArgumentException.class, () -> StrUtils.reverseWords(null));
 }
}
