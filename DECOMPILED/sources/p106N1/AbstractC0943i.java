package p106N1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.C2268d;
import androidx.core.content.AbstractC2436b;
import p025D.AbstractC0165h;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: N1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0943i {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f3656a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m4191a(Context context, int i7, Resources.Theme theme) {
        return m4193c(context, context, i7, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m4192b(Context context, Context context2, int i7) {
        return m4193c(context, context2, i7, null);
    }

    /* JADX INFO: renamed from: c */
    private static Drawable m4193c(Context context, Context context2, int i7, Resources.Theme theme) {
        try {
            if (f3656a) {
                return m4195e(context2, i7, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e7) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e7;
            }
            return AbstractC2436b.getDrawable(context2, i7);
        } catch (NoClassDefFoundError unused2) {
            f3656a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m4194d(context2, i7, theme);
    }

    /* JADX INFO: renamed from: d */
    private static Drawable m4194d(Context context, int i7, Resources.Theme theme) {
        return AbstractC0165h.m813e(context.getResources(), i7, theme);
    }

    /* JADX INFO: renamed from: e */
    private static Drawable m4195e(Context context, int i7, Resources.Theme theme) {
        if (theme != null) {
            C2268d c2268d = new C2268d(context, theme);
            c2268d.m9381a(theme.getResources().getConfiguration());
            context = c2268d;
        }
        return AbstractC5659a.m25175b(context, i7);
    }
}
