package p017C;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: C.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0117r {
    /* JADX INFO: renamed from: a */
    static int m563a(boolean z7, int i7) {
        int i8;
        if (!z7) {
            i8 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i7;
            }
            i8 = 33554432;
        }
        return i8 | i7;
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m564b(Context context, int i7, Intent intent, int i8, boolean z7) {
        return PendingIntent.getActivity(context, i7, intent, m563a(z7, i8));
    }
}
