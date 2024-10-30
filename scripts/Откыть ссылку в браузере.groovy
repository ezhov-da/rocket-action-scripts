// @ID: f5f69e68-23bc-4ccb-b667-d007ff23bb0e
// @Name: Открытие ссылки в браузере
// @Contract: IN_UNIT
// @Engine: Groovy
// @D: Входной - ссылка для открытия.

import java.awt.*

if (Desktop.desktopSupported) {
    Desktop.desktop.browse(_INPUT.toURI())
}