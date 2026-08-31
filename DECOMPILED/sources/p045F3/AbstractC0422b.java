package p045F3;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;

/* JADX INFO: renamed from: F3.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0422b {
    /* JADX INFO: renamed from: a */
    public static TypedValue m1817a(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1818b(Context context, int i7, boolean z7) {
        TypedValue typedValueM1817a = m1817a(context, i7);
        if (typedValueM1817a == null || typedValueM1817a.type != 18) {
            return z7;
        }
        return typedValueM1817a.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m1819c(Context context, int i7, int i8) {
        TypedValue typedValueM1817a = m1817a(context, i7);
        return (int) ((typedValueM1817a == null || typedValueM1817a.type != 5) ? context.getResources().getDimension(i8) : typedValueM1817a.getDimension(context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: d */
    public static int m1820d(Context context, int i7, int i8) {
        TypedValue typedValueM1817a = m1817a(context, i7);
        return (typedValueM1817a == null || typedValueM1817a.type != 16) ? i8 : typedValueM1817a.data;
    }

    /* JADX INFO: renamed from: e */
    public static int m1821e(Context context) {
        return m1819c(context, AbstractC6742c.f26223H, AbstractC6744e.f26361o0);
    }

    /* JADX INFO: renamed from: f */
    public static int m1822f(Context context, int i7, String str) {
        return m1823g(context, i7, str).data;
    }

    /* JADX INFO: renamed from: g */
    public static TypedValue m1823g(Context context, int i7, String str) {
        TypedValue typedValueM1817a = m1817a(context, i7);
        if (typedValueM1817a != null) {
            return typedValueM1817a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }

    /* JADX INFO: renamed from: h */
    public static TypedValue m1824h(View view, int i7) {
        return m1823g(view.getContext(), i7, view.getClass().getCanonicalName());
    }
}
