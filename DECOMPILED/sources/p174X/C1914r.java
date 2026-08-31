package p174X;

import com.google.android.gms.common.api.C3553a;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1914r extends AbstractC1889I {

    /* JADX INFO: renamed from: b */
    private final Throwable f6317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914r(Throwable finalException) {
        super(C3553a.e.API_PRIORITY_OTHER, null);
        AbstractC6118n.m27187e(finalException, "finalException");
        this.f6317b = finalException;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m7925b() {
        return this.f6317b;
    }
}
