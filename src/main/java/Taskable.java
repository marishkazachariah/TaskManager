public interface Taskable {
    String getTitle();
    String getDescription();
    int getPriority();
    String getStatus();

    void setTitle(String title);
    void setDescription(String description);
    void setPriority(int priority);
    void setStatus(String status);
}
