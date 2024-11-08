public class LegoContainers {
    public static void main(String[] args) {

        //generowanie losowej liczby między 25 a 50
        int randomNumberOfBricks = (int) (Math.random() *(25));
         randomNumberOfBricks = randomNumberOfBricks*2+1;
        System.out.println("Random number of bricks: " + randomNumberOfBricks);

        //pojemność pojemnika
        int containerCapacityZiolog = 8;

        //liczba pełnych pojemników
        int containers = randomNumberOfBricks/containerCapacityZiolog;
        System.out.println("We have: " + containers + " full containers");

        //variable holding the remainder of the division,
        // i.e. whether we have a free container and how many blocks are in it
        int remainder = randomNumberOfBricks % containerCapacityZiolog;

        if (remainder != 0 ){
            containers++;
            containerCapacityZiolog = remainder;
        }

        System.out.println("Total number of containers: " + containers);
        System.out.println("Number of blocks in an incomplete container: " + containerCapacityZiolog);
    }
}
