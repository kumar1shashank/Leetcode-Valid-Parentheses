# Leetcode-Valid-Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.<br>

An input string is valid if:<br>
<ul>
<li>Open brackets must be closed by the same type of brackets.</li><br>
<li>Open brackets must be closed in the correct order.</li><br>
<li>Every close bracket has a corresponding open bracket of the same type.</li><br>

<b>Example 1:</b>
Input: s = "()" <br>
Output: true <br>

<b>Example 2:</b><br>
Input: s = "()[]{}"<br>
Output: true<br>

<b>Example 3:</b><br>
Input: s = "(]"<br>
Output: false<br>

Constraints:<br>
1 <= s.length <= 104<br>
s consists of parentheses only '()[]{}'.<br>
