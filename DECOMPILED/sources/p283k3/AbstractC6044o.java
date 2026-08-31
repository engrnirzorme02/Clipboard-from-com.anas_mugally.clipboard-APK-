package p283k3;

import android.content.Context;
import android.content.res.Resources;
import p170W2.AbstractC1847l;

/* JADX INFO: renamed from: k3.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6044o {
    /* JADX INFO: renamed from: a */
    public static String m27050a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC1847l.f6000a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m27051b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Boolean m27052c(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
