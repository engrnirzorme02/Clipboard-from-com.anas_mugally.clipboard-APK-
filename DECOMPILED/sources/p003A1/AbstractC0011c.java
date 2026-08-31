package p003A1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: A1.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0011c {

    /* JADX INFO: renamed from: a */
    static final Charset f79a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    static final Charset f80b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    static void m77a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static void m78b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m78b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
