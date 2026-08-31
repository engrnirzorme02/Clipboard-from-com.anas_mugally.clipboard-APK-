package p264i0;

import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: i0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5669j extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final AbstractComponentCallbacksC2591i f21668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5669j(AbstractComponentCallbacksC2591i fragment, String str) {
        super(str);
        AbstractC6118n.m27187e(fragment, "fragment");
        this.f21668a = fragment;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC2591i m25194a() {
        return this.f21668a;
    }
}
