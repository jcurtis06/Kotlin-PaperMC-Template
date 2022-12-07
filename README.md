![kotlingradlepaper](https://user-images.githubusercontent.com/77545656/206234518-99eeb3d6-b1cd-42f5-adcc-6a994d600624.png)
<h1 align="center">
A template for PaperMC plugins using Gradle + Kotlin
</h1>

### Usage
- Open the project in IntelliJ
- Run `gradle build`
- Two `.jar` files should be outputted. One ends with `-all`, and the other does not. Use the one ending in `-all` if you are not depending on another Kotlin plugin (see below)

### About
I created this after struggling for days with getting Kotlin to work properly with Paper/Spigot. This is an *almost* foolproof setup.

I'd like to note that I am by no means a professional at using Gradle. This might not be the best way to do things, but it works great for me.

### Depending on other Kotlin plugins
With this setup, depending on other Kotlin Minecraft plugins will more than likely result in issues; specifically **`LinkageErrors`**

To fix this, simply remove Kotlin entirely from `build.gradle`, since the depending plugin should already supply `kotlin stdlib`

You can also just opt to use the `.jar` file that **does not** contain `-all` in the name.

### Special thanks
I want to thank the people on the PaperMC Discord server for helping me get this going. I probably would be left banging my head against a wall if they didn't help!
