# 30 Days of Wellness (Jetpack Compose)

Project: "Create a 30 Days App" (Android Basics with Compose, Unit 3, Pathway 3).

## How to use
1. In Android Studio create a new project: **Empty Activity**, name `ThirtyDays`, package `com.example.thirtydays`, min SDK 24.
2. Delete the generated `MainActivity.kt` and the generated `ui/theme` files.
3. Copy the contents of `app/src/main/java/...` and `app/src/main/res/...` from this folder into your project (overwrite `strings.xml` / `themes.xml`).
4. In `AndroidManifest.xml` make sure the `<application>` tag has `android:theme="@style/Theme.ThirtyDays"` and `android:label="@string/app_name"`.
5. Sync Gradle and run.

## Dependencies (module build.gradle.kts)
The Empty Activity template already includes everything needed: `androidx.core:core-ktx`, `androidx.activity:activity-compose`, the Compose BOM, `androidx.compose.material3:material3`, `androidx.compose.ui:ui-tooling-preview`.

## Requirements checklist
- 30 tips, one per day, each with an image and text (`data/TipsRepository.kt`, `strings.xml`, `drawable/day_XX.xml`)
- Scrollable `LazyColumn`
- Material Design theme: custom colors, typography, shapes (`ui/theme/`)
- Dark theme (follows system setting; two previews included)
- Animation: card expands with a spring and changes color when tapped
- Accessibility: expand button has a content description; day label and title are read as text

## Customising
- Replace the placeholder vector images `drawable/day_XX.xml` with your own photos (same file names without extension work, e.g. `day_01.jpg`).
- Edit titles and descriptions in `strings.xml`.
