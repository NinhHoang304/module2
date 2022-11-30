package ss17_Binary_File_Serialization.product_manager_io_binary_file.service;

import java.io.IOException;
import java.util.List;

public interface IFileService<O>{
    List<O> readFileBinary(String path) throws ClassNotFoundException;

    void writeFileBinary(String path, List<O> products) throws IOException;
}
