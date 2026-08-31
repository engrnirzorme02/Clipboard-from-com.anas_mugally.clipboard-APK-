package p264i0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: i0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5663d extends AbstractC5669j {

    /* JADX INFO: renamed from: b */
    private final ViewGroup f21666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5663d(AbstractComponentCallbacksC2591i fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        AbstractC6118n.m27187e(fragment, "fragment");
        this.f21666b = viewGroup;
    }
}
