package org.example.utils;

import java.util.Random;
import java.util.Scanner;

public interface Input {
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);
    Random random = new Random();
}
