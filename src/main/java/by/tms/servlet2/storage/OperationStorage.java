package by.tms.servlet2.storage;

import by.tms.servlet2.entity.Operation;

import java.util.List;

public interface OperationStorage {
    public void save(Operation operation);

    public List<Operation> findAll();
}
