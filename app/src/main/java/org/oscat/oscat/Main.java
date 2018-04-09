package org.oscat.oscat;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            if (AppConfiguration.IS_VERBOSE_MODE) {
                System.out.println("No flags specified.  Defaulting to GUI!");
            }

            System.out.println("~~ gui is not yet implemented.  exiting... ~~");
            return;
        }

    }

}
