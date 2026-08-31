package p017C;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: C.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0118s {

    /* JADX INFO: renamed from: a */
    private final boolean f660a;

    /* JADX INFO: renamed from: b */
    private Configuration f661b;

    public C0118s(boolean z7) {
        this.f660a = z7;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m565a() {
        return this.f660a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0118s(boolean z7, Configuration newConfig) {
        this(z7);
        AbstractC6118n.m27187e(newConfig, "newConfig");
        this.f661b = newConfig;
    }
}
