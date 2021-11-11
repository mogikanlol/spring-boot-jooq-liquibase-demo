/*
 * This file is generated by jOOQ.
 */
package com.example.app.jooq.model.tables.records;


import com.example.app.jooq.model.tables.Game;
import com.example.app.jooq.model.tables.pojos.GamePojo;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameRecord extends UpdatableRecordImpl<GameRecord> implements Record2<UUID, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.game.id</code>.
     */
    public GameRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.game.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.game.title</code>.
     */
    public GameRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.game.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Game.GAME.ID;
    }

    @Override
    public Field<String> field2() {
        return Game.GAME.TITLE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public GameRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public GameRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public GameRecord values(UUID value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GameRecord
     */
    public GameRecord() {
        super(Game.GAME);
    }

    /**
     * Create a detached, initialised GameRecord
     */
    public GameRecord(UUID id, String title) {
        super(Game.GAME);

        setId(id);
        setTitle(title);
    }

    /**
     * Create a detached, initialised GameRecord
     */
    public GameRecord(GamePojo value) {
        super(Game.GAME);

        if (value != null) {
            setId(value.getId());
            setTitle(value.getTitle());
        }
    }
}
