package p240f0;

import android.text.Editable;
import androidx.emoji2.text.C2567o;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
final class C5389b extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    private static final Object f20531a = new Object();

    /* JADX INFO: renamed from: b */
    private static volatile Editable.Factory f20532b;

    /* JADX INFO: renamed from: c */
    private static Class f20533c;

    private C5389b() {
        try {
            f20533c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C5389b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f20532b == null) {
            synchronized (f20531a) {
                try {
                    if (f20532b == null) {
                        f20532b = new C5389b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20532b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f20533c;
        return cls != null ? C2567o.m11835c(cls, charSequence) : super.newEditable(charSequence);
    }
}
