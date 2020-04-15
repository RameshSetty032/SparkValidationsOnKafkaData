package Config;

public class Configurations {

    final static String appName = "kafka-to-Hive-Batch-job";
    final static String master = "local[*]";
    final static String source = "kafka";
    final static String topic = "excep_Topic";
    final static String autoOffset = "latest";
    final static String enableAutoOffset = "true";
    final static String bootStrapServer = "localhost:9092";


   public static String getSource() {
        return source;
    }

  public  static String getTopic() {
        return topic;
    }

   public static String getAutoOffset() {
        return autoOffset;
    }

   public  static String getBootStrapServer() {
        return bootStrapServer;
    }

    public static String getEnableAutoOffset() {
        return  enableAutoOffset;
    }

    public static String getAppName() {
        return appName;
    }

   public  static String getMaster() {
        return master;
    }

}
