class TreeRunner
{
    public static void main(String[] values)
    {
        String[] names = new String[6];

        TreeStore treeStore = new TreeStore(names);

        treeStore.save("Mango");
        treeStore.save("Neem");
        treeStore.save("Banyan");
        treeStore.save("Peepal");
    }
}