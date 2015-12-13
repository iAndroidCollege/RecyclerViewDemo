package college.edu.tomer.recyclerviewdemo;


/**
 * immutable class AndroidVersion
 */
public class AndroidVersion {


    final String description;
    final String imageName;
    final Float version;
    final String name;
    final String category;



    @Override
    public String toString() {
        return "AndroidVersion{" +
                "description='" + description + '\'' +
                ", imageName='" + imageName + '\'' +
                ", version=" + version +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public AndroidVersion(String category, String name, float version,
                          String imageName, String description) {
        this.category = category;
        this.name = name;
        this.version = version;
        this.imageName = imageName;
        this.description = description;
    }
}
