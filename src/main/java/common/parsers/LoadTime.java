package common.parsers;

/**
 * Created by matcievskiy on 03.04.2015.
 */
public class LoadTime {
    private Long load_time;
    private String page_name;

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public long getLoad_time() {
        return load_time;
    }

    public void setLoad_time(long load_time) {
        this.load_time = load_time;
    }
}
