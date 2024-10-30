// @ID: 168775d9-1205-4285-99bf-2f69c05627e6
// @Name: Взять текст из буфера обмена
// @Contract: UNIT_OUT
// @Engine: Groovy
// @D: Входные - нет
// @D: Выходные - текст из буфера обмена

import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor

(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor)