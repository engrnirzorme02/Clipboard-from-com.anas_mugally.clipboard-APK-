package p278j6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: j6.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5906h {
    /* JADX INFO: renamed from: a */
    public static final void m26653a(boolean z7, Number step) {
        AbstractC6118n.m27187e(step, "step");
        if (z7) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
