package models;

import java.util.ArrayList;

public final class Board {
    private final ArrayList<ArrayList<Space>> spaces;
    private String status;

    public Board(String config) {
        ArrayList<ArrayList<Space>> spaces = new ArrayList<>();

        for (int x = 0; x < 9; x++) {
            spaces.add(new ArrayList<>());
            for (int y = 0; y < 9; y++) {
                spaces.get(x).add(new Space());
            }
        }

        for(String elementString : config.split(";")) {
            String[] properties = elementString.split(",");
            int value = Integer.parseInt(properties[0]);
            int x = Integer.parseInt(properties[1]);
            int y = Integer.parseInt(properties[2]);
            spaces.get(x).get(y).setFixedValue(value);
        }

        this.status = "IN_GAME";
        this.spaces = spaces;
    }

    public void verifyResult() {
        boolean hasCompleted = this.verifyHasCompleted();

        if(hasCompleted) {
            boolean linesOK = this.verifyLines();
            boolean columnsOK = this.verifyColumns();
            boolean quadrantsOK = this.verifyQuadrants();

            if(linesOK && columnsOK && quadrantsOK) {
                this.setStatus("COMPLETED");
            } else {
                this.setStatus("ERROR");
            }
        } else {
            System.out.println("First, complete the board!");
        }
    }

    private boolean verifyHasCompleted() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                Space space = this.spaces.get(x).get(y);
                if(space.getValue() == 0){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean verifyLines() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                Space space = this.spaces.get(x).get(y);

                for (int i = y+1; i < 9; i++) {
                    Space test = this.spaces.get(x).get(i);

                    if (space.getValue() == test.getValue() && space.getValue() != 0) {
                        System.out.println("Line ERROR - (" + x + ", " + y + ") and (" + x  + ", " + i + ")");
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean verifyColumns() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                Space space = this.spaces.get(x).get(y);

                for (int i = x+1; i < 9; i++) {
                    Space test = this.spaces.get(i).get(y);

                    if (space.getValue() == test.getValue() && space.getValue() != 0) {
                        System.out.println("Column ERROR - (" + x + ", " + y + ") and (" + i  + ", " + y + ")");
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean verifyQuadrants() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                Space space = this.spaces.get(x).get(y);

                int quadrantStartX = (x / 3) * 3;
                int quadrantStartY = (y / 3) * 3;

                for (int i = quadrantStartX; i < quadrantStartX + 3; i++) {
                    for (int j = quadrantStartY; j < quadrantStartY + 3; j++) {
                        if (i == x && j == y) continue;

                        Space quadrantTest = this.spaces.get(i).get(j);

                        if (space.getValue() == quadrantTest.getValue() && space.getValue() != 0) {
                            System.out.println("Quadrant ERROR - (" + x + ", " + y + ") and (" + i + ", " + j + ")");
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }


    public ArrayList<ArrayList<Space>> getSpaces() {
        return spaces;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printBoard() {
        System.out.println("\u001B[1;31m  0   1   2     3   4   5     6   7   8 \033[0m");
        for (int x = 0; x < 9; x++) {
            System.out.print("\u001B[1;31m" + x + " \033[0m");
            for (int y = 0; y < 9; y++) {
                Space space = spaces.get(x).get(y);
                String structure = (y == 2 || y == 5 ? "  |  " : " - ");
                String value = space.getValue() == 0 ? " " : String.valueOf(space.getValue());
                if (space.isFixed()) {
                    value = "\u001B[1;32m" + value + "\033[0m";
                }
                System.out.print(value + structure);
            }
            System.out.print("\u001B[1;31m " + x + "\033[0m\n");
            if (x==2 || x==5) {
                System.out.println("  -------------------------------------");
            }
        }
        System.out.println("\u001B[1;31m  0   1   2     3   4   5     6   7   8 \033[0m");
    }
}
