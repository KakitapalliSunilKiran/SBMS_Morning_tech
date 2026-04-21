package com.example.testapp.service;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {

        String prefix = "TCS_";

        Integer nextId = session.doReturningWork(connection -> {
            try (Statement stmt = connection.createStatement()) {

                ResultSet rs = stmt.executeQuery("SELECT MAX(id) FROM student");

                if (rs.next() && rs.getString(1) != null) {
                    String lastId = rs.getString(1); // TCS_105
                    int num = Integer.parseInt(lastId.split("_")[1]);
                    return num + 1;
                }

            }
            return 1;
        });

        return prefix + nextId;
    }
}