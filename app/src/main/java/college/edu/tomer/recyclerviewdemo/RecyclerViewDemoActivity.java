package college.edu.tomer.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;
import java.util.List;

public class RecyclerViewDemoActivity extends AppCompatActivity {

    private List<AndroidVersion> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvAndroidVersion);
        initDummyData();
        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new AndroidVersionAdapter(data, this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recycler_view_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void initDummyData() {

        AndroidVersion[] versions ={new AndroidVersion("Cake", "Cupcake",  1.5f, "cupcake", "Support for third-party virtual keyboards with text prediction and user dictionary for custom words Support for Widgets – miniature application views that can be embedded in other applications (such as the Home screen) and receive periodic updates[35] Video recording and playback in MPEG-4 and 3GP formats Auto-pairing and stereo support for Bluetooth (A2DP and AVRCP profiles) Copy and paste features in web browser User pictures shown for Favorites in Contacts Specific date/time stamp shown for events in call log, and one-touch access to a contact card from call log event Animated screen transitions Auto-rotation option New stock boot animation"),

                new AndroidVersion("Cake", "Donut",  1.6f, "donut", "Voice and text entry search enhanced to include bookmark history, contacts, and the web Ability for developers to include their content in search results Multi-lingual speech synthesis engine to allow any Android application to  speak a string of text Easier searching and ability to view app screenshots in Android Market Gallery, camera and camcorder more fully integrated, with faster camera access Ability for users to select multiple photos for deletion Updated technology support for CDMA/EVDO, 802.1x, VPNs, and a text-to-speech engine Support for WVGA screen resolutions Speed improvements in searching and camera applications Expanded Gesture framework and new GestureBuilder development tool"),

                new AndroidVersion("Cake", "Eclair",  2.1f, "eclair", "Expanded Account sync, allowing users to add multiple accounts to a device for synchronization of email and contacts Microsoft Exchange email support, with combined inbox to browse email from multiple accounts in one page Bluetooth 2.1 support Ability to tap a Contacts photo and select to call, SMS, or email the person Ability to search all saved SMS and MMS messages, with delete oldest messages in a conversation automatically deleted when a defined limit is reached Numerous new camera features, including flash support, digital zoom, scene mode, white balance, color effect and macro focus Improved typing speed on virtual keyboard, with smarter dictionary that learns from word usage and includes contact names as suggestions Refreshed browser UI with bookmark thumbnails, double-tap zoom and support for HTML5 Calendar agenda view enhanced, showing attending status for each invitee, and ability to invite new guests to events Optimized hardware speed and revamped UI Support for more screen sizes and resolutions, with better contrast ratio Improved Google Maps 3.1.2 MotionEvent class enhanced to track multi-touch events[41] Addition of live wallpapers, allowing the animation of home-screen background images to show movement"), /*פחזניה*/

                new AndroidVersion("Ice Cream", "Froyo",  2.2f, "froyo", "Speed, memory, and performance optimizations Additional application speed improvements, implemented through JIT compilation Integration of Chrome's V8 JavaScript engine into the Browser application Support for the Android Cloud to Device Messaging (C2DM) service, enabling push notifications Improved Microsoft Exchange support, including security policies, auto-discovery, GAL look-up, calendar synchronization and remote wipe Improved application launcher with shortcuts to Phone and Browser applications USB tethering and Wi-Fi hotspot functionality[47] Option to disable data access over mobile network Updated Market application with batch and automatic update features[45] Quick switching between multiple keyboard languages and their dictionaries Support for Bluetooth-enabled car and desk docks Support for numeric and alphanumeric passwords Support for file upload fields in the Browser application[48] The browser now shows all frames of animated GIFs instead of just the first frame only Support for installing applications to the expandable memory Adobe Flash support[49] Support for high-PPI displays (up to 320 ppi), such as four-inch 720p screens[50] Gallery allows users to view picture stacks using a zoom gesture"), /*Frozen Yogurt*/

                new AndroidVersion("Cookie", "Gingerbread",  2.3f, "gingerbread", "Updated user interface design with increased simplicity and speed Support for extra-large screen sizes and resolutions (WXGA and higher) Native support for SIP VoIP internet telephony Faster, more intuitive text input in virtual keyboard, with improved accuracy, better suggested text and voice input mode Enhanced copy/paste functionality, allowing users to select a word by press-hold, copy, and paste Support for Near Field Communication (NFC), allowing the user to read an NFC tag embedded in a poster, sticker, or advertisement New audio effects such as reverb, equalization, headphone virtualization, and bass boost New Download Manager, giving users easy access to any file downloaded from the browser, email, or another application Support for multiple cameras on the device, including a front-facing camera, if available Support for WebM/VP8 video playback, and AAC audio encoding Improved power management with a more active role in managing applications that are keeping the device awake for too long Enhanced support for native code development Switched from YAFFS to ext4 on newer devices[55][56] Audio, graphical, and input enhancements for game developers Concurrent garbage collection for increased performance Native support for more sensors (such as gyroscopes and barometers)"),

                new AndroidVersion("Cake", "Honeycomb",  3, "honeycomb", "Optimized tablet support with a new “holographic” user interface Added System Bar, featuring quick access to notifications, status, and soft navigation buttons, available at the bottom of the screen Added Action Bar, giving access to contextual options, navigation, widgets, or other types of content at the top of the screen Simplified multitasking – tapping Recent Applications in the System Bar allows users to see snapshots of the tasks underway and quickly jump from one application to another Redesigned keyboard, making typing fast, efficient and accurate on larger screen sizes Simplified, more intuitive copy/paste interface Multiple browser tabs replacing browser windows, plus form auto-fill and a new “incognito” mode allowing anonymous browsing Quick access to camera exposure, focus, flash, zoom, front-facing camera, time-lapse, and other camera features Ability to view albums and other collections in full-screen mode in Gallery, with easy access to thumbnails for other photos New two-pane Contacts UI and Fast Scroll to let users easily organize and locate contacts New two-pane Email UI to make viewing and organizing messages more efficient, allowing users to select one or more messages Hardware acceleration Support for multi-core processors Ability to encrypt all user data HTTPS stack improved with Server Name Indication (SNI) Filesystem in Userspace (FUSE; kernel module) Disallows applications from having write access to secondary storage (memory cards on devices with internal primary storage) outside of designated, application-specific directories. Full access to primary internal storage is still allowed through a separate application-level permission."),

                new AndroidVersion("Ice Cream", "Ice Cream Sandwich",  4f, "ice_cream_sandwich", "Major refinements to the Holo interface with new Roboto font family Soft buttons from Android 3.x are now available for use on phones Separation of widgets in a new tab, listed in a similar manner to applications Easier-to-create folders, with a drag-and-drop style Improved visual voicemail with the ability to speed up or slow down voicemail messages Pinch-to-zoom functionality in the calendar Integrated screenshot capture (accomplished by holding down the Power and Volume-Down buttons) Improved error correction on the keyboard Ability to access applications directly from lock screen Improved copy and paste functionality Better voice integration and continuous, real-time speech to text dictation Face Unlock, a feature that allows users to unlock handsets using facial recognition software Automatic syncing of browser with users' Chrome bookmarks Data Usage section in settings that lets users set warnings when they approach a certain usage limit, and disable data use when the limit is exceeded Ability to shut down applications from the recent apps list with a swipe.[88] Improved camera application with zero shutter lag, time lapse settings, panorama mode, and the ability to zoom while recording Built-in photo editor New gallery layout, organized by location and person Refreshed People application with social network integration, status updates and hi-res images Android Beam, a near-field communication feature allowing the rapid short-range exchange of web bookmarks, contact info, directions, YouTube videos and other data Support for the WebP image format[75] Hardware acceleration of the UI[89] Wi-Fi Direct[90] 1080p video recording for stock Android devices Android VPN Framework (AVF), and TUN (but not TAP) kernel module. Prior to 4.0, VPN software required rooted Android."),

                new AndroidVersion("Candy", "Jelly Bean",  4.1f, "jelly_bean", "Smoother user interface: Vsync timing across all drawing and animation done by the Android framework, including application rendering, touch events, screen composition and display refresh Triple buffering in the graphics pipeline Enhanced accessibility Bi-directional text and other language support User-installable keyboard maps Expandable notifications Ability to turn off notifications on an application-specific basis Shortcuts and widgets can automatically be re-arranged or re-sized to allow new items to fit on home screens Bluetooth data transfer for Android Beam Tablets with smaller screens now use an expanded version of the interface layout and home screen used by phones.[99] Improved camera application Multichannel audio[97] The Fraunhofer FDK AAC codec becomes standard in Android, adding AAC 5.1 channel encoding/decoding USB audio (for external sound DACs)[97] Audio chaining (also known as gapless playback)[97][100][101] Ability for other launchers to add widgets from the application drawer without requiring root access"),

                new AndroidVersion("Chocolate Bar", "Kitkat",  4.4f, "kit_kat", "Refreshed interface with white elements instead of blue Clock no longer shows bold hours; all digits are thin. The H, M, and S markings for the stopwatch and timer have been removed, leaving just the numbers. Ability for applications to trigger translucency in the navigation and status bars[136] Ability for applications to use immersive mode  to keep the navigation and status bars hidden while maintaining user interaction Action overflow menu buttons are always visible, even on devices with a  Menu key, which was officially deprecated by Android 4.0. Restriction for applications when accessing external storage, except for their own directories Optimizations for performance on devices with lower specifications, including zRAM support and  low RAM  device API Wireless printing capability NFC host card emulation, enabling a device to replace smart cards WebViews now based on Chromium engine (feature parity with Chrome for Android 30) Expanded functionality for notification listener services[132] Public API for developing and managing text messaging clients[139] Storage Access Framework, an API allowing apps to retrieve files in a consistent manner. As part of the framework, a new system file picker allows users to access files from various sources (including those exposed by apps, such as online storage services). New framework for UI transitions Sensor batching, step detector and counter APIs Settings application now makes it possible to select default text messaging and home (launcher) application Audio tunneling, audio monitoring and loudness enhancer Built-in screen recording feature (primarily for developers, as usage of ADB is required) Native infrared blaster API Expanded accessibility APIs and system-level closed captioning settings Android Runtime (ART) introduced as a new experimental application runtime environment, not enabled by default, as a replacement for the Dalvik virtual machine  Bluetooth Message Access Profile (MAP) support Disabled access to battery statistics by third-party applications  Settings application no longer uses a multi-pane layout on devices with larger screens Wi-Fi and mobile data activity (TX/RX) indicators are moved to quic"),

                new AndroidVersion( "Candy",  "Lollipop",  5f, "lollipop", "Android Runtime (ART) with ahead-of-time (AOT) compilation and improved garbage collection (GC), replacing Dalvik that combines bytecode interpretation with trace-based just-in-time (JIT) compilation[167][169] Support for 64-bit CPUs OpenGL ES 3.1 and Android Extension Pack (AEP) on supported GPU configurations Recent activities screen with tasks instead of applications, up to a configured maximum of tasks per application Vector drawables, which scale without losing definition Support for print previews Material design, bringing a restyled user interface Refreshed lock screen, no longer supporting widgets Refreshed notification tray and quick settings pull-down Project Volta, for battery life improvements Searches can be performed within the system settings for quicker access to particular settings Lock screen provides shortcuts to application and notification settings[171] Guest logins and multiple user accounts are available on more devices, such as phones.[172] Audio input and output through USB devices Third-party applications regain the ability to read and modify data located anywhere on external storage, such as on SD cards. Pinning of an application's screen for restricted user activity. Recently used applications are remembered even after restarting the device. WebViews receive updates independently through Google Play for security reasons, instead of relying on system-wide vendor updates Addition of 15 new languages: Basque, Bengali, Burmese, Chinese (Hong Kong), Galician, Icelandic, Kannada, Kyrgyz, Macedonian, Malayalam, Marathi, Nepali, Sinhala, Tamil and Telugu[176] Tap and Go allows users to quickly migrate to a new Android device, using NFC and Bluetooth to transfer Google Account details, configuration settings, user data and installed applications[171] A flashlight-style application is included, working on supported devices with a camera flash.[171] User-customizable priorities for application notifications.  Smart lock feature Updated emoji"),

                new AndroidVersion( "Candy",  "Marshmallow",  6f, "marshmallow", "Android Marshmallow introduces a redesigned permission model: there are now only eight permission categories, and applications are no longer automatically granted all of their specified permissions at installation time. An opt-in system is now used, in which users are prompted to grant or deny individual permissions (such as the ability to access the camera or microphone) to an application when they are needed. Applications remember their permission grants, and they can be adjusted by the user at any time. The new permission model will be used only by applications compiled for Marshmallow using its software development kit (SDK), while all other applications will continue to use the previous permission model. Marshmallow also has a new power management scheme named Doze that reduces the level of background application activity when the device determines that it is not being actively handled by its user, which, according to Google, doubles the device's battery life.[8] It also introduces an option for resetting all network settings, available for the first time on Android, which clears network-related settings for Wi-Fi, Bluetooth and cellular connection. Android Marshmallow provides native support for fingerprint recognition, allowing the use of fingerprints for unlocking devices and authenticating Play Store and Android Pay purchases; a standard API is also available for implementing fingerprint-based authentication in other applications. Android Marshmallow supports USB Type-C, including the ability to instruct devices to charge another device over USB. Marshmallow also introduces verified links that can be configured to open directly in their specified application without further user prompts. Version of the Android API provided by Marshmallow is 23. The Android Marshmallow developer tools are available in the SDK Manager under the API level MNC")};

        data = Arrays.asList(versions);
    }

}
