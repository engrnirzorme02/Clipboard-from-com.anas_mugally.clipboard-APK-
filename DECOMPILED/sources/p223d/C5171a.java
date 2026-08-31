package p223d;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5171a {

    /* JADX INFO: renamed from: a */
    public static final C5171a f19771a = new C5171a();

    private C5171a() {
    }

    /* JADX INFO: renamed from: a */
    public final float m23953a(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: b */
    public final int m23954b(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: c */
    public final float m23955c(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: d */
    public final float m23956d(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
