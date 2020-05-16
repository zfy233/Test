
import java.util.*;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * 方法一：深度优先遍历
 */
import java.util.ArrayList;
import java.util.List;


/**
 * 方法一：深度优先遍历
 */
/*
 * @lc app=leetcode.cn id=688 lang=java
 *
 * [688] “马”在棋盘上的概率
 */
import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<>();
        Set<String> dict = new HashSet<>();
        for(String str : wordDict) {
            dict.add(str);
        }
        return helper(s, map, dict);
    }

    public List<String> helper(String s, Map<String, List<String>> map, Set<String> dict) {
        if(map.containsKey(s)) {
            return map.get(s);
        }
        List<String> cur = new ArrayList<>();
        if(dict.contains(s)) {
            cur.add(s);
        }
        for(int i = 0; i < s.length(); i++) {
            String subRight = s.substring(i);
            if(!dict.contains(subRight)) {
                continue;
            }
            // 如果右边的字符串在字典里面
            List<String> subLeft = helper(s.substring(0, i), map, dict);
            List<String> tmpp = append(subLeft, subRight);
            for(String tt : tmpp) {
                cur.add(tt);
            }
        }
        map.put(s, cur);
        return map.get(s);
    }

    public List<String> append(List<String> tmp, String str) {
        List<String> build = new ArrayList<>();
        for(String ss : tmp) {
            StringBuilder sb = new StringBuilder();
            sb.append(ss).append(" ").append(str);
            build.add(sb.toString());
        }
        return build;
    }
}