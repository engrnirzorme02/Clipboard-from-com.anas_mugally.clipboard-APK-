package p264i0;

import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: i0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5671l extends AbstractC5669j {

    /* JADX INFO: renamed from: b */
    private final AbstractComponentCallbacksC2591i f21670b;

    /* JADX INFO: renamed from: c */
    private final int f21671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5671l(AbstractComponentCallbacksC2591i fragment, AbstractComponentCallbacksC2591i expectedParentFragment, int i7) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i7 + " without using parent's childFragmentManager");
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(expectedParentFragment, "expectedParentFragment");
        this.f21670b = expectedParentFragment;
        this.f21671c = i7;
    }
}
