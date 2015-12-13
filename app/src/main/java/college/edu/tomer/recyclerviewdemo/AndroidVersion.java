package college.edu.tomer.recyclerviewdemo;

/**
 * Copy as will
 */
public class AndroidVersion {

    //Private members:
    private String versionNumber;
    private String versionName;
    private String imageUrl;
    private String versionDescription;

    //Constructors:
    public AndroidVersion(String versionNumber, String versionName, String imageUrl, String versionDescription) {
        this.versionNumber = versionNumber;
        this.versionName = versionName;
        this.imageUrl = imageUrl;
        this.versionDescription = versionDescription;
    }


    //Public API:
    @Override
    public String toString() {
        return "AndroidVersion{" +
                "versionNumber='" + versionNumber + '\'' +
                ", versionName='" + versionName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", versionDescription='" + versionDescription + '\'' +
                '}';
    }

    // Public API: Getters:
    public String getVersionNumber() {
        return versionNumber;
    }

    public String getVersionName() {
        return versionName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVersionDescription() {
        return versionDescription;
    }
}
