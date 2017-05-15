package poojab26.volleytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pblead26 on 15-May-17.
 */

public class Response {

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
