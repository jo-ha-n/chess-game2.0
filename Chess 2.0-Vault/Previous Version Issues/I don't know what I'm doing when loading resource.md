#old_issue 
I don't how you would load the resource for the first time, what I did is a combination of loading and assigning the resource in a static variable or just passing down the object itself across the code base. And

```java
public class FontHandler {  
    private static Font font;  
  
  
    public void loadFont(String name){  
        if(font != null) {  
            return;  
        }  
  
        try {  
            font = Font.createFont(  
                    Font.TRUETYPE_FONT, ResourceHandler.loadDynamicPath("fonts/" + name)  
            );  
        } catch (IOException e) {  
            throw new RuntimeException("Font not found: " + name);  
        } catch (FontFormatException e) {  
            throw new RuntimeException(e);  
        }  
    }  
  
    public Font getFont(int size) {  
        return font.deriveFont(Font.PLAIN, size);  
    }  
}
```

`loadFont()` loads the font but to use the method `getFont()` you need to make an instance of the class.

