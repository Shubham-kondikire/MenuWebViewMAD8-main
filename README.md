# Experiment 8: Implementing Menus and WebView in Android

## Student Details

**Name:** Shubham Shivaji Kondikire  
**USN:** 25MCAR0102  
**Experiment No.:** 8

---

## Aim

To implement Menus and WebView in an Android application.

---

## Objective

The objective of this experiment is to understand how to implement an Options Menu in an Android application and how to use WebView to display web pages inside the application.

The application demonstrates menu-based navigation, WebView browsing, Toast messages, and WebView history navigation.

---

## Concept / Technology Used

### Options Menu

An Options Menu provides a list of actions that the user can perform from the application menu.

In this experiment, the Options Menu contains the following options:

```text
Home
Wikipedia
About
Exit
```

The menu is created using a menu XML resource and handled in `MainActivity`.

The following methods are used:

```kotlin
onCreateOptionsMenu()
```

and

```kotlin
onOptionsItemSelected()
```

---

### WebView

`WebView` is an Android component that allows web pages to be displayed directly inside an Android application.

Instead of opening a separate browser application, the web page is displayed inside the Android app.

The WebView loads web pages using:

```kotlin
loadUrl()
```

---

### WebViewClient

`WebViewClient` is used to handle navigation inside the WebView.

It allows the application to keep web page navigation inside the application instead of automatically opening an external browser.

---

### Internet Permission

Since the application loads web pages from the internet, the application requires internet permission in `AndroidManifest.xml`.

```text
android.permission.INTERNET
```

---

## Scenario

The application loads a default web page inside a WebView.

An Options Menu provides four navigation choices:

1. **Home**
   - Loads the Home web page.

2. **Wikipedia**
   - Loads the Wikipedia homepage inside the WebView.
   - Displays a Toast message indicating that Wikipedia is loading.

3. **About**
   - Displays application information using a Toast message.
   - Shows the student's name and USN.

4. **Exit**
   - Closes the application.

The Android device back button is also used to navigate through WebView history before exiting the application.

### Application Flow

```text
                    Android Application
                            |
                            ↓
                       MainActivity
                            |
                            ↓
                          WebView
                            |
                    Default Web Page
                            |
                            ↓
                      Options Menu
                            |
          +---------+-------+-------+---------+
          |         |               |         |
          ↓         ↓               ↓         ↓
        Home     Wikipedia        About      Exit
          |         |               |         |
          ↓         ↓               ↓         ↓
       WebView   WebView         Toast      Close
                                      |
                                      ↓
                            Name + USN Display
```

---

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle
- Android Emulator or Physical Android Device
- Internet Connection

---

## Technologies Used

- Kotlin
- Android WebView
- Options Menu
- Menu XML
- WebViewClient
- Toast
- XML Layout
- Android Manifest
- Internet Permission
- Android SDK

---

## Project Folder and File Structure

```text
MenuWebView/
│
├── app/
│   │
│   ├── src/
│   │   │
│   │   └── main/
│   │       │
│   │       ├── java/
│   │       │   └── com/example/menuwebview/
│   │       │       └── MainActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   │
│   │       │   └── menu/
│   │       │       └── main_menu.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── gradle/
│   └── wrapper/
│
├── .idea/
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
├── screenshot.png
└── README.md
```

---

## Important Files and Their Purpose

### MainActivity.kt

`MainActivity.kt` contains the main application logic.

It is responsible for:

- Initializing the WebView.
- Loading the default web page.
- Configuring WebViewClient.
- Creating the Options Menu.
- Handling menu selections.
- Loading Home and Wikipedia pages.
- Displaying the About information.
- Closing the application using Exit.

---

### activity_main.xml

`activity_main.xml` contains the main user interface.

The layout contains a WebView which occupies the main application screen.

---

### main_menu.xml

`main_menu.xml` defines the Options Menu items used by the application.

The menu contains:

```text
Home
Wikipedia
About
Exit
```

---

### AndroidManifest.xml

`AndroidManifest.xml` contains the application configuration and declares the required internet permission.

```text
android.permission.INTERNET
```

This permission allows the WebView to load web pages from the internet.

---

### build.gradle.kts

This file contains the Android application build configuration and required dependencies.

---

# Working / Implementation

## 1. Launch Application

When the application starts, `MainActivity` is launched.

The WebView loads the default web page.

---

## 2. WebView Configuration

The WebView is configured to load web content inside the application.

The application uses:

```kotlin
loadUrl()
```

to load the required web page.

---

## 3. Options Menu

The application provides an Options Menu containing:

```text
Home
Wikipedia
About
Exit
```

The menu is created using the menu XML resource.

---

## 4. Home Option

When the user selects **Home**, the WebView loads the Home web page.

The page is displayed directly inside the application.

---

## 5. Wikipedia Option

When the user selects **Wikipedia**, the WebView loads the Wikipedia homepage.

A Toast message is also displayed:

```text
Loading Wikipedia
```

---

## 6. About Option

When the user selects **About**, a Toast message displays the student's information.

```text
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102
```

---

## 7. Exit Option

When the user selects **Exit**, the application is closed.

---

## 8. Back Button Navigation

The Android device back button is used to navigate through WebView history.

If WebView has browsing history, the application navigates back to the previous web page.

---

# Test Cases

## Test Case 1: Default Page Load

### Test Objective

To verify that the default web page loads successfully inside the WebView.

### Test Steps

1. Launch the application.
2. Wait for the WebView to load.
3. Observe the displayed web page.

### Expected Result

The default web page should load successfully inside the WebView.

### Actual Result

The default web page was loaded successfully inside the WebView.

### Status

**PASS ✅**

---

## Test Case 2: Menu Navigation

### Test Objective

To verify that the Options Menu successfully navigates to the Wikipedia page.

### Test Steps

1. Launch the application.
2. Open the Options Menu.
3. Select **Wikipedia**.
4. Observe the WebView.
5. Observe the Toast message.

### Expected Result

The WebView should load the Wikipedia homepage and display:

```text
Loading Wikipedia
```

### Actual Result

The Wikipedia page was loaded successfully and the Toast message was displayed.

### Status

**PASS ✅**

---

## Test Case 3: Verify Student Name and USN

### Test Objective

To verify that the student's name and USN are displayed correctly through the About menu option.

### Test Data

**Name:** Shubham Shivaji Kondikire

**USN:** 25MCAR0102

### Test Steps

1. Launch the application.
2. Open the Options Menu.
3. Select **About**.
4. Observe the Toast message.

### Expected Result

The Toast message should display:

```text
Name: Shubham Shivaji Kondikire
USN: 25MCAR0102
```

### Actual Result

The student's name and USN were displayed successfully in the About Toast message.

### Status

**PASS ✅**

---

# Output

The application successfully demonstrates the implementation of an Options Menu and WebView.

The WebView loads web pages inside the application, while the Options Menu provides navigation options such as Home, Wikipedia, About, and Exit.

### Output Screenshot

<img width="720" height="1600" alt="MADEXP8 png" src="https://github.com/user-attachments/assets/b090eb7a-6a1f-4bdb-9720-2ddf75814ccb" />


---

# Steps to Run the Project

1. Open the project in Android Studio.
2. Allow Gradle synchronization to complete.
3. Connect an Android device or start an Android Emulator.
4. Make sure the device has an active internet connection.
5. Select the application from the Run Configuration.
6. Click the **Run ▶** button.
7. Launch the application.
8. Verify that the default web page loads.
9. Open the Options Menu.
10. Test Home, Wikipedia, About, and Exit options.

---

# Requirements

## Hardware Requirements

- Laptop/Desktop
- Android Device or Android Emulator
- USB Cable if using a physical Android device

## Software Requirements

- Android Studio
- Kotlin
- Android SDK
- Gradle
- Internet Connection

---

# Learning Outcomes

After completing this experiment, the following concepts were understood:

- Android Options Menu
- Menu XML
- `onCreateOptionsMenu()`
- `onOptionsItemSelected()`
- WebView
- `loadUrl()`
- WebViewClient
- Internet Permission
- Toast messages
- WebView navigation
- WebView history
- Android XML Layouts

---

# Result

The Android application was successfully developed and executed to demonstrate the implementation of an Options Menu and WebView.

The application successfully loads web pages inside the WebView and provides menu-based navigation using Home, Wikipedia, About, and Exit options.

---

# Conclusion

The experiment successfully demonstrated how to implement an Options Menu and integrate WebView into an Android application.

The application allows users to browse web content inside the application, navigate between pages using menu options, display application information using Toast messages, and exit the application through the Options Menu.

Thus, the objective of implementing Menus and WebView in an Android application was successfully achieved.

---

# Student Information

**Name:** Shubham Shivaji Kondikire  
**USN:** 25MCAR0102

**Experiment:** Experiment 8 – Implementing Menus and WebView in Android

---

# GitHub Repository

**Repository Name:** MenuWebView

**GitHub Link:**

https://github.com/Shubham-kondikire/MenuWebView

---

# Reference

- Android Developers – WebView
- Android Developers – Menus
- Android Developers – Menu Resources
- Android Developers – WebViewClient

---

## Author

**Shubham Shivaji Kondikire**

**USN:** 25MCAR0102
