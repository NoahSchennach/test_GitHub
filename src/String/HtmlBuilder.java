package String;

public class HtmlBuilder {

	public static String htmlElement(String tag, String body) {
		if (tag == null || tag.isEmpty()) {
            return body;
        }

        if (body == null) {
            body = "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<" + tag + ">");
        sb.append(body);
        sb.append("</" + tag + ">");

        return sb.toString();
    }
	
	public static String strong(String str) {
		return htmlElement("strong",str);
	}
	
	public static String empathize(String str) {
		return htmlElement("em", str);
	}
	
	public static void main(String[] args) {
	
		System.out.println(htmlElement("strong", "strong is bold"));
		System.out.println(strong(empathize("strong + emphatize")));
		System.out.println(htmlElement("","no"));
	}

}
