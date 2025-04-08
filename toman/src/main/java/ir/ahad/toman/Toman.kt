package ir.ahad.toman

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp


/**
 * Created by ahad on 4/3/2025.
 */

@Composable
fun TomanTextField(

    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors = TextFieldDefaults.colors(),

    textModifier: Modifier = Modifier,
    textColor: Color = Color.Unspecified,
    textFontSize: TextUnit = TextUnit.Unspecified,
    textFontStyle: FontStyle? = null,
    textFontWeight: FontWeight? = null,
    textFontFamily: FontFamily? = null,
    textLetterSpacing: TextUnit = TextUnit.Unspecified,
    textTextDecoration: TextDecoration? = null,
    textTextAlign: TextAlign? = null,
    textLineHeight: TextUnit = TextUnit.Unspecified,
    textOverflow: TextOverflow = TextOverflow.Clip,
    textSoftWrap: Boolean = true,
    textMaxLines: Int = Int.MAX_VALUE,
    textMinLines: Int = 1,
    textOnTextLayout: ((TextLayoutResult) -> Unit)? = null,
    textTextStyle: TextStyle = LocalTextStyle.current,

    columnModifier: Modifier = Modifier,
    columnRootVerticalArrangement: Arrangement.Vertical = Arrangement.Top,
    columnHorizontalAlignment: Alignment.Horizontal = Alignment.Start,

    showTextOnlyOnFocus: Boolean = false,

    ) {
    TomanTextFieldBase(
        false,
        value,
        onValueChange,
        modifier,
        enabled,
        readOnly,
        textStyle,
        label,
        placeholder,
        leadingIcon,
        trailingIcon,
        prefix,
        suffix,
        supportingText,
        isError,
        visualTransformation,
        keyboardOptions,
        keyboardActions,
        singleLine,
        maxLines,
        minLines,
        interactionSource,
        shape,
        colors,

        textModifier,
        textColor,
        textFontSize,
        textFontStyle,
        textFontWeight,
        textFontFamily,
        textLetterSpacing,
        textTextDecoration,
        textTextAlign,
        textLineHeight,
        textOverflow,
        textSoftWrap,
        textMaxLines,
        textMinLines,
        textOnTextLayout,
        textTextStyle,

        columnModifier,
        columnRootVerticalArrangement,
        columnHorizontalAlignment,

        showTextOnlyOnFocus,
    )

}

@Composable
fun TomanOutlinedTextField(

    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors = TextFieldDefaults.colors(),

    textModifier: Modifier = Modifier,
    textColor: Color = Color.Unspecified,
    textFontSize: TextUnit = TextUnit.Unspecified,
    textFontStyle: FontStyle? = null,
    textFontWeight: FontWeight? = null,
    textFontFamily: FontFamily? = null,
    textLetterSpacing: TextUnit = TextUnit.Unspecified,
    textTextDecoration: TextDecoration? = null,
    textTextAlign: TextAlign? = null,
    textLineHeight: TextUnit = TextUnit.Unspecified,
    textOverflow: TextOverflow = TextOverflow.Clip,
    textSoftWrap: Boolean = true,
    textMaxLines: Int = Int.MAX_VALUE,
    textMinLines: Int = 1,
    textOnTextLayout: ((TextLayoutResult) -> Unit)? = null,
    textTextStyle: TextStyle = LocalTextStyle.current,

    columnModifier: Modifier = Modifier,
    columnRootVerticalArrangement: Arrangement.Vertical = Arrangement.Top,
    columnHorizontalAlignment: Alignment.Horizontal = Alignment.Start,

    showTextOnlyOnFocus: Boolean = true,

    ) {
    TomanTextFieldBase(
        true,
        value,
        onValueChange,
        modifier,
        enabled,
        readOnly,
        textStyle,
        label,
        placeholder,
        leadingIcon,
        trailingIcon,
        prefix,
        suffix,
        supportingText,
        isError,
        visualTransformation,
        keyboardOptions,
        keyboardActions,
        singleLine,
        maxLines,
        minLines,
        interactionSource,
        shape,
        colors,
        textModifier,
        textColor,
        textFontSize,
        textFontStyle,
        textFontWeight,
        textFontFamily,
        textLetterSpacing,
        textTextDecoration,
        textTextAlign,
        textLineHeight,
        textOverflow,
        textSoftWrap,
        textMaxLines,
        textMinLines,
        textOnTextLayout,
        textTextStyle,
        columnModifier,
        columnRootVerticalArrangement,
        columnHorizontalAlignment,
        showTextOnlyOnFocus,
    )

}

@Composable
private fun TomanTextFieldBase(

    isOutLine: Boolean,

    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = TextFieldDefaults.shape,
    colors: TextFieldColors = TextFieldDefaults.colors(),

    textModifier: Modifier = Modifier,
    textColor: Color = Color.Unspecified,
    textFontSize: TextUnit = TextUnit.Unspecified,
    textFontStyle: FontStyle? = null,
    textFontWeight: FontWeight? = null,
    textFontFamily: FontFamily? = null,
    textLetterSpacing: TextUnit = TextUnit.Unspecified,
    textTextDecoration: TextDecoration? = null,
    textTextAlign: TextAlign? = null,
    textLineHeight: TextUnit = TextUnit.Unspecified,
    textOverflow: TextOverflow = TextOverflow.Clip,
    textSoftWrap: Boolean = true,
    textMaxLines: Int = Int.MAX_VALUE,
    textMinLines: Int = 1,
    textOnTextLayout: ((TextLayoutResult) -> Unit)? = null,
    textTextStyle: TextStyle = LocalTextStyle.current,

    columnModifier: Modifier = Modifier,
    columnRootVerticalArrangement: Arrangement.Vertical = Arrangement.Top,
    columnHorizontalAlignment: Alignment.Horizontal = Alignment.Start,
    showTextOnlyOnFocus: Boolean = true,
) {
    var isFocused by remember { mutableStateOf(false) }
    val maxAllowedValue = 1_000_000_000_000_000L

    // استفاده از rememberUpdatedState برای تطبیق با value از بیرون
    var internalTextFieldValue by remember(value) {
        mutableStateOf(
            TextFieldValue(
                text = formatNumberWithCommas(value),
                selection = TextRange(formatNumberWithCommas(value).length)
            )
        )
    }

    var convertedText by remember(value) {
        mutableStateOf(convertToToman(value.replace(",", "")))
    }

    Column(
        modifier = columnModifier,
        verticalArrangement = columnRootVerticalArrangement,
        horizontalAlignment = columnHorizontalAlignment
    ) {
        if (isOutLine) {
            OutlinedTextField(
                value = internalTextFieldValue,
                onValueChange = { inputValue ->
                    val cleanInput = inputValue.text.replace(",", "")
                    val oldCursorPosition = inputValue.selection.start

                    if (cleanInput.isEmpty()) {
                        internalTextFieldValue = TextFieldValue("")
                        convertedText = ""
                        onValueChange("")
                        return@OutlinedTextField
                    }

                    val number = cleanInput.toLongOrNull()
                    if (number != null && number <= maxAllowedValue) {
                        val newFormattedText = formatNumberWithCommas(cleanInput)

                        val commaCountBefore = internalTextFieldValue.text.count { it == ',' }
                        val commaCountAfter = newFormattedText.count { it == ',' }
                        val cursorOffset = commaCountAfter - commaCountBefore

                        val newCursorPosition = (oldCursorPosition + cursorOffset)
                            .coerceIn(0, newFormattedText.length)

                        val newValue = TextFieldValue(
                            text = newFormattedText,
                            selection = TextRange(newCursorPosition)
                        )

                        internalTextFieldValue = newValue
                        convertedText = convertToToman(cleanInput)
                        onValueChange(newFormattedText)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .onFocusChanged { isFocused = it.isFocused },
                enabled = enabled,
                readOnly = readOnly,
                textStyle = textStyle,
                label = label,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                prefix = prefix,
                suffix = suffix,
                supportingText = supportingText,
                isError = isError,
                visualTransformation = visualTransformation,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                keyboardActions = keyboardActions,
                singleLine = singleLine,
                maxLines = maxLines,
                minLines = minLines,
                interactionSource = interactionSource,
                shape = shape,
                colors = colors,
            )
        } else {
            TextField(
                value = internalTextFieldValue,
                onValueChange = { inputValue ->
                    val cleanInput = inputValue.text.replace(",", "")
                    val oldCursorPosition = inputValue.selection.start

                    if (cleanInput.isEmpty()) {
                        internalTextFieldValue = TextFieldValue("")
                        convertedText = ""
                        onValueChange("")
                        return@TextField
                    }

                    val number = cleanInput.toLongOrNull()
                    if (number != null && number <= maxAllowedValue) {
                        val newFormattedText = formatNumberWithCommas(cleanInput)

                        val commaCountBefore = internalTextFieldValue.text.count { it == ',' }
                        val commaCountAfter = newFormattedText.count { it == ',' }
                        val cursorOffset = commaCountAfter - commaCountBefore

                        val newCursorPosition = (oldCursorPosition + cursorOffset)
                            .coerceIn(0, newFormattedText.length)

                        val newValue = TextFieldValue(
                            text = newFormattedText,
                            selection = TextRange(newCursorPosition)
                        )

                        internalTextFieldValue = newValue
                        convertedText = convertToToman(cleanInput)
                        onValueChange(newFormattedText)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .onFocusChanged { isFocused = it.isFocused },
                enabled = enabled,
                readOnly = readOnly,
                textStyle = textStyle,
                label = label,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                prefix = prefix,
                suffix = suffix,
                supportingText = supportingText,
                isError = isError,
                visualTransformation = visualTransformation,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                keyboardActions = keyboardActions,
                singleLine = singleLine,
                maxLines = maxLines,
                minLines = minLines,
                interactionSource = interactionSource,
                shape = shape,
                colors = colors,
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        if (!showTextOnlyOnFocus || isFocused) {
            Text(
                text = convertedText,
                modifier = textModifier,
                color = textColor,
                fontSize = textFontSize,
                fontStyle = textFontStyle,
                fontWeight = textFontWeight,
                fontFamily = textFontFamily,
                letterSpacing = textLetterSpacing,
                textDecoration = textTextDecoration,
                textAlign = textTextAlign,
                lineHeight = textLineHeight,
                overflow = textOverflow,
                softWrap = textSoftWrap,
                maxLines = textMaxLines,
                minLines = textMinLines,
                onTextLayout = textOnTextLayout ?: {},
                style = textTextStyle
            )
        }
    }
}

private fun formatNumberWithCommas(input: String): String {
    return input.toLongOrNull()?.let { "%,d".format(it) } ?: input
}

fun convertToToman(input: String): String {
    val number = input.toLongOrNull() ?: return ""
    return when {
        number < 10 -> "${convertNumberToWords(number)} ریال"
        number % 10 == 0L -> "${convertNumberToWords(number / 10)} تومان"
        else -> {
            val toman = number / 10
            val rial = number % 10
            "${convertNumberToWords(toman)} تومان و ${convertNumberToWords(rial)} ریال"
        }
    }
}

private fun convertNumberToWords(number: Long): String {
    if (number == 0L) return "صفر"

    val thousands = arrayOf("", "هزار", "میلیون", "میلیارد", "تریلیون")
    var num = number
    var wordsList = mutableListOf<String>()
    var thousandIndex = 0

    while (num > 0) {
        val chunk = (num % 1000).toInt()
        if (chunk > 0) {
            val chunkWords = convertThreeDigitNumberToWords(chunk)
            val section =
                if (thousandIndex > 0) "${chunkWords} ${thousands[thousandIndex]}" else chunkWords
            wordsList.add(0, section)
        }
        num /= 1000
        thousandIndex++
    }

    return wordsList.joinToString(" و ")
}

private fun convertThreeDigitNumberToWords(number: Int): String {
    val units = arrayOf("", "یک", "دو", "سه", "چهار", "پنج", "شش", "هفت", "هشت", "نه")
    val teens = arrayOf(
        "ده",
        "یازده",
        "دوازده",
        "سیزده",
        "چهارده",
        "پانزده",
        "شانزده",
        "هفده",
        "هجده",
        "نوزده"
    )
    val tens = arrayOf("", "", "بیست", "سی", "چهل", "پنجاه", "شصت", "هفتاد", "هشتاد", "نود")
    val hundreds =
        arrayOf("", "صد", "دویست", "سیصد", "چهارصد", "پانصد", "ششصد", "هفتصد", "هشتصد", "نهصد")

    val hundred = number / 100
    val ten = (number % 100) / 10
    val unit = number % 10

    val words = mutableListOf<String>()

    if (hundred > 0) words.add(hundreds[hundred])
    if (ten == 1) {
        words.add(teens[unit])
    } else {
        if (ten > 1) words.add(tens[ten])
        if (unit > 0) words.add(units[unit])
    }

    return words.joinToString(" و ")
}
