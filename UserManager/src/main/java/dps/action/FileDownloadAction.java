package dps.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

public class FileDownloadAction extends ActionSupport {
    private String inputPath;

    public void setInputPath(final String value) {
        inputPath = value;
    }

    public InputStream getTargetFile() throws Exception {
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
}
