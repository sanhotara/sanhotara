package Sourceclass;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.*;
// import javax.servlet.jsp.JspException;
// import javax.servlet.jsp.tagext.TagSupport;
public class MycustomTag extends TagSupport {
  
  public int doStartTag() throws JspException {
    int randomNum = (int)(Math.random() * 100);
    try {
      pageContext.getOut().write(Integer.toString(randomNum));
    } catch (Exception ex) {
      throw new JspException("Error: " + ex.getMessage());
    }
    return SKIP_BODY;
  }
}
