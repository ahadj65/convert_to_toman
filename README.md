# Convert To Toman (تومن)

## 📌 Introduction
In Iran, the official currency unit is the rial, but in daily life, people mostly deal with toman. This difference often causes confusion for users, especially when they need to enter or view an amount.
In many financial, accounting, payment systems, or even stores, users input numbers in rials but expect to see or check the equivalent in toman. This library is developed specifically for this purpose: to allow easy and quick entry of rial numbers and display their equivalent in toman (both numerically and in words) in the Jetpack Compose environment.

## 🚀 Installation
To use this library, you need to add JitPack as a repository and then include the dependency in your module.

🔧 Step 1: Add JitPack to your project-level settings.gradle
🕰️ For older Gradle versions (Groovy DSL):


```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

🆕 For newer Gradle versions (Kotlin DSL):

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io") // Add JitPack
    }
}
```


📦 Step 2: Add the library to your module-level dependencies
🕰️ For Groovy (older Gradle files):

```
dependencies {
    implementation 'com.github.ahadj65:convert_to_toman:v0.1'
}
```

🆕 For Kotlin DSL (newer Gradle files):

```
dependencies {
    implementation("com.github.ahadj65:convert_to_toman:v0.1")
}
```




✅ Quick Usage
This library provides two main components for numeric input:

  🟠 **TomanTextField**

  🟠 **TomanOutlinedTextField**
  

These components offer the following features:

**Automatic conversion of rial to toman**

**Displaying the number in Persian words**

**Formatting the numeric input**

**Direct use in Jetpack Compose**






## 🔧 **Parameters** (Four main sections)

🔹 1. Library-specific Parameters (Core)
| First Header  | Type | Description |
| ------------- | ------------- | ------------- |
| showTextOnlyOnFocus  | Boolean  | Show the toman text only when focused? (default: false)  |

🔹 2. TextField-specific Parameters

| First Header  | Type | Description |
| ------------- | ------------- | ------------- |
| value  | String  | Numeric input value (in rial)  |
| onValueChange  | (String) -> Unit  | Function executed when the input value changes  |
| showTextOnlyOnFocus  | Boolean  | Show the toman text only when focused? (default: false)  |
| modifier  | Modifier  | Style and size of the component  |
| enabled  | Boolean  | Field input is enabled or not  |
| readOnly  | Boolean  | Field is read-only  |
| textStyle  | TextStyle  | General text style  |
| label, placeholder  | @Composable  | Label or placeholder text  |
| leadingIcon, trailingIcon  | @Composable  | Leading/Trailing icons of the field  |
| prefix, suffix  | @Composable  | Prefix or suffix (e.g., "rial")  |
| supportingText  | @Composable  | Supporting text under the field  |
| isError  | @Composable  | Supporting  |
| visualTransformation  | VisualTransformation  | For input hiding or specific formatting  |
| keyboardOptions  | @Composable  | Keyboard settings like KeyboardType.Number  |
| singleLine  | Boolean  | Single-line input |
| maxLines, minLines  | Int | Maximum and minimum lines  |
| interactionSource  | MutableInteractionSource  | Manage user interactions (focus, clicks, etc.)  |
| shape  | Shape  | Field appearance shape (rounded, square, etc.)  |
| colors  | TextFieldColors  | General field colors  |


🔹 3. Text parameters (Show Toman Text)
| First Header  | Type | Description |
| ------------- | ------------- | ------------- |
| textModifier  | Modifier  | Set position or size of the text  |
| textColor  | Color  | Text color  |
| textFontSize  | TextUnit	  | Font size  |
| textFontStyle  | FontStyle?  | Font style (italic, etc.) |
| textFontWeight  | FontWeight?  | Font weight |
| textFontFamily  | FontFamily?  | 	Font family  |
| textLetterSpacing  | TextUnit  | Letter spacing  |
| textLetterSpacing	  | TextUnit  | Letter spacing  |
| textTextDecoration  | TextDecoration?  | Text decoration like underline  |
| textTextAlign  | TextAlign?  | Text alignment (left, right, center)  |
| textLineHeight  | TextOverflow  | Text overflow behavior  |
| textSoftWrap  | Boolean  | Soft wrap text at line end  |
| textMaxLines, textMinLines  | Int  | Max/Min lines for text display  |
| textOnTextLayout  | (TextLayoutResult) -> Unit  | Callback for text layout completion  |
| textModifier  | Modifier  | Show  |
| textTextStyle  | TextStyle  | Full text style  |

 
🔹 4. Column-related Parameters (Root)
| First Header  | Type | Description |
| ------------- | ------------- | ------------- |
| columnModifier  | Modifier  | Overall settings for column, including the field and toman text  |
| columnRootVerticalArrangement  | Arrangement.Vertical  | Vertical arrangement of elements  |
| columnHorizontalAlignment  | Alignment.Horizontal  | Horizontal alignment of elements inside the column  |



## 🔁 Direct Use of convertToToman Function
If you only want to convert a number (e.g., from a server or database) to toman without needing a UI, you can directly use the convertToToman function:

```
val output = convertToToman("150000")
// Numeric output: "۱۵۰۰۰ تومان"
// Output in words: "پانزده هزار تومان"
```

This function automatically converts the number from rial to toman and returns both the formatted number and its Persian equivalent.

🧪 Simple Example:

```
@Composable
fun ExampleUsage() {
    var amount by remember { mutableStateOf("") }

    TomanOutlinedTextField(
        value = amount,
        onValueChange = { amount = it },
        label = { Text("مبلغ (ریال)") },
        placeholder = { Text("مثلاً 100000") },
        showTextOnlyOnFocus = true, // Show toman only when focused
        textFontSize = 16.sp,
        textFontWeight = FontWeight.Bold
    )
}
```
