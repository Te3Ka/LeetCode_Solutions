package ru.te3ka.exercisesleetcode;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMapRansomNote = new HashMap<>();
        HashMap<Character, Integer> hashMapMagazine = new HashMap<>();

        for (char ransomNoteChar : ransomNote.toCharArray()) {
            hashMapRansomNote.put(ransomNoteChar, hashMapRansomNote.getOrDefault(ransomNoteChar, 0) + 1);
        }

        for (char magazineChar : magazine.toCharArray()) {
            hashMapMagazine.put(magazineChar, hashMapMagazine.getOrDefault(magazineChar, 0) + 1);
        }

        for (char ransomNoteChar : hashMapRansomNote.keySet()) {
            if (!hashMapMagazine.containsKey(ransomNoteChar) ||
                    !(hashMapRansomNote.get(ransomNoteChar) <= hashMapMagazine.get(ransomNoteChar))
            ) {
                return false;
            }
        }

        return true;
    }
}