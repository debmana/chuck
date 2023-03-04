package com.deborasroka;

public class Joke {
	private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;
    private String[] categories;
    

     /**
     * @return the categories
     */
    public String[] getCategories() {
         return categories;
        
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(String[] categories) {
         this.categories = categories;
    }    

    /**
     * @return the created_at
     */
    public String getCreated_at() {
         return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
         this.created_at = created_at;
    }

    /**
     * @return the icon_url
     */
    public String getIcon_url() {
         return icon_url;
    }

    /**
     * @param icon_url the icon_url to set
     */
    public void setIcon_url(String icon_url) {
         this.icon_url = icon_url;
    }

    /**
     * @return the id
     */
    public String getId() {
         return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
         this.id = id;
    }

    /**
     * @return the updated_at
     */
    public String getUpdated_at() {
         return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(String updated_at) {
         this.updated_at = updated_at;
    }

    /**
     * @return the url
     */
    public String getUrl() {
         return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
         this.url = url;
    }

    /**
     * @return the value
     */
    public String getValue() {
         return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
         this.value = value;
    }

}
