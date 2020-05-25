/*
* source of inspiration for code : https://medium.com/@hermesmonteiro1981/decorator-pattern-when-to-use-identify-pattern-situation-481c5731bd76
* */
fun main(args: Array<String>) {
    val text = UnderlineTextDecorator(ItalicTextDecorator(BoldTextDecorator(HeadingText())))
    println(text.getText())

    val text2 = BoldTextDecorator(ItalicTextDecorator(ParagraphText()))
    println(text2.getText())
}