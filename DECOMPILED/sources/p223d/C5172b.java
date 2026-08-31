package p223d;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5172b {

    /* JADX INFO: renamed from: a */
    public static final C5172b f19772a = new C5172b();

    private C5172b() {
    }

    /* JADX INFO: renamed from: a */
    public final long m23957a(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        return backEvent.getFrameTimeMillis();
    }
}
