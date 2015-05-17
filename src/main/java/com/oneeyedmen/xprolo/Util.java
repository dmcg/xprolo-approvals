package com.oneeyedmen.xprolo;

import com.google.common.base.Charsets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Util {
    public static String readFileToString(File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()), Charsets.UTF_8);
    }
}
