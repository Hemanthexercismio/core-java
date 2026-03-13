class MagnetRunner
{
    public static void main(String[] values)
    {
        String[] names = new String[5];

        MagnetStore magnetStore = new MagnetStore(names);

        magnetStore.save("Bar Magnet");
        magnetStore.save("Horseshoe Magnet");
        magnetStore.save("Ring Magnet");
        magnetStore.save("Disc Magnet");
    }
}