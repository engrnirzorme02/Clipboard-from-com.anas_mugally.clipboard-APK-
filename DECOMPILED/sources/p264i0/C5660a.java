package p264i0;

import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5660a extends AbstractC5669j {

    /* JADX INFO: renamed from: b */
    private final String f21647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5660a(AbstractComponentCallbacksC2591i fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(previousFragmentId, "previousFragmentId");
        this.f21647b = previousFragmentId;
    }
}
