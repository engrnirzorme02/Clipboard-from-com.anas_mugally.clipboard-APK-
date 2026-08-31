package p346s0;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6944c {

    /* JADX INFO: renamed from: a */
    public static final C6944c f27898a = new C6944c();

    private C6944c() {
    }

    /* JADX INFO: renamed from: a */
    public final Object m30419a(Context context, String tag, InterfaceC5367l manager) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(tag, "tag");
        AbstractC6118n.m27187e(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + C6943b.f27895a.m30416b());
            return null;
        }
    }
}
