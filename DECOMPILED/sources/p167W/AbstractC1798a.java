package p167W;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1798a {
    /* JADX INFO: renamed from: a */
    public static final File m7509a(Context context, String fileName) {
        AbstractC6118n.m27187e(context, "<this>");
        AbstractC6118n.m27187e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
