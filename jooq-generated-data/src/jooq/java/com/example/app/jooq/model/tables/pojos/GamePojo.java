/*
 * This file is generated by jOOQ.
 */
package com.example.app.jooq.model.tables.pojos;


import java.io.Serializable;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GamePojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID   id;
    private String title;

    public GamePojo() {}

    public GamePojo(GamePojo value) {
        this.id = value.id;
        this.title = value.title;
    }

    public GamePojo(
        UUID   id,
        String title
    ) {
        this.id = id;
        this.title = title;
    }

    /**
     * Getter for <code>public.game.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.game.id</code>.
     */
    public GamePojo setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.game.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>public.game.title</code>.
     */
    public GamePojo setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GamePojo (");

        sb.append(id);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}
