package poojab26.volleytest.Model;

/**
 * Created by pblead26 on 15-May-17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseList {

    @SerializedName("inString")
    @Expose
    private String inString;
    @SerializedName("outString")
    @Expose
    private List<String> outString = null;

    public String getInString() {
        return inString;
    }

    public void setInString(String inString) {
        this.inString = inString;
    }

    public List<String> getOutString() {
        return outString;
    }

    public void setOutString(List<String> outString) {
        this.outString = outString;
    }


}
