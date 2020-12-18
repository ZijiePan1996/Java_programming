package ClassDemo.Design_Patterns;

public class MaskFactory {
    public Mask create(String type){
        switch(type){
            case "N95口罩":
                return new N95Mask();
            case "医用口罩":
                return new surgical_mask();
            default:
                throw new IllegalArgumentException("我们不卖这种口罩");
        }
    }
}
