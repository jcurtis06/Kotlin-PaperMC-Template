![kotlingradlepaper](https://user-images.githubusercontent.com/77545656/206234518-99eeb3d6-b1cd-42f5-adcc-6a994d600624.png)
<h1 align="center">
A template for PaperMC plugins using Gradle + Kotlin
</h1>

### Usage

**Cloning**
1. Click the green "Use this template" button at the top of the page
2. Name your repository
3. Clone the repository using `git clone`
4. Open the project in IntelliJ

**Customizing**
- To change the default module name, change the `rootProject.name` property in `settings.gradle.kts`
- After renaming the default package (`io.jcurtis.kotlinexample`), you must also update the `plugin.yml` file to reflect the new path to the main class

**Building**
1. Run `gradle build`
2. Two `.jar` files will be made under the `build/libs` directory. One ends with `-all`, and the other does not. You should almost always use the one ending in `-all` (see below)
3. Drag and drop the `.jar` file into your server's `plugins` directory

### About
I created this after struggling for days with getting Kotlin to work properly with Paper/Spigot. This is an *almost* foolproof setup.

I'd like to note that I am by no means a professional at using Gradle. This might not be the best way to do things, but it works great for me.

### `-all` vs non-`-all`
If you have another plugin also written in Kotlin, and you would like to depend on it, **use the `.jar` file that does not contain `-all` in the name.** This is because the `-all` file contains all of the Kotlin dependencies, which will conflict with the other plugin's dependencies.

### Special thanks
I want to thank the people on the PaperMC Discord server for helping me get this going. I probably would be left banging my head against a wall if they didn't help!
