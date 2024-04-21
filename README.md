Imagine you're a software engineer working for a cybersecurity company. Your team is tasked with developing a program to validate the integrity of security protocols in textual representations. Specifically, you're working on a function to ensure that parentheses, square brackets, and curly braces are properly balanced in strings.

Problem Statement:

Your task is to implement a function isValid to validate the integrity of security protocols encoded in a string. The string consists of various security symbols including '(', ')', '{', '}', '[', and ']'. Your function should determine whether these symbols are properly balanced and nested.

Requirements:

Your function should adhere to the following requirements:

Proper Closure: Open security symbols ('(', '{', '[') must be closed by the corresponding closing symbols (')', '}', ']') in the correct order.
Balanced Nesting: The symbols must be properly nested within each other, meaning that an open symbol must always be closed before any other open symbols that follow it can be closed.
Empty String Handling: An empty string is considered valid by default.
Function Signature:

public boolean isValid(String s)
Examples:

Valid Case:
Input: s = "((({}[])))"
Output: true
Explanation: The string contains properly nested and balanced security symbols.
Invalid Case:
Input: s = "({}[))"
Output: false
Explanation: The closing bracket ')' is misplaced and does not have a corresponding opening bracket.
Edge Case:
Input: s = ""
Output: true
Explanation: An empty string is considered valid.
Additional Constraints:

The input string s consists only of the characters '(', ')', '{', '}', '[', and ']'.
The length of s is between 0 and $10^4$.
