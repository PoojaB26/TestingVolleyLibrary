
package poojab26.volleytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Reverie {

    @SerializedName("responseList")
    @Expose
    private List<ResponseList> responseList = null;

    public List<ResponseList> getResponseList() {
        return responseList;
    }

    public void setResponseList(List<ResponseList> responseList) {
        this.responseList = responseList;
    }

}
