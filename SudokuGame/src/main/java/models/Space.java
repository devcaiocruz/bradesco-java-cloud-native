package models;

public final class Space {
    private int value;
    private boolean fixed;

    public Space() {
        this.value = 0;
        this.fixed = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (!this.fixed && value >= 0 && value <= 9){
            this.value = value;
        }
    }

    public void setFixedValue(int value) {
        this.value = value;
        this.fixed = true;
    }

    public boolean isFixed() {
        return fixed;
    }
}
