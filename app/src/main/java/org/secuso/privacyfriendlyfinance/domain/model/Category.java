/*
 Privacy Friendly Finance Manager is licensed under the GPLv3.
 Copyright (C) 2019 Leonard Otto, Felix Hofmann

 This program is free software: you can redistribute it and/or modify it under the terms of the GNU
 General Public License as published by the Free Software Foundation, either version 3 of the
 License, or (at your option) any later version.
 This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along with this program.
 If not, see http://www.gnu.org/licenses/.

 Additionally icons from Google Design Material Icons are used that are licensed under Apache
 License Version 2.0.
 */

package org.secuso.privacyfriendlyfinance.domain.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;

import org.secuso.privacyfriendlyfinance.domain.model.common.NameWithIdProvider;

/**
 * Category entity.
 *
 * @author Felix Hofmann
 * @author Leonard Otto
 */
@Entity(
    tableName = "Category",
    inheritSuperIndices = true,
    indices = @Index(value = "name", unique = true)
)
public class Category extends AbstractEntity implements NameWithIdProvider {
    private String name;
    private Long budget;
    private Integer color;

    public Category() {}
    @Ignore
    public Category(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }
    public Integer getColor() {
        return color;
    }
    public void setColor(Integer color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}
