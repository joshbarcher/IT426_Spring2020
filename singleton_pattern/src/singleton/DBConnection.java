package singleton;

public class DBConnection
{
    private String host;
    private String dbName;
    private boolean encrypted;

    //store a static reference to the singleton
    private static DBConnection instance;

    //prevent access to our constructor
    private DBConnection(String host, String dbName,
                        boolean encrypted)
    {
        this.host = host;
        this.dbName = dbName;
        this.encrypted = encrypted;
    }

    public static DBConnection getInstance()
    {
        //lazy initialization...
        if (instance == null)
        {
            instance = new DBConnection("localhost", "my_db", true);
        }

        return instance;
    }

    public String getHost()
    {
        return host;
    }

    public String getDbName()
    {
        return dbName;
    }

    public boolean isEncrypted()
    {
        return encrypted;
    }
}
