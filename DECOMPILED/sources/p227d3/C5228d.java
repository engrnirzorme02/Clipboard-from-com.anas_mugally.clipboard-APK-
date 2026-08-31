package p227d3;

import android.content.Context;

/* JADX INFO: renamed from: d3.d */
/* JADX INFO: loaded from: classes.dex */
public class C5228d {

    /* JADX INFO: renamed from: b */
    private static final C5228d f19950b = new C5228d();

    /* JADX INFO: renamed from: a */
    private C5227c f19951a = null;

    /* JADX INFO: renamed from: a */
    public static C5227c m24155a(Context context) {
        return f19950b.m24156b(context);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C5227c m24156b(Context context) {
        try {
            if (this.f19951a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f19951a = new C5227c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19951a;
    }
}
