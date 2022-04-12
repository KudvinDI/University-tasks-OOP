package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrFilter {
    private String newText;


    StrFilter(String textInput){
        StringBuilder stringBuilder = new StringBuilder(textInput);
        stringBuilder.delete(textInput.indexOf("("), textInput.lastIndexOf(")")+1);
        newText = stringBuilder.toString();
        StringBuilder stringBuilder1 = new StringBuilder(newText);


    }
    public String getText(){
        return newText;
    }
    public int getTextLength(){
        return newText.length();
    }

}
