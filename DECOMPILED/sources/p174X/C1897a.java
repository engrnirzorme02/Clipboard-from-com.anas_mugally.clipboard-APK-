package p174X;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
final class C1897a {

    /* JADX INFO: renamed from: a */
    public static final C1897a f6103a = new C1897a();

    private C1897a() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7833a(File srcFile, File dstFile) {
        AbstractC6118n.m27187e(srcFile, "srcFile");
        AbstractC6118n.m27187e(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
