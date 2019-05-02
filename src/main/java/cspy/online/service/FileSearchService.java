package cspy.online.service;

import cspy.online.bean.SCFile;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.List;

/**
 * @author CSpy
 * @date 2019/4/27 9:22
 */
@Service
public interface FileSearchService {

    List<SCFile> searchByType(String type, String path);

    List<SCFile> getFileList(String path);
    List<SCFile> getDirectoryList(String path);
}
