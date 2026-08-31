package p175X0;

import android.content.ComponentName;
import android.content.Context;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: X0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1929g {

    /* JADX INFO: renamed from: a */
    private static final String f6376a = AbstractC1097j.m4846f("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m7977a(Context context, Class cls, boolean z7) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z7 ? 1 : 2, 1);
            AbstractC1097j.m4844c().mo4847a(f6376a, String.format("%s %s", cls.getName(), z7 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e7) {
            AbstractC1097j.m4844c().mo4847a(f6376a, String.format("%s could not be %s", cls.getName(), z7 ? "enabled" : "disabled"), e7);
        }
    }
}
