package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: androidx.emoji2.text.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2560h {

    /* JADX INFO: renamed from: androidx.emoji2.text.h$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static Set<int[]> m11779a() {
            return b.m11780a();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.h$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static Set m11780a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static Set m11778a() {
        return Build.VERSION.SDK_INT >= 34 ? a.m11779a() : b.m11780a();
    }
}
