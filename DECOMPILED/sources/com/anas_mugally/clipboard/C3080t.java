package com.anas_mugally.clipboard;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3080t extends RecyclerView.AbstractC2770u {

    /* JADX INFO: renamed from: a */
    private final ExtendedFloatingActionButton f12733a;

    /* JADX INFO: renamed from: b */
    private final boolean f12734b;

    public C3080t(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z7) {
        this.f12733a = extendedFloatingActionButton;
        this.f12734b = z7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
    /* JADX INFO: renamed from: b */
    public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
        AbstractC6118n.m27187e(recyclerView, "recyclerView");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f12733a;
        if (extendedFloatingActionButton != null) {
            if (i8 > 0 && !AbstractC6118n.m27183a(extendedFloatingActionButton.getTag(), 1)) {
                if (this.f12734b) {
                    extendedFloatingActionButton.m20469P();
                } else {
                    extendedFloatingActionButton.m20467I();
                }
                extendedFloatingActionButton.setTag(1);
            } else if (i8 <= 0 && !AbstractC6118n.m27183a(extendedFloatingActionButton.getTag(), 2)) {
                if (this.f12734b) {
                    extendedFloatingActionButton.m20466G();
                } else {
                    extendedFloatingActionButton.m20468O();
                }
                extendedFloatingActionButton.setTag(2);
            }
        }
        super.mo13489b(recyclerView, i7, i8);
    }
}
