package p017C;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: C.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0108i {

    /* JADX INFO: renamed from: a */
    private final boolean f554a;

    /* JADX INFO: renamed from: b */
    private Configuration f555b;

    public C0108i(boolean z7) {
        this.f554a = z7;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m424a() {
        return this.f554a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0108i(boolean z7, Configuration newConfig) {
        this(z7);
        AbstractC6118n.m27187e(newConfig, "newConfig");
        this.f555b = newConfig;
    }
}
