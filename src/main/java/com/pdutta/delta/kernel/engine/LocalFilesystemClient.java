package com.pdutta.delta.kernel.engine;

import io.delta.kernel.engine.FileSystemClient;
import io.delta.kernel.internal.util.Utils;
import io.delta.kernel.utils.CloseableIterator;
import io.delta.kernel.utils.FileStatus;
import java.io.IOException

public class LocalFileSystemClient implements FileSystemClient {
  @Override
  public boolean mkdirs(String path) throws IOException {
    return true;
  }
}