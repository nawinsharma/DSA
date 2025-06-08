class Solution:
    def isPalindrome(self, s: str) -> bool:
        final=''
        for ch in s:
            if ch.isalpha() or ch.isdigit():
                final += ch.lower()
        return (final == final[::-1])