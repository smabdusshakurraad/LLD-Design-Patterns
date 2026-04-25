public class WindowFactory implements Ifactory{
    @Override
    public IButton createButton() {
        return new WindowButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowTexBox();
    }
}
