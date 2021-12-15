package com.example.swiftappstask.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.os.Parcelable;

public class Model implements Parcelable
{

    private Integer id;
    private String name;
    private String image;
    private String description;
    private Integer status;
    private String createdAt;
    private String updatedAt;
    private String nameAr;
    private String descriptionAr;
    private List<Model> buildingTypeUnits = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Model> CREATOR = new Creator<Model>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Model createFromParcel(android.os.Parcel in) {
            return new Model(in);
        }

        public Model[] newArray(int size) {
            return (new Model[size]);
        }

    }
            ;

    protected Model(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.nameAr = ((String) in.readValue((String.class.getClassLoader())));

        this.descriptionAr = ((String) in.readValue((String.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    public Model() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public List<Model> getBuildingTypeUnits() {
        return buildingTypeUnits;
    }

    public void setBuildingTypeUnits(List<Model> buildingTypeUnits) {
        this.buildingTypeUnits = buildingTypeUnits;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(image);
        dest.writeValue(description);
        dest.writeValue(status);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(nameAr);
        dest.writeValue(descriptionAr);
        dest.writeList(buildingTypeUnits);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
