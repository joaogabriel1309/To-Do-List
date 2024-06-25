package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private boolean accomplished;
    private int priority;

    public Todo(String name, String description, boolean accomplished, int priority) {
        this.name = name;
        this.description = description;
        this.accomplished = accomplished;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAccomplished() {
        return accomplished;
    }

    public void setAccomplished(boolean accomplished) {
        this.accomplished = accomplished;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
