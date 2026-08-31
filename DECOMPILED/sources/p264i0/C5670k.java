package p264i0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: i0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5670k extends AbstractC5669j {

    /* JADX INFO: renamed from: b */
    private final ViewGroup f21669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5670k(AbstractComponentCallbacksC2591i fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(container, "container");
        this.f21669b = container;
    }
}
