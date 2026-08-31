package p174X;

import java.io.File;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1918v {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC1916t m7927a(File file) {
        AbstractC6118n.m27187e(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC6118n.m27186d(absolutePath, "file.canonicalFile.absolutePath");
        return AbstractC1917u.m7926a(absolutePath);
    }
}
