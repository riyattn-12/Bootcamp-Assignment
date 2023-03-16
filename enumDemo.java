public class enumDemo
{
    public static enum house
    {
        flat1(230000),
        flat2(540000),
        Apartment(2870000),
        Villa(987000);


        private final int price;

        house(int price)
        {
            this.price= price;
        }

        public int getPrice() {
            return price;
        }

    }
    public static void main(String[] args)
    {
        for(house h : house.values())
        {
            System.out.println(h+ " "+h.getPrice());
        }
    }
}
