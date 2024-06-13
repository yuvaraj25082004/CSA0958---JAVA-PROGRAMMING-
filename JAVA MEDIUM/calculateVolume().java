class Box {
    double length;
    double width;
    double height;
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    public double calculateVolume() {
        return length * width * height;
    }
    public static void main(String[] args) {
        Box myBox = new Box();
        double volume = myBox.calculateVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
