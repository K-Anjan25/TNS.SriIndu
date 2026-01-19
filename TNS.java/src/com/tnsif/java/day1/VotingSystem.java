package com.tnsif.java.day1;

public class VotingSystem {
    public static void main(String[] args) {
        int age = 25;
        boolean isCitizen = true;
        boolean isRegistered = true;

        // Check if person is eligible to vote
        boolean isEligibleToVote = age >= 18 && isCitizen && isRegistered;

        System.out.println("Age: " + age);
        System.out.println("Is Citizen: " + isCitizen);
        System.out.println("Is Registered: " + isRegistered);
        System.out.println("Is Eligible to Vote: " + isEligibleToVote);

        if (isEligibleToVote) {
            System.out.println("You can cast your vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
