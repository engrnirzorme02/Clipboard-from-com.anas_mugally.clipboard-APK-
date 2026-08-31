package androidx.core.content;

import android.content.Context;
import android.os.Process;
import p017C.AbstractC0105f;
import p104N.AbstractC0905b;

/* JADX INFO: renamed from: androidx.core.content.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2439e {
    /* JADX INFO: renamed from: a */
    public static int m10599a(Context context, String str, int i7, int i8, String str2) {
        if (context.checkPermission(str, i7, i8) == -1) {
            return -1;
        }
        String strM410c = AbstractC0105f.m410c(str);
        if (strM410c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i8);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i8 || !AbstractC0905b.m4125a(context.getPackageName(), str2)) ? AbstractC0105f.m409b(context, strM410c, str2) : AbstractC0105f.m408a(context, i8, strM410c, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: b */
    public static int m10600b(Context context, String str) {
        return m10599a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
