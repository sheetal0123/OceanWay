package apis.json.samplecode1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Address {

    private String hno;
    private String block;
    private String area;
    private String state;
    private AddressGeo addressGeo;

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AddressGeo getAddressGeo() {
        return addressGeo;
    }

    public void setAddressGeo(AddressGeo addressGeo) {
        this.addressGeo = addressGeo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hno", hno).append("block", block).append("area", area).append("state", state).append("addressGeo", addressGeo).toString();
    }

}
