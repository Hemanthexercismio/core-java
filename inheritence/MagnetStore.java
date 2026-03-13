class MagnetStore
{
    String[] names;
    int presentIndex = 0;

    MagnetStore(String[] names)
    {
        this.names = names;
    }

    void save(String name)
    {
        System.out.println("we are in save method of MagnetStore");
        System.out.println("name argument: " + name);

        if(this.names != null)
        {
            System.out.println("checking to store");

            int namesIndex = this.names.length - 1;

            if(this.presentIndex <= namesIndex)
            {
                System.out.println("storing in index : " + this.presentIndex);
                this.names[this.presentIndex] = name;
                this.presentIndex++;
            }
            else
            {
                System.out.println("array is full , cannot store more names");
            }
        }
        else
        {
            System.out.println("Names are not initialised with array");
        }
    }
}

