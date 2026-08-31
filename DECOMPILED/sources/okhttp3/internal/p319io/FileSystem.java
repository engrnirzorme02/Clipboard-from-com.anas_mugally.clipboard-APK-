package okhttp3.internal.p319io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.AbstractC0659p;
import p072I6.AbstractC0660q;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0669z;

/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25975a = new Companion();

        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: a */
            public InterfaceC0640B mo29335a(File file) {
                AbstractC6118n.m27187e(file, "file");
                return AbstractC0659p.m3138j(file);
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: b */
            public InterfaceC0669z mo29336b(File file) {
                AbstractC6118n.m27187e(file, "file");
                try {
                    return AbstractC0660q.m3147g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return AbstractC0660q.m3147g(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: c */
            public void mo29337c(File directory) throws IOException {
                AbstractC6118n.m27187e(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        AbstractC6118n.m27186d(file, "file");
                        mo29337c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: d */
            public boolean mo29338d(File file) {
                AbstractC6118n.m27187e(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: e */
            public void mo29339e(File from, File to) throws IOException {
                AbstractC6118n.m27187e(from, "from");
                AbstractC6118n.m27187e(to, "to");
                mo29340f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: f */
            public void mo29340f(File file) throws IOException {
                AbstractC6118n.m27187e(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: g */
            public InterfaceC0669z mo29341g(File file) {
                AbstractC6118n.m27187e(file, "file");
                try {
                    return AbstractC0659p.m3129a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return AbstractC0659p.m3129a(file);
                }
            }

            @Override // okhttp3.internal.p319io.FileSystem
            /* JADX INFO: renamed from: h */
            public long mo29342h(File file) {
                AbstractC6118n.m27187e(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0640B mo29335a(File file);

    /* JADX INFO: renamed from: b */
    InterfaceC0669z mo29336b(File file);

    /* JADX INFO: renamed from: c */
    void mo29337c(File file);

    /* JADX INFO: renamed from: d */
    boolean mo29338d(File file);

    /* JADX INFO: renamed from: e */
    void mo29339e(File file, File file2);

    /* JADX INFO: renamed from: f */
    void mo29340f(File file);

    /* JADX INFO: renamed from: g */
    InterfaceC0669z mo29341g(File file);

    /* JADX INFO: renamed from: h */
    long mo29342h(File file);
}
