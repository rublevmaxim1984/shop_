/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2018 VTB Group. All rights reserved.
 */

package ru.shop.Utils;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

import static ru.shop.Utils.CommonConstants.UNDERSCORE;

/**
 * Shop prefixing naming strategy.
 *
 * @author Maksim_Zhirin
 */
@Slf4j
public class ShopNamingStrategy extends SpringPhysicalNamingStrategy {

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        String nameText = name.getText();
        String tableName =
                nameText.startsWith(getPrefix(jdbcEnvironment)) ? nameText : getPrefix(jdbcEnvironment) + nameText;
        return super.toPhysicalTableName(Identifier.toIdentifier(tableName), jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return super.toPhysicalSequenceName(Identifier.toIdentifier(
                getPrefix(jdbcEnvironment) + name.getText()), jdbcEnvironment);
    }

    private String getPrefix(JdbcEnvironment jdbcEnvironment) {
        return jdbcEnvironment.getCurrentSchema().getText() + UNDERSCORE;
    }
}
