class ItalicTextDecorator(private val text: IText) : ITextDecorator {

    override fun getText(): String {
        return text.getText() + " :ITALIC"
    }
}