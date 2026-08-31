package p096L6;

import android.content.Context;
import androidx.core.content.AbstractC2436b;

/* JADX INFO: renamed from: L6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0855a {
    /* JADX INFO: renamed from: a */
    public static boolean m3967a(Context context, String... strArr) {
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (AbstractC2436b.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
