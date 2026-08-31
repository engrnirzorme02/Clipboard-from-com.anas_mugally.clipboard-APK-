package p026D0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: D0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0173d {

    /* JADX INFO: renamed from: a */
    public static final C0173d f817a = new C0173d();

    private C0173d() {
    }

    /* JADX INFO: renamed from: a */
    public static final File m874a(Context context) {
        AbstractC6118n.m27187e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC6118n.m27186d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
