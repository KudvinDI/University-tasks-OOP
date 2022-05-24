package com.company;

import java.util.Scanner;

public class StrFilter {

    public StrFilter(String textInput) {
        StringBuilder stringBuilder = new StringBuilder(textInput);
        stringBuilder.delete(textInput.indexOf("("), textInput.lastIndexOf(")")+1);



    }


}
