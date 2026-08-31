package p045F3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbbn;
import p065I.AbstractC0577a;

/* JADX INFO: renamed from: F3.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0430j {
    /* JADX INFO: renamed from: a */
    public static Typeface m1856a(Context context, Typeface typeface) {
        return m1857b(context.getResources().getConfiguration(), typeface);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m1857b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0577a.m2541b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, zzbbn.zzq.zzf), typeface.isItalic());
    }
}
