package p090L0;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: L0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0779b extends RecyclerView.AbstractC2749E {
    private C0779b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* JADX INFO: renamed from: Q */
    static C0779b m3698Q(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(AbstractC1030Z.m4475k());
        frameLayout.setSaveEnabled(false);
        return new C0779b(frameLayout);
    }

    /* JADX INFO: renamed from: R */
    FrameLayout m3699R() {
        return (FrameLayout) this.f10894a;
    }
}
